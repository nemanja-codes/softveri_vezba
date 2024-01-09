/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import java.util.ArrayList;
import java.util.List;
import model.Knjiga;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Autor;
import model.Zanr;

/**
 *
 * @author necam
 */
public class DBBroker {

    public List<Knjiga> ucitajListuKnjigaIzBaze() {
         List<Knjiga> lista = new ArrayList<>();
        try {
           
            String upit = "SELECT * FROM KNJIGA K JOIN AUTOR A ON k.autorId = a.id";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()) {
                int id = rs.getInt("k.id");
                String naslov = rs.getString("k.naslov");
                int godIz = rs.getInt("k.godinaIzdanja");
                String ISBN = rs.getString("k.ISBN");
                String zanr = rs.getString("k.zanr");
                 System.out.println(zanr);
                Zanr z = Zanr.valueOf(zanr);
                  int idA = rs.getInt("a.id");
                String ime = rs.getString("a.ime");
                 String prezime = rs.getString("a.prezime");
                String biografija = rs.getString("a.biografija");
                 int godR = rs.getInt("a.godinaRodjenja");
                Autor a = new Autor(idA, ime, prezime, godR, biografija);
                
               Knjiga k = new Knjiga(id, naslov, a, ISBN, godIz, z);
               
               lista.add(k);
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return lista;
    }

    public List<Autor> ucitajListuAutoraIzBaze() {
        List<Autor> lista = new ArrayList<>();
        try {
           
            String upit = "SELECT * FROM AUTOR a";
            Statement st = Konekcija.getInstance().getConnection().createStatement();
            ResultSet rs = st.executeQuery(upit);
            while(rs.next()) {
              
                  int idA = rs.getInt("a.id");
                String ime = rs.getString("a.ime");
                 String prezime = rs.getString("a.prezime");
                String biografija = rs.getString("a.biografija");
                 int godR = rs.getInt("a.godinaRodjenja");
                Autor a = new Autor(idA, ime, prezime, godR, biografija);
                
               
               lista.add(a);
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return lista;
    }

    public void obrisiKnjigu(int id) {
        try {
            String upit = "DELETE FROM KNJIGA WHERE id = ?";
            
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void dodajKnjigu(Knjiga novaKnjiga) {
        try {
            String upit = "INSERT INTO knjiga(id, naslov, autorId, ISBN, godinaIzdanja, zanr) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, novaKnjiga.getId());
            ps.setString(2, novaKnjiga.getNaslov());
            ps.setInt(3, novaKnjiga.getAutor().getId());
            ps.setString(4, novaKnjiga.getISBN());
            ps.setInt(5, novaKnjiga.getGodinaIzdanja());
            ps.setString(6, String.valueOf(novaKnjiga.getZanr()));
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void azurirajKnjigu(Knjiga knjigaZaIzmenu) {
        try {
            String upit = "UPDATE KNJIGA SET naslov = ?, autorId = ?, godinaIzdanja = ?, zanr = ? WHERE id = ?";
            PreparedStatement ps = Konekcija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, knjigaZaIzmenu.getNaslov());
            ps.setInt(2, knjigaZaIzmenu.getAutor().getId());
            ps.setInt(3, knjigaZaIzmenu.getGodinaIzdanja());
            ps.setString(4, String.valueOf(knjigaZaIzmenu.getZanr()));
            ps.setInt(5, knjigaZaIzmenu.getId());
            
            ps.executeUpdate();
            Konekcija.getInstance().getConnection().commit();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
