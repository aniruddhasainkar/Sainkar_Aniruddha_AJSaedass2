/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Doctor;
import model.Hospital;
import model.HospitalDirectory;
import model.SystemAdmin;

/**
 *
 * @author aniruddha
 */
public class CreateDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorPanel
     */
    SystemAdmin sysAdmin;
    public CreateDoctorPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateHospitals();
        
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
        lblDoctorPassword = new javax.swing.JLabel();
        txtDoctorUsername = new javax.swing.JTextField();
        lblDoctorPhoneNumber = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        lblDoctorEmailAddress = new javax.swing.JLabel();
        btnSaveDoctor = new javax.swing.JButton();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorAge = new javax.swing.JTextField();
        txtDoctorGender = new javax.swing.JTextField();
        txtDoctorPhoneNumber = new javax.swing.JTextField();
        txtDoctorEmailAddress = new javax.swing.JTextField();
        lblpersonalDetails = new javax.swing.JLabel();
        lbDoctorName = new javax.swing.JLabel();
        lblDoctorAge = new javax.swing.JLabel();
        lblDoctorGender = new javax.swing.JLabel();
        lblPatientLoginDetails = new javax.swing.JLabel();
        lblDoctorUsername = new javax.swing.JLabel();
        lblContactDetails = new javax.swing.JLabel();
        lblDoctorHouse = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDoctorOccupation = new javax.swing.JTextField();
        jComboBoxDoctorHospital = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDoctorExperience = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorSpecialisation = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Add Doctor");

        lblDoctorPassword.setText("Password");

        lblDoctorPhoneNumber.setText("Phone Number");

        lblDoctorEmailAddress.setText("Email Address");

        btnSaveDoctor.setText("Save Doctor");
        btnSaveDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDoctorActionPerformed(evt);
            }
        });

        txtDoctorPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPhoneNumberActionPerformed(evt);
            }
        });

        lblpersonalDetails.setText("Personal Details");

        lbDoctorName.setText("Name");

        lblDoctorAge.setText("Age");

        lblDoctorGender.setText("Gender");

        lblPatientLoginDetails.setText("Login Details");

        lblDoctorUsername.setText("Username");

        lblContactDetails.setText("Contact Details");

        lblDoctorHouse.setText("Hospital");

        jLabel3.setText("Occupation");

        jLabel2.setText("Experience");

        jLabel4.setText("Specialisation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpersonalDetails, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDoctorName)
                                    .addComponent(lblDoctorAge)
                                    .addComponent(jLabel3)
                                    .addComponent(lblDoctorGender)
                                    .addComponent(lblDoctorHouse)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDoctorAge)
                                    .addComponent(txtDoctorGender)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDoctorHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDoctorExperience)
                                    .addComponent(txtDoctorOccupation)
                                    .addComponent(txtDoctorSpecialisation))
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDoctorPassword)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDoctorPassword))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDoctorUsername)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDoctorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                                    .addComponent(btnSaveDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(lblPatientLoginDetails)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDoctorEmailAddress)
                                    .addComponent(lblDoctorPhoneNumber))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpersonalDetails)
                            .addComponent(lblPatientLoginDetails))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDoctorName)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorUsername)
                            .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorPassword)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDoctorAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDoctorAge)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorGender)
                    .addComponent(txtDoctorGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctorHouse)
                            .addComponent(jComboBoxDoctorHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnSaveDoctor)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDoctorOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDoctorExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addComponent(txtDoctorSpecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(lblContactDetails)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorPhoneNumber))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorEmailAddress))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDoctorActionPerformed
        // TODO add your handling code here:
        
       
        
        if(jComboBoxDoctorHospital.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Select Hospital");
            return;
        }
        Hospital hospital = (Hospital)jComboBoxDoctorHospital.getSelectedItem();
        
        String doctorId = String.valueOf(sysAdmin.getDoctorDirectory().doctorCount() + Integer.parseInt("1000000"));
        String doctorName = txtDoctorName.getText();
        int doctorAge,doctorExperience;
        String doctorGender = txtDoctorGender.getText();
        String doctorOccupation = txtDoctorOccupation.getText();
        
        String specialisation = txtDoctorSpecialisation.getText();
        String doctorEmail = txtDoctorEmailAddress.getText();
        String doctorPhone = txtDoctorPhoneNumber.getText();
        String username = txtDoctorUsername.getText();
        String password = txtDoctorPassword.getText();
        
        if(doctorName.length()==0 || doctorGender.length()==0 || doctorOccupation.length()==0 || specialisation.length()==0 || doctorEmail.length()==0 ||
                doctorPhone.length()==0 || username.length()==0 || password.length()==0){
            JOptionPane.showMessageDialog(this, "Enter All Fields");
            return;
        }
        try{
            doctorAge = Integer.parseInt(txtDoctorAge.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Age");
            return;
        }
        
        try{
            doctorExperience = Integer.parseInt(txtDoctorExperience.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Enter Valid Experience");
            return;
        }
        
        String emailRegex = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailmatcher = emailPattern.matcher(doctorEmail);
        if(emailmatcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Email");
            return;
        }
        if(doctorPhone.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
            return;
        }
        Doctor d = sysAdmin.getDoctorDirectory().addDoctor();
        d.setDoctorId(doctorId);
        d.setDoctorName(doctorName);
        d.setAge(doctorAge);
        d.setExperience(doctorExperience);
        d.setGender(doctorGender);
        d.setOccupation(doctorOccupation);
        d.setSpecialization(specialisation);
        d.setEmail(doctorEmail);
        d.setPhoneNumber(doctorPhone);
        d.setUsername(username);
        d.setPassword(password);
        d.setHospital(hospital);
        
        JOptionPane.showMessageDialog(this, "Doctor Info Saved"); 
        
        txtDoctorAge.setText("");
        txtDoctorEmailAddress.setText("");
        txtDoctorExperience.setText("");
        txtDoctorGender.setText("");
        txtDoctorName.setText("");
        txtDoctorOccupation.setText("");
        txtDoctorPassword.setText("");
        txtDoctorPhoneNumber.setText("");
        txtDoctorSpecialisation.setText("");
        txtDoctorUsername.setText("");
        jComboBoxDoctorHospital.setSelectedItem(null);
        
        
        
        
        

    }//GEN-LAST:event_btnSaveDoctorActionPerformed

    private void txtDoctorPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPhoneNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveDoctor;
    private javax.swing.JComboBox<Object> jComboBoxDoctorHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbDoctorName;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblDoctorAge;
    private javax.swing.JLabel lblDoctorEmailAddress;
    private javax.swing.JLabel lblDoctorGender;
    private javax.swing.JLabel lblDoctorHouse;
    private javax.swing.JLabel lblDoctorPassword;
    private javax.swing.JLabel lblDoctorPhoneNumber;
    private javax.swing.JLabel lblDoctorUsername;
    private javax.swing.JLabel lblPatientLoginDetails;
    private javax.swing.JLabel lblpersonalDetails;
    private javax.swing.JTextField txtDoctorAge;
    private javax.swing.JTextField txtDoctorEmailAddress;
    private javax.swing.JTextField txtDoctorExperience;
    private javax.swing.JTextField txtDoctorGender;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorOccupation;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorPhoneNumber;
    private javax.swing.JTextField txtDoctorSpecialisation;
    private javax.swing.JTextField txtDoctorUsername;
    // End of variables declaration//GEN-END:variables

    

    private void populateHospitals() {
        /*
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
        
        */
        HospitalDirectory hd = sysAdmin.getHospitalDirectory();
        List<Hospital> hl = hd.getHospitalDirectory();
        for(Hospital h : hl){
            jComboBoxDoctorHospital.addItem(h);
        }
        
    }
}
