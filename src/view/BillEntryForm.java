/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AdmissionController;
import controller.BillController;
import controller.EmployeeController;
import controller.PatientController;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;
import javax.swing.JOptionPane;
import model.Admission;
import model.Patient_record;
import static view.AdmissionEntryForm.addressText;
import static view.AdmissionEntryForm.ageText;
import static view.AdmissionEntryForm.bloodGroupCombo;
import static view.AdmissionEntryForm.contactNoText;
import static view.AdmissionEntryForm.firstNameText;
import static view.AdmissionEntryForm.genderCombo;
import static view.AdmissionEntryForm.lastNameText;
import static view.AdmissionEntryForm.nicText;
import static view.AdmissionEntryForm.sicknessHistoryText;
import static view.DetailsGetBillId.getBillIdText;
import static view.PatientEntryForm.lastNameText;

/**
 *
 * @author sanu
 */
public class BillEntryForm extends javax.swing.JPanel {
    
    
    public BillEntryForm() {
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

        billEntryFormPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        billIdText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        admissionIdText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        ageText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();
        dateAdmittedText = new javax.swing.JTextField();
        dateDischargedText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        patientIdText = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        doctorChargesText = new javax.swing.JTextField();
        medicineChargesText = new javax.swing.JTextField();
        labChargesText = new javax.swing.JTextField();
        roomChargesText = new javax.swing.JTextField();
        operationChargesText = new javax.swing.JTextField();
        nursingChargesText = new javax.swing.JTextField();
        totalAmountText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        advanceAmountText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        netAmountText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        billEntryFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Bill Entry Form");

        jLabel2.setText("Bill ID");

        billIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billIdTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Date");

        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Details"));

        jLabel4.setText("Admission ID");

        jLabel5.setText("First Name");

        jLabel6.setText("Age");

        jLabel7.setText("Gender");

        jLabel8.setText("Date Admitted");

        jLabel9.setText("Date Discharged");

        admissionIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionIdTextActionPerformed(evt);
            }
        });

        jLabel10.setText("Year");

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel20.setText("Last Name");

        jLabel21.setText("Patient Id");

        patientIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel20)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel21))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(admissionIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateDischargedText, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(dateAdmittedText, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(lastNameText)
                            .addComponent(patientIdText))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(admissionIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dateAdmittedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dateDischargedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Charges"));

        jLabel11.setText("Doctor Charges");

        jLabel12.setText("Medicine Charges");

        jLabel13.setText("Lab Charges");

        jLabel14.setText("Room Charges");

        jLabel15.setText("Operation Charges");

        jLabel16.setText("Nursing Charges");

        jLabel17.setText("Total Amount");

        doctorChargesText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorChargesTextActionPerformed(evt);
            }
        });

        jLabel18.setText("Advance Amount");

        jLabel19.setText("Net Amount");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(91, 91, 91)
                        .addComponent(netAmountText))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doctorChargesText, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(medicineChargesText)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(operationChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nursingChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(advanceAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(medicineChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(roomChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(operationChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(nursingChargesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(totalAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(advanceAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netAmountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billEntryFormPanelLayout = new javax.swing.GroupLayout(billEntryFormPanel);
        billEntryFormPanel.setLayout(billEntryFormPanelLayout);
        billEntryFormPanelLayout.setHorizontalGroup(
            billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billEntryFormPanelLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billEntryFormPanelLayout.createSequentialGroup()
                .addGroup(billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(billEntryFormPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billEntryFormPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(billIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billEntryFormPanelLayout.createSequentialGroup()
                        .addGap(163, 468, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addGap(378, 378, 378)
                        .addComponent(backButton)))
                .addGap(65, 65, 65))
        );
        billEntryFormPanelLayout.setVerticalGroup(
            billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billEntryFormPanelLayout.createSequentialGroup()
                .addGroup(billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billEntryFormPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(billEntryFormPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billEntryFormPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(billEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(submitButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billEntryFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billEntryFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String Bill_id_String = billIdText.getText();
        int Bill_Bill_id = Integer.parseInt(Bill_id_String);
        String Patient_id_String = patientIdText.getText();
        int Patient_record_Patient_id = Integer.parseInt(Patient_id_String);
        String Clerk_id_String = Login
        //String Name = firstNameText.getText();
        //String Age = ageText.getText();
        //String Gender = (String)genderCombo.getSelectedItem();
        //String Date_admitted = dateAdmittedText.getText();
        //String Date_discharged = dateDischargedText.getText();
        String Date = dateText.getText();
        String DoctorChargesText = doctorChargesText.getText();
        double Doctor_charges = Double.parseDouble(DoctorChargesText);
        String Medicine_charges_text = medicineChargesText.getText();
        double Medicine_charges = Double.parseDouble(Medicine_charges_text);
        String Lab_charges_text = labChargesText.getText();
        double Lab_charges = Double.parseDouble(Lab_charges_text);
        String Room_charges_text = roomChargesText.getText();
        double Room_charges = Double.parseDouble(Room_charges_text);
        String Operation_charges_text = operationChargesText.getText();
        double Operation_charges = Double.parseDouble(Operation_charges_text);
        String Nursing_charges_text = nursingChargesText.getText();
        double Nursing_charges = Double.parseDouble(Nursing_charges_text);
        String Advance_amount_text = advanceAmountText.getText();
        double Advance_amount = Double.parseDouble(Advance_amount_text);
        String Admission_id_String = admissionIdText.getText();
        int Admission_id = Integer.parseInt(Admission_id_String);
        //String Net_amount = netAmountText.getText();
        double Total_amount = Doctor_charges+Medicine_charges+Lab_charges+Room_charges+Operation_charges+Nursing_charges;
        totalAmountText.setText(Double.toString(Total_amount));
        double Net_amount = Total_amount-Advance_amount;
        netAmountText.setText(Double.toString(Net_amount));
    
        
        Bill bill = new Bill(Clerk_Clerk_id,Admission_id,Medicine_charges,Room_charges,Operation_charges,Doctor_charges,Lab_charges,Nursing_charges,Advance_amount,Date);
        Admission admission = new Admission(Patient_record_Patient_id,Bill_Bill_id);
        
        try {
            boolean addBill = BillController.addBill(bill);
            boolean addAdmission = AdmissionController.searchBillId(admission);
            if(addBill){
                JOptionPane.showMessageDialog(this, "Successful");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
            if(addAdmission){
                JOptionPane.showMessageDialog(this, "Succ");
            }else{
                JOptionPane.showMessageDialog(this, "Fa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void doctorChargesTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorChargesTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorChargesTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Add add = new Add();
        add.setVisible(true);
        billEntryFormPanel.setLayout(new BorderLayout());
        billEntryFormPanel.removeAll();
        billEntryFormPanel.add(add);
        billEntryFormPanel.validate();
        billEntryFormPanel.repaint();
    }//GEN-LAST:event_backButtonActionPerformed

    private void admissionIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionIdTextActionPerformed
        //Auto fill Date_admitted and Date_discharged when admision_id is given
        try {
            Admission admission = AdmissionController.searchAdmissionDetail(admissionIdText.getText());
            if (admission != null) {
            dateAdmittedText.setText(admission.getDate_admitted());
            dateDischargedText.setText(admission.getDate_discharged());
            patientIdText.setText(Integer.toString(admission.getPatient_record_Patient_id()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewAdmissionGetPatientId.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewAdmissionGetPatientId.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        //Auto fill below items when patient_id is given
        try {
            Patient_record patientRecord = PatientController.searchPatientDetail(patientIdText.getText());
            if (patientRecord != null) {
            firstNameText.setText(patientRecord.getFirst_name());
            lastNameText.setText(patientRecord.getLast_name());
            genderCombo.setSelectedItem(patientRecord.getLast_name());//not swork
            ageText.setText(Integer.toString(patientRecord.getAge()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewAdmissionGetPatientId.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewAdmissionGetPatientId.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Bill bill = BillController.searchBillDetail(admissionIdText.getText());
            if (bill != null){
                doctorChargesText.setText(Double.toString(bill.getDoctor_charge()));
                medicineChargesText.setText(Double.toString(bill.getMedicine_charge()));
                labChargesText.setText(Double.toString(bill.getLab_charge()));
                roomChargesText.setText(Double.toString(bill.getRoom_charge()));
                operationChargesText.setText(Double.toString(bill.getOperation_charge()));
                nursingChargesText.setText(Double.toString(bill.getNursing_charge()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BillEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_admissionIdTextActionPerformed

    private void billIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billIdTextActionPerformed
        //Auto fill bill details when bill id given
        Bill bill;
        try {
            bill = BillController.searchBillDetail(billIdText.getText());
            if (bill != null) {
            //BillEntryForm.billIdText.setText(getBillIdText.getText());
            BillEntryForm.medicineChargesText.setText(Double.toString(bill.getMedicine_charge()));
            BillEntryForm.roomChargesText.setText(Double.toString(bill.getRoom_charge()));
            BillEntryForm.operationChargesText.setText(Double.toString(bill.getOperation_charge()));
            BillEntryForm.doctorChargesText.setText(Double.toString(bill.getDoctor_charge()));
            BillEntryForm.labChargesText.setText(Double.toString(bill.getLab_charge()));
            BillEntryForm.nursingChargesText.setText(Double.toString(bill.getNursing_charge()));}
            BillEntryForm.advanceAmountText.setText(Double.toString(bill.getAdvance_amount()));
            //BillDetailForm.dateLabel.setText(Integer.toString(bill.getContact_no()));
            //BillDetailForm.ChargeLabel.setText(bill.getSickness_history());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetailsGetBillId.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DetailsGetBillId.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Admission admission = AdmissionController.searchAdmissionDetail(bill)
    }//GEN-LAST:event_billIdTextActionPerformed

    private void patientIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField admissionIdText;
    public static javax.swing.JTextField advanceAmountText;
    public static javax.swing.JTextField ageText;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel billEntryFormPanel;
    public static javax.swing.JTextField billIdText;
    public static javax.swing.JTextField dateAdmittedText;
    public static javax.swing.JTextField dateDischargedText;
    public static javax.swing.JTextField dateText;
    public static javax.swing.JTextField doctorChargesText;
    public static javax.swing.JTextField firstNameText;
    public static javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JTextField labChargesText;
    public static javax.swing.JTextField lastNameText;
    public static javax.swing.JTextField medicineChargesText;
    public static javax.swing.JTextField netAmountText;
    public static javax.swing.JTextField nursingChargesText;
    public static javax.swing.JTextField operationChargesText;
    public static javax.swing.JTextField patientIdText;
    public static javax.swing.JTextField roomChargesText;
    private javax.swing.JButton submitButton;
    public static javax.swing.JTextField totalAmountText;
    // End of variables declaration//GEN-END:variables

    
}
