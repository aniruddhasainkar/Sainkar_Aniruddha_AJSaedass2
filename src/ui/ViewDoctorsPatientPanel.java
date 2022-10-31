/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Doctor;
import model.DoctorDirectory;
import model.Patient;
import model.SystemAdmin;

/**
 *
 * @author aniruddha
 */
public class ViewDoctorsPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorsPatientPanel
     */
    SystemAdmin sysAdmin;
    Patient p;
    public ViewDoctorsPatientPanel(SystemAdmin sysAdmin,Patient p) {
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
        tblDoctorsList = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("View Doctors Near You");

        tblDoctorsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor", "Hospital", "Community", "Speciality"
            }
        ));
        jScrollPane1.setViewportView(tblDoctorsList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDoctorsList;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDoctorsList.getModel();
        model.setRowCount(0);
        Community patientCommunity = p.getAddress().getCommunity();
        DoctorDirectory dd = sysAdmin.getDoctorDirectory();
        List<Doctor> dl = dd.getDoctorDirectory();
        for(Doctor d : dl){
            if(d.getHospital().getCommunity().getCommunityId().equals(patientCommunity.getCommunityId())){
                Object[] row = new Object[4];
                row[0] = d;
                row[1] = d.getHospital();
                row[2] = d.getHospital().getCommunity();
                row[3] = d.getSpecialization();
                model.addRow(row);
            }
        }
        
        
    }
}
