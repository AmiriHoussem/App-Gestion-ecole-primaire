/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Classe;

import Plus.Conversion;
import Entitées.Classe;
import Entitées.Eleve;
import Interfaces.Absence.InterfacePrincipaleAbsence;
import Interfaces.Emplois.InterfacePrincipaleEmplois;
import Interfaces.Note.InterfacePrincipaleNote;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Almia
 */
public class ModifierClasse extends javax.swing.JFrame {

    /**
     * Creates new form ModifierClasse
     */
    public ModifierClasse() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);          
         jLabel4.setVisible(false);jLabel3.setVisible(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNOM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNIVEAU = new javax.swing.JTextField();
        jButtonQUITTER = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLISTE = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButtonEnrListeEleve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Information Classe"));

        jLabel2.setText("Niveau :");

        jLabel1.setText("Nom de la Classe :");

        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Erreur, champ vide");

        jTextFieldID.setEditable(false);

        jLabel7.setText("Id:");

        jTextFieldNIVEAU.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNIVEAU, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNIVEAU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButtonQUITTER.setText("Quitter");
        jButtonQUITTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQUITTERActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Veuillez-choisir les élèves"));

        jTableLISTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "ID", "NOM", "PRENOM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLISTE);

        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("Veuillez-indiquer les élèves de la classe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jButtonEnrListeEleve.setText("Enregistrer la classe");
        jButtonEnrListeEleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnrListeEleveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButtonQUITTER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEnrListeEleve)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnrListeEleve)
                    .addComponent(jButtonQUITTER))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQUITTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQUITTERActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment Quitter ?","Attention",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_jButtonQUITTERActionPerformed

    private void jButtonEnrListeEleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnrListeEleveActionPerformed
        // TODO add your handling code here:
        if(jTextFieldNOM.getText().equals("")){
            jLabel4.setText("Erreur, champ vide");
            jLabel4.setVisible(true);
        }else if(Classe.ChargerClasseParNom(jTextFieldNOM.getText()).getNom()!=null && Classe.ChargerClasse(Conversion.StringtoInt(jTextFieldID.getText())).getNom()==jTextFieldNOM.getText() ){
            jLabel4.setText("Nom invalide");
            jLabel4.setVisible(true);
            JOptionPane.showMessageDialog(null, "Une Classe avec le meme nom existe!");
        }else if(jTextFieldNOM.getText().equals(jTextFieldNIVEAU.getText()+"-")){
            jLabel4.setText("Erreur, nom incomplet");
            jLabel4.setVisible(true);
        }
        else jLabel4.setVisible(false);
        if(jLabel4.isVisible()==false){
            Classe x=new Classe();
            x.setNiveau(jTextFieldNIVEAU.getText());
            x.setNom(jTextFieldNOM.getText());
            if(x.ModifierClasse(Conversion.StringtoInt(jTextFieldID.getText()))){
                Classe c=Classe.ChargerClasseParNom(jTextFieldNOM.getText());
                Eleve[] el=new Eleve[30];
                c.suppElevesClasse(c.getId());
                int i=jTableLISTE.getRowCount();
                Boolean e;
                int j=0;
                int nvE=0;
                while(j<i)
                {e=(Boolean) jTableLISTE.getValueAt(j,0);
                try{
                if(e){
                    el[nvE]=Eleve.ChargerEleve((int)jTableLISTE.getValueAt(j, 1));
                    j++;
                    nvE++;}
                else {
                    j++;
                }}
                catch(NullPointerException exc){
                    System.out.println(exc);}
                }
                c.setListe(el);
                for(int kk=0;kk<el.length;kk++)
                  if(el[kk]!=null)
                c.AjouterEleveClasse(el[kk].getId());
                JOptionPane.showMessageDialog(null, "La classe a été modifié avec succes!");
                dispose();
                InterfacePrincipaleClasse.updateTableCl();
                InterfacePrincipaleEmplois.updateEmplois();
                InterfacePrincipaleAbsence.updateTableAb();
                InterfacePrincipaleNote.updateNote();

            }
            else JOptionPane.showMessageDialog(null, "Echec de modification de la classe!");}
        
        
        
        
        
    }//GEN-LAST:event_jButtonEnrListeEleveActionPerformed

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
            java.util.logging.Logger.getLogger(ModifierClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierClasse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifierClasse().setVisible(true);
            }
        });
    }

    public JTable getjTableLISTE() {
        return jTableLISTE;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public JTextField getjTextFieldNIVEAU() {
        return jTextFieldNIVEAU;
    }

    public JTextField getjTextFieldNOM() {
        return jTextFieldNOM;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnrListeEleve;
    private javax.swing.JButton jButtonQUITTER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLISTE;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNIVEAU;
    private javax.swing.JTextField jTextFieldNOM;
    // End of variables declaration//GEN-END:variables
}