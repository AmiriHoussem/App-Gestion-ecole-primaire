/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.User;

import Entitées.User;
import Plus.Email;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Almia
 */
public class ModifierUser extends javax.swing.JFrame {

    /**
     * Creates new form ModifierUser
     */
    private String util;

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }
    
    public ModifierUser() {
        initComponents();     
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jLabel3.setVisible(false);jLabel4.setVisible(false);jLabel7.setVisible(false);jLabel8.setVisible(false);jLabel10.setVisible(false);jLabel11.setVisible(false);
    }
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLOGIN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        eleve = new javax.swing.JCheckBox();
        note = new javax.swing.JCheckBox();
        absence = new javax.swing.JCheckBox();
        conseil = new javax.swing.JCheckBox();
        parametre = new javax.swing.JCheckBox();
        instituteur = new javax.swing.JCheckBox();
        salle = new javax.swing.JCheckBox();
        classe = new javax.swing.JCheckBox();
        emplois = new javax.swing.JCheckBox();
        jButtonANNULER = new javax.swing.JButton();
        jButtonREINITIALISER = new javax.swing.JButton();
        jButtonENREGISTRER = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Informations Utilisateur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Erreur,champ vide");

        jLabel1.setText("Login *");

        jLabel2.setText("Password *");

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Erreur,champ vide");

        jLabel5.setText("Nom *");

        jLabel6.setText("Prenom *");

        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Erreur,champ vide");

        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Erreur,champ vide");

        jLabel9.setText("E-mail *");

        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldLOGIN, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jPasswordField1)
                    .addComponent(jTextFieldNom)
                    .addComponent(jTextFieldPrenom)
                    .addComponent(jTextFieldEmail))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Acces Utilisateur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        eleve.setText("Gestion des élèves");

        note.setText("Gestion de Note");

        absence.setText("Gestion des Absences");

        conseil.setText("Gestion du Conseil et des PV");

        parametre.setText("Parametres");

        instituteur.setText("Gestion Instituteurs");

        salle.setText("Gestion des Salles");

        classe.setText("Gestion des Classes");

        emplois.setText("Gestion des Emplois de Temps");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parametre)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eleve)
                            .addComponent(absence)
                            .addComponent(note)
                            .addComponent(salle))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classe)
                            .addComponent(instituteur)
                            .addComponent(emplois)
                            .addComponent(conseil, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eleve)
                    .addComponent(instituteur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salle)
                    .addComponent(classe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(absence)
                    .addComponent(emplois))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(note)
                    .addComponent(conseil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parametre)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jButtonANNULER.setText("Annuler");
        jButtonANNULER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANNULERActionPerformed(evt);
            }
        });

        jButtonREINITIALISER.setText("Réinitialiser");
        jButtonREINITIALISER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREINITIALISERActionPerformed(evt);
            }
        });

        jButtonENREGISTRER.setText("Enregistrer");
        jButtonENREGISTRER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonENREGISTRERActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("L'utilisateur doit avoir au moins un acces");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonANNULER)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonREINITIALISER)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonENREGISTRER))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonENREGISTRER)
                    .addComponent(jButtonREINITIALISER)
                    .addComponent(jButtonANNULER))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonANNULERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonANNULERActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment Quitter ?","Attention",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_jButtonANNULERActionPerformed

    private void jButtonREINITIALISERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREINITIALISERActionPerformed
        // TODO add your handling code here:
        jLabel3.setVisible(false);jLabel4.setVisible(false);
        jPasswordField1.setText("");
        jTextFieldLOGIN.setText("");
        jTextFieldNom.setText("");
        jTextFieldPrenom.setText("");
        jTextFieldEmail.setText("");
        instituteur.setSelected(false);
        conseil.setSelected(false);
        absence.setSelected(false);
        classe.setSelected(false);
        eleve.setSelected(false);
        emplois.setSelected(false);
        note.setSelected(false);
        salle.setSelected(false);
        parametre.setSelected(false);
    }//GEN-LAST:event_jButtonREINITIALISERActionPerformed

    private void jButtonENREGISTRERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonENREGISTRERActionPerformed
        // TODO add your handling code here:
        if(jTextFieldLOGIN.getText().equals("")){
            jLabel3.setVisible(true);
        }
        else jLabel3.setVisible(false);
        if(jPasswordField1.getText().equals(""))
            jLabel4.setVisible(true);
        else jLabel4.setVisible(false);
        if(jTextFieldNom.getText().equals("")){
            jLabel7.setVisible(true);
        }
        else jLabel7.setVisible(false);
        if(jTextFieldPrenom.getText().equals("")){
            jLabel8.setVisible(true);
        }
        else jLabel8.setVisible(false);
        if((jTextFieldEmail.getText()).equals("")){
            jLabel10.setText("Erreur,champ vide");
            jLabel10.setVisible(true);
        }
        else if(!Email.isValidEmailAddress(jTextFieldEmail.getText())){
            jLabel10.setText("E-mail invalide");
            jLabel10.setVisible(true);}
        else jLabel10.setVisible(false);
        
        String Permission="" ;
            if(eleve.isSelected())
            Permission=Permission+"1";
            if(instituteur.isSelected())
            Permission=Permission+"2";
            if(salle.isSelected())
            Permission=Permission+"3";
            if(classe.isSelected())
            Permission=Permission+"4";
            if(emplois.isSelected())
            Permission=Permission+"5";
            if(absence.isSelected())
            Permission=Permission+"6";
            if(note.isSelected())
            Permission=Permission+"7";
            if(conseil.isSelected())
            Permission=Permission+"8";
            if(parametre.isSelected())
            Permission=Permission+"9";
            
        if(Permission.equals(""))
            jLabel11.setVisible(true);
        else jLabel11.setVisible(false);

        if(jLabel3.isVisible()==false && jLabel4.isVisible()==false && jLabel7.isVisible()==false && jLabel8.isVisible()==false && jLabel10.isVisible()==false && jLabel11.isVisible()==false){
            User e;
            e = new User();
            e.setUsername(jTextFieldLOGIN.getText());
            e.setPassword(jPasswordField1.getText());
            e.setNom(jTextFieldNom.getText());
            e.setPrenom(jTextFieldPrenom.getText());
            e.setEmail(jTextFieldEmail.getText());
            e.setAcces(Permission);
                if(e.ModifierUser(util)){
                    JOptionPane.showMessageDialog(null, "L'utilisateur a été modifié avec succes!");
                    dispose();
                    InterfacePrincipaleUser.updateTableUser();

                }
                else JOptionPane.showMessageDialog(null, "Echec de modification de l'utilisateur!");
        }
    }//GEN-LAST:event_jButtonENREGISTRERActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifierUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierUser().setVisible(true);
            }
        });
    }

    public JCheckBox getAbsence() {
        return absence;
    }

    public JCheckBox getClasse() {
        return classe;
    }

    public JCheckBox getConseil() {
        return conseil;
    }

    public JCheckBox getEleve() {
        return eleve;
    }

    public JCheckBox getEmplois() {
        return emplois;
    }

    public JCheckBox getInstituteur() {
        return instituteur;
    }

    public JTextField getjTextFieldLOGIN() {
        return jTextFieldLOGIN;
    }

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public JCheckBox getNote() {
        return note;
    }
    
    public JCheckBox getParametre() {
        return parametre;
    }

    public JCheckBox getSalle() {
        return salle;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public JTextField getjTextFieldNom() {
        return jTextFieldNom;
    }

    public JTextField getjTextFieldPrenom() {
        return jTextFieldPrenom;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox absence;
    private javax.swing.JCheckBox classe;
    private javax.swing.JCheckBox conseil;
    private javax.swing.JCheckBox eleve;
    private javax.swing.JCheckBox emplois;
    private javax.swing.JCheckBox instituteur;
    private javax.swing.JButton jButtonANNULER;
    private javax.swing.JButton jButtonENREGISTRER;
    private javax.swing.JButton jButtonREINITIALISER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLOGIN;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JCheckBox note;
    private javax.swing.JCheckBox parametre;
    private javax.swing.JCheckBox salle;
    // End of variables declaration//GEN-END:variables
}
