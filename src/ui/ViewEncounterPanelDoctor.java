/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.SystemAdmin;

/**
 *
 * @author aniruddha
 */
public class ViewEncounterPanelDoctor extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncounterPanelDoctor
     */
    SystemAdmin sysAdmin;
    Doctor d;
    public ViewEncounterPanelDoctor(SystemAdmin sysAdmin,Doctor d) {
        initComponents();
        this.sysAdmin = sysAdmin;
        this.d = d;
        populatePatients();
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

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncounters = new javax.swing.JTable();
        txtEncounterId = new javax.swing.JTextField();
        btnViewEncounters = new javax.swing.JButton();
        btnUpdateEncounters = new javax.swing.JButton();
        btnAddEncounter = new javax.swing.JButton();
        txtEncounterDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxPatient = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setText("Encounter Id");

        tblEncounters.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Encounter Id", "Doctor", "Patient", "Date of Visit"
            }
        ));
        jScrollPane1.setViewportView(tblEncounters);

        btnViewEncounters.setText("View Encounter");
        btnViewEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEncountersActionPerformed(evt);
            }
        });

        btnUpdateEncounters.setText("Update Encounter");
        btnUpdateEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEncountersActionPerformed(evt);
            }
        });

        btnAddEncounter.setText("Add Encounter");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient");

        jLabel1.setText("View Encounters");

        jLabel4.setText("Date of Encounter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViewEncounters)
                .addGap(37, 37, 37)
                .addComponent(btnUpdateEncounters)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEncounterDate, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(txtEncounterId)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnAddEncounter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewEncounters)
                    .addComponent(btnUpdateEncounters))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEncounterId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(114, 114, 114)
                .addComponent(btnAddEncounter)
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEncountersActionPerformed
        // TODO add your handling code here:

        int selectedrowIndex = tblEncounters.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        Encounter e = (Encounter) model.getValueAt(selectedrowIndex, 0);
        txtEncounterId.setText(e.getEncounterId());
        txtEncounterId.setEditable(false);
        jComboBoxPatient.setSelectedItem(e.getPatient());
        jComboBoxPatient.setEditable(false);
        txtEncounterDate.setText(e.getDate());
        txtEncounterDate.setEditable(false);

    }//GEN-LAST:event_btnViewEncountersActionPerformed

    private void btnUpdateEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEncountersActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblEncounters.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        Encounter e = (Encounter) model.getValueAt(selectedrowIndex, 0);
        txtEncounterId.setText(e.getEncounterId());
        txtEncounterId.setEditable(false);
        
        jComboBoxPatient.setSelectedItem(e.getPatient());
        jComboBoxPatient.setEditable(true);
        txtEncounterDate.setText(e.getDate());
        txtEncounterDate.setEditable(true);
    }//GEN-LAST:event_btnUpdateEncountersActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
        // TODO add your handling code here:
        /*
        Community c = (Community) jComboBoxHospitalCommunity.getSelectedItem();
        if(c==null || txtHospitalName.getText().length()==0 || txtHospitalPhone.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        Hospital h = sysAdmin.getHospitalDirectory().getHospital(txtHospitalId.getText());
        h.setHospitalName(String.valueOf(txtHospitalName.getText()));
        h.setPhoneNumber(String.valueOf(txtHospitalPhone.getText()));

        JOptionPane.showMessageDialog(this, "Hospital Info Updated");

        txtHospitalId.setText("");
        txtHospitalName.setText("");
        txtHospitalPhone.setText("");
        jComboBoxHospitalCommunity.setSelectedItem(null);
        populateTable();
        */
        
        Patient p = (Patient)jComboBoxPatient.getSelectedItem();
        if(d==null || p==null || txtEncounterDate.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        String date = txtEncounterDate.getText();
        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern datePattern = Pattern.compile(dateRegex);
        Matcher matcher = datePattern.matcher(date);
        if(matcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Encounter Date: MM/DD/YYYY");
            return;
        }

        Encounter e = sysAdmin.getEncounterHistory().getEncounter(txtEncounterId.getText());
        e.setDoctor(d);
        e.setPatient(p);
        e.setDate(date);

        JOptionPane.showMessageDialog(this, "Encounter Info Updated");

        
        jComboBoxPatient.setSelectedItem(null);
        txtEncounterDate.setText("null");

        populateTable();
    }//GEN-LAST:event_btnAddEncounterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnUpdateEncounters;
    private javax.swing.JButton btnViewEncounters;
    private javax.swing.JComboBox<Object> jComboBoxPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEncounters;
    private javax.swing.JTextField txtEncounterDate;
    private javax.swing.JTextField txtEncounterId;
    // End of variables declaration//GEN-END:variables

    private void populatePatients() {
        PatientDirectory patient = sysAdmin.getPatientDirectory();
        List<Patient> pl = patient.getPatientDirectory();
        for(Patient p : pl){
            jComboBoxPatient.addItem(p);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEncounters.getModel();
        model.setRowCount(0);
        EncounterHistory eh = sysAdmin.getEncounterHistory();
        List<Encounter> el = eh.getEncounterHistory();
        for(Encounter e : el){
            if(e.getDoctor().getDoctorId().equals(d.getDoctorId())){
                Object[] row = new Object[4];
                row[0] = e;
                row[1] = e.getDoctor();
                row[2] = e.getPatient();
                row[3] = e.getDate();
                model.addRow(row);
            }
            
        }
    }
}
