/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package forme;

import controller.Controller;
import model.Autor;
import java.util.List;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Knjiga;
import model.Zanr;

/**
 *
 * @author necam
 */
public class FormaKnjiga extends javax.swing.JDialog {
    private Controller kontroler;
    private GlavnaForma gf;
    private Knjiga knjigaZaIzmenu;
    /**
     * Creates new form FormaKnjiga
     */
    public FormaKnjiga(java.awt.Frame parent, boolean modal, Knjiga knjigazaizmenu) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        kontroler = Controller.getInstance();
        this.gf = (GlavnaForma) parent;
        popuniComboBoxAutorima();
        if(knjigazaizmenu != null) {
            this.knjigaZaIzmenu = knjigazaizmenu;
            jTextFieldNaziv.setText(knjigazaizmenu.getNaslov());
            jComboBoxAutori.setSelectedItem(knjigazaizmenu.getAutor());
            jTextFieldISBN.setText(knjigazaizmenu.getISBN());
            jTextFieldISBN.setEnabled(false);
            jComboBoxZanr.setSelectedItem(knjigazaizmenu.getZanr());
            jTextFieldGodina.setText(String.valueOf(knjigazaizmenu.getGodinaIzdanja()));
            jButtonDodaj.setVisible(false);
           
        } else {
            jButtonIzmeni.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldGodina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxAutori = new javax.swing.JComboBox<>();
        jButtonDodaj = new javax.swing.JButton();
        jButtonOdustani = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxZanr = new javax.swing.JComboBox<>();
        jButtonIzmeni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv:");

        jLabel2.setText("ISBN:");

        jTextFieldISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBNActionPerformed(evt);
            }
        });

        jLabel3.setText("Godina izdanja:");

        jTextFieldGodina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGodinaActionPerformed(evt);
            }
        });

        jLabel4.setText("Autor:");

        jButtonDodaj.setText("DODAJ");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        jButtonOdustani.setText("Odustani");
        jButtonOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOdustaniActionPerformed(evt);
            }
        });

        jLabel5.setText("Zanr:");

        jComboBoxZanr.setModel(new DefaultComboBoxModel(Zanr.values()));

        jButtonIzmeni.setText("IZMENI");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNaziv))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldISBN))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonOdustani)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jComboBoxAutori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonIzmeni, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxAutori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDodaj)
                    .addComponent(jButtonIzmeni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButtonOdustani)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBNActionPerformed

    private void jTextFieldGodinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGodinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldGodinaActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        String naziv = jTextFieldNaziv.getText();
        if(naziv == null || naziv.isEmpty() || naziv.length() < 3) {
            JOptionPane.showMessageDialog(this, "Greska, pogresan naziv!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String isbn = jTextFieldISBN.getText();
        int godinaIzdanja;
        try {
        godinaIzdanja = Integer.parseInt(jTextFieldGodina.getText());
        if(godinaIzdanja < 1800 || godinaIzdanja > 2023) {
            JOptionPane.showMessageDialog(this, "Greska, pogresna godina!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Godina izdanja mora biti broj!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Zanr zanr = (Zanr) jComboBoxZanr.getSelectedItem();
        Autor autor = (Autor) jComboBoxAutori.getSelectedItem();
        Random r = new Random();
        int id = 101 + r.nextInt(Integer.MAX_VALUE - 100);
        Knjiga novaKnjiga = new Knjiga(id,naziv, autor, isbn, godinaIzdanja, zanr);
        
        kontroler.dodajKnjigu(novaKnjiga);
        gf.osveziTabelu();
        JOptionPane.showMessageDialog(this, "Knjiga je uspesno dodata!", "Uspesno", JOptionPane.INFORMATION_MESSAGE);
        
        this.dispose();
    }//GEN-LAST:event_jButtonDodajActionPerformed

    private void jButtonOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOdustaniActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonOdustaniActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
        String naziv = jTextFieldNaziv.getText();
        int godinaIzdanja;
        try {
        godinaIzdanja = Integer.parseInt(jTextFieldGodina.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Godina izdanja mora biti broj!", "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Zanr zanr = (Zanr) jComboBoxZanr.getSelectedItem();
        Autor autor = (Autor) jComboBoxAutori.getSelectedItem();
        
        knjigaZaIzmenu.setNaslov(naziv);
        knjigaZaIzmenu.setAutor(autor);
        knjigaZaIzmenu.setGodinaIzdanja(godinaIzdanja);
        knjigaZaIzmenu.setZanr(zanr);
        
        kontroler.azurirajKnjigu(knjigaZaIzmenu);
        
        gf.osveziTabelu();
        JOptionPane.showMessageDialog(this, "Knjiga je uspesno izmenjena!", "Uspesno", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
       
    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                FormaKnjiga dialog = new FormaKnjiga(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonOdustani;
    private javax.swing.JComboBox<Autor> jComboBoxAutori;
    private javax.swing.JComboBox<String> jComboBoxZanr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldGodina;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    private void popuniComboBoxAutorima() {
        jComboBoxAutori.removeAllItems();
        List<Autor> autori = Controller.getInstance().ucitajListuAutoraIzBaze();
        for (Autor autor : autori) {
            jComboBoxAutori.addItem(autor);
        }
    }
}
