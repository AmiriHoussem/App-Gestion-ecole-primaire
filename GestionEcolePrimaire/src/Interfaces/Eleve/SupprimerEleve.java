/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Eleve;

import Plus.Conversion;
import Entitées.Eleve;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Almia
 */
public class SupprimerEleve extends javax.swing.JFrame {

    /**
     * Creates new form SupprimerEleve
     */
    public SupprimerEleve() {       
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        jButtonCONFIRMER = new javax.swing.JButton();
        jButtonANNULER = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNOM = new javax.swing.JTextField();
        jTextFieldPRENOM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Voulez-vous vraiment supprimer cet élève?");

        jButtonCONFIRMER.setText("Confirmer");
        jButtonCONFIRMER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCONFIRMERActionPerformed(evt);
            }
        });

        jButtonANNULER.setText("Annuler");
        jButtonANNULER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonANNULERActionPerformed(evt);
            }
        });

        jLabel2.setText("Nom       :");

        jLabel4.setText("Prenom  :");

        jTextFieldNOM.setEditable(false);

        jTextFieldPRENOM.setEditable(false);

        jLabel3.setText("Id           :");

        jTextFieldID.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonANNULER)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonCONFIRMER)
                            .addGap(57, 57, 57))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPRENOM, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNOM)
                                    .addComponent(jTextFieldID)))
                            .addComponent(jLabel3)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPRENOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonANNULER)
                    .addComponent(jButtonCONFIRMER))
                .addGap(37, 37, 37))
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
  
    private void jButtonCONFIRMERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCONFIRMERActionPerformed
        // TODO add your handling code here:
        Eleve i=new Eleve();
        if(i.SupprimerEleve(Conversion.StringtoInt(this.jTextFieldID.getText()))){
                JOptionPane.showMessageDialog(null, "L'Eleve a été supprimé avec succes!");
                dispose();
                /*if(Eleve.AfficherEleves()!=null) */      
                InterfacePrincipaleEleve.updateTableEl();
               /* else viderTableEl();*/
                
            }
            else JOptionPane.showMessageDialog(null, "Echec de suppression d'Eleve!");
    }//GEN-LAST:event_jButtonCONFIRMERActionPerformed

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
            java.util.logging.Logger.getLogger(SupprimerEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupprimerEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupprimerEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupprimerEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SupprimerEleve().setVisible(true);
        });
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public JTextField getjTextFieldNOM() {
        return jTextFieldNOM;
    }

    public JTextField getjTextFieldPRENOM() {
        return jTextFieldPRENOM;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonANNULER;
    private javax.swing.JButton jButtonCONFIRMER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNOM;
    private javax.swing.JTextField jTextFieldPRENOM;
    // End of variables declaration//GEN-END:variables
}
