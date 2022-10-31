/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.SystemAdmin;

/**
 *
 * @author aniruddha
 */
public class CheckEncounterPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckEncounterPatientPanel
     */
    SystemAdmin sysAdmin;
    Patient p;
    public CheckEncounterPatientPanel(SystemAdmin sysAdmin,Patient p) {
        initComponents();
        this.sysAdmin = sysAdmin;
        this.p = p;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();

        jLabel1.setText("Check Encounter");

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EncounterID", "Patient", "Doctor", "Date of Visit"
            }
        ));
        jScrollPane1.setViewportView(tblEncounters);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncounters;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        EncounterHistory eh = sysAdmin.getEncounterHistory();
        List<Encounter> el = eh.getEncounterHistory();
        for(Encounter e : el){
            if(e.getPatient().getPatientId().equals(p.getPatientId())){
                Object[] row = new Object[4];
                row[0] = e;
                row[1] = e.getPatient();
                row[2] = e.getDoctor();
                row[3] = e.getDate();
                model.addRow(row);
            }
            
        }
    }
}
