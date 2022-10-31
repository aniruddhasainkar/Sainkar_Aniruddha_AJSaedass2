/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.SystemAdmin;

/**
 *
 * @author aniruddha
 */
public class ViewCityPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCityPanel
     */
    SystemAdmin sysAdmin;
    public ViewCityPanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
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
        tblCities = new javax.swing.JTable();
        btnViewCity = new javax.swing.JButton();
        btnUpdateCity = new javax.swing.JButton();
        lblCityName = new javax.swing.JLabel();
        lblCityState = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        txtCityState = new javax.swing.JTextField();
        btnSaveCity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCityId = new javax.swing.JTextField();

        jLabel1.setText("View City ");

        tblCities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City ID", "City Name", "City State"
            }
        ));
        jScrollPane1.setViewportView(tblCities);

        btnViewCity.setText("View City");
        btnViewCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCityActionPerformed(evt);
            }
        });

        btnUpdateCity.setText("Update City");
        btnUpdateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCityActionPerformed(evt);
            }
        });

        lblCityName.setText("City Name");

        lblCityState.setText("City State");

        btnSaveCity.setText("Save City");
        btnSaveCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCityActionPerformed(evt);
            }
        });

        jLabel2.setText("City ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnViewCity)
                .addGap(29, 29, 29)
                .addComponent(btnUpdateCity)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnSaveCity))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblCityState)
                                        .addComponent(lblCityName))
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCityName)
                                    .addComponent(txtCityState, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtCityId))))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCity)
                    .addComponent(btnUpdateCity))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCityName)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCityState)
                    .addComponent(txtCityState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnSaveCity)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCityActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCities.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        City c = (City) model.getValueAt(selectedRowIndex, 1);
        txtCityId.setText(String.valueOf(c.getId()));
        txtCityId.setEditable(false);
        txtCityName.setText(String.valueOf(c.getName()));
        txtCityName.setEditable(false);
        txtCityState.setText(String.valueOf(c.getState()));
        txtCityState.setEditable(false);
        
        
        
    }//GEN-LAST:event_btnViewCityActionPerformed

    private void btnSaveCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCityActionPerformed
        // TODO add your handling code here:
        City c = sysAdmin.getCity(txtCityId.getText());
        if(txtCityName.getText().length()==0 || txtCityState.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        c.setName(String.valueOf(txtCityName.getText()));
        c.setState(String.valueOf(txtCityState.getText()));
        JOptionPane.showMessageDialog(this, "City Info Updated");
        txtCityId.setText("");
        txtCityName.setText("");
        txtCityState.setText("");
        populateTable();
        
    }//GEN-LAST:event_btnSaveCityActionPerformed

    private void btnUpdateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCityActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCities.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to update the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        City c = (City) model.getValueAt(selectedRowIndex, 1);
        txtCityId.setText(String.valueOf(c.getId()));
        txtCityId.setEditable(false);
        txtCityName.setText(String.valueOf(c.getName()));
        txtCityName.setEditable(true);
        txtCityState.setText(String.valueOf(c.getState()));
        txtCityState.setEditable(true);
        
    }//GEN-LAST:event_btnUpdateCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveCity;
    private javax.swing.JButton btnUpdateCity;
    private javax.swing.JButton btnViewCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblCityState;
    private javax.swing.JTable tblCities;
    private javax.swing.JTextField txtCityId;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCityState;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCities.getModel();
        model.setRowCount(0);
        
        
        for(City c : sysAdmin.getCities()){
            Object[] row = new Object[3];
            row[0] = c.getId();
            row[1] = c;
            row[2] = c.getState();
            model.addRow(row);
        }
    }
}
