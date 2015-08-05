/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aion.main.presentation.generic;

import java.io.File;
import javax.swing.DefaultListModel;

/**
 *
 * @author Fanaen
 */
public class ExperienceExistingListPanel extends BuilderPanel {

    /**
     * Creates new form ExperienceExistingListPanel
     */
    public ExperienceExistingListPanel() {
        initComponents();
        
        // -- Base directory --
        File directory = new File("Data");
        if(!directory.exists() || !directory.isDirectory()) return;
        
        // -- List initialisation --
        DefaultListModel listModel = new DefaultListModel();
        
        File[] subfiles = directory.listFiles();
        for(int i=0 ; i<subfiles.length; i++) {
            listModel.addElement(subfiles[i].getName());
        }
        
        experienceList.setModel(listModel);
        experienceList.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        experienceList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(experienceList);

        jLabel2.setText("Choisissez parmis les expériences suivantes :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList experienceList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onNext() {
        VersionListPanel panel = new VersionListPanel((String) experienceList.getSelectedValue());
        nextPanel(panel);
    }

    
}
