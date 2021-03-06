/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClerkController;
import controller.EmployeeController;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Clerk;
import model.Employee;
import static view.ClerkDetailForm.employeeIdLabel;

/**
 *
 * @author sanu
 */
public class DetailsGetClerkId extends javax.swing.JPanel {

    /**
     * Creates new form DetailsGetClerkId
     */
    public DetailsGetClerkId() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getClerkIdPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        getClerkIdText = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Enter Clerk ID");

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getClerkIdPanelLayout = new javax.swing.GroupLayout(getClerkIdPanel);
        getClerkIdPanel.setLayout(getClerkIdPanelLayout);
        getClerkIdPanelLayout.setHorizontalGroup(
            getClerkIdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getClerkIdPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(getClerkIdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(getClerkIdPanelLayout.createSequentialGroup()
                        .addComponent(getClerkIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(nextButton)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        getClerkIdPanelLayout.setVerticalGroup(
            getClerkIdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getClerkIdPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(getClerkIdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getClerkIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getClerkIdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getClerkIdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        ClerkDetailForm cdf = new ClerkDetailForm();
        cdf.setVisible(true);
        getClerkIdPanel.setLayout(new BorderLayout());
        getClerkIdPanel.removeAll();
        getClerkIdPanel.add(cdf);
        getClerkIdPanel.validate();
        getClerkIdPanel.repaint();
        
        //Auto fill Clerk detail form
        try {
            Clerk clerk = ClerkController.searchClerkDetail(getClerkIdText.getText());
            if (clerk != null) {
                ClerkDetailForm.clerkIdLabel.setText(getClerkIdText.getText());
                ClerkDetailForm.employeeIdLabel.setText(Integer.toString(clerk.getEmployee_Employee_id()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetailsGetClerkId.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DetailsGetClerkId.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Employee employee = null;
        try {
            employee = EmployeeController.searchEmployeeDetail(employeeIdLabel.getText());
            if (employee != null) {
                ClerkDetailForm.employeeIdLabel.setText(employeeIdLabel.getText());
                ClerkDetailForm.firstNameLabel.setText(employee.getFirst_name());
                ClerkDetailForm.lastNameLabel.setText(employee.getLast_name());
                ClerkDetailForm.nicLabel.setText(employee.getNIC());
                ClerkDetailForm.addressLabel.setText(employee.getAddress());
                ClerkDetailForm.genderLabel.setText(employee.getSex());
                ClerkDetailForm.contactNoLabel.setText(employee.getContact_no());
                ClerkDetailForm.registrationDateLabel.setText(employee.getRegistration_date());
                ClerkDetailForm.emailLabel.setText(employee.getEmail());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetailsGetEmployeeId.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DetailsGetEmployeeId.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel getClerkIdPanel;
    private javax.swing.JTextField getClerkIdText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
