/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.imageio.plugins.common.I18N;
import controller.AdmissionController;
import static controller.EmployeeController.getLastEmployeeId;
import controller.PatientController;
import static controller.PatientController.getLastPatientId;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Admission;
import model.Patient_record;

/**
 *
 * @author sanu
 */
public class AdmissionEntryForm extends javax.swing.JPanel {

    /**
     * Creates new form AdmissionEntryForm
     */
    public AdmissionEntryForm() {
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

        admissionEntryFormPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        admissionIdText = new javax.swing.JTextField();
        patientIdText = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        lastNameText = new javax.swing.JTextField();
        inchargeDoctorIdText = new javax.swing.JTextField();
        dateAdmittedText = new javax.swing.JTextField();
        dateDischargedText = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nicText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressText = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        bloodGroupCombo = new javax.swing.JComboBox<>();
        genderCombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        contactNoText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sicknessHistoryText = new javax.swing.JTextPane();
        jLabel18 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        wardIdCombo = new javax.swing.JComboBox<>();

        admissionEntryFormPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Admission Entry Form");

        jLabel2.setText("Admission Id");

        jLabel3.setText("Patient Id");

        jLabel4.setText("Incharge Doctor Id");

        jLabel5.setText("Ward Id");

        jLabel6.setText("First Name");

        jLabel7.setText("Date Admitted");

        jLabel8.setText("Date Discharged");

        admissionIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admissionIdTextActionPerformed(evt);
            }
        });

        inchargeDoctorIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inchargeDoctorIdTextActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel9.setText("Last Name");

        jLabel10.setText("NIC");

        jLabel11.setText("Gender");

        jLabel12.setText("Address");

        jScrollPane1.setViewportView(addressText);

        jLabel13.setText("Age");

        jLabel14.setText("Blood Group");

        bloodGroupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel15.setText("Contact No");

        jLabel16.setText("Sickness History");

        jScrollPane2.setViewportView(sicknessHistoryText);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PatientChild.jpg"))); // NOI18N
        jLabel18.setText("jLabel18");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        wardIdCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        javax.swing.GroupLayout admissionEntryFormPanelLayout = new javax.swing.GroupLayout(admissionEntryFormPanel);
        admissionEntryFormPanel.setLayout(admissionEntryFormPanelLayout);
        admissionEntryFormPanelLayout.setHorizontalGroup(
            admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                    .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                    .addGap(11, 11, 11))
                                .addComponent(jLabel9)))
                        .addGap(68, 68, 68)
                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(admissionIdText)
                                .addComponent(firstNameText)
                                .addComponent(lastNameText)
                                .addComponent(patientIdText, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nicText)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(ageText))
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(148, 148, 148)
                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, admissionEntryFormPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateAdmittedText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(37, 37, 37)
                                        .addComponent(dateDischargedText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, admissionEntryFormPanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(25, 25, 25))
                                                .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(63, 63, 63)))
                                            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(39, 39, 39)))
                                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(inchargeDoctorIdText, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                .addComponent(bloodGroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(contactNoText))
                                            .addComponent(wardIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1)
                        .addGap(0, 592, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(submitButton)
                .addGap(182, 182, 182)
                .addComponent(updateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        admissionEntryFormPanelLayout.setVerticalGroup(
            admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(admissionIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dateAdmittedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(patientIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(dateDischargedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(inchargeDoctorIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(wardIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(bloodGroupCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(126, Short.MAX_VALUE))
                                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13))
                                            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addComponent(jLabel16))
                                                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                                        .addGap(32, 32, 32)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(submitButton)
                                            .addComponent(updateButton))
                                        .addGap(34, 34, 34))))
                            .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(admissionEntryFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(contactNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jLabel12)
                                .addContainerGap())))
                    .addGroup(admissionEntryFormPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admissionEntryFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admissionEntryFormPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String Date_admitted = dateAdmittedText.getText();
        //int Date_admitted = Integer.parseInt(dateAdmittedString);
        String Date_discharged = dateDischargedText.getText();
        //int Date_discharged = Integer.parseInt(dateDischargedString);
        String doctorIdText = inchargeDoctorIdText.getText();
        int Doctor_id = Integer.parseInt(doctorIdText);
        String wardId = (String) wardIdCombo.getSelectedItem();
        int Ward_id = Integer.parseInt(wardId);
        String patientIdString = patientIdText.getText();
        int Patient_record_Patient_id = Integer.parseInt(patientIdString);
        //patientId
        //bill_id
        
        Admission admission = new Admission(Date_admitted,Date_discharged,Doctor_id,Ward_id,Patient_record_Patient_id);
        
        try {
            boolean addAdmission = AdmissionController.addAdmission(admission);
            admission.setPatient_record_Patient_id(getLastPatientId());
            if(addAdmission){
                JOptionPane.showMessageDialog(this, "Successful");
            }else{
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdmissionEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmissionEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void inchargeDoctorIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inchargeDoctorIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inchargeDoctorIdTextActionPerformed

    private void admissionIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admissionIdTextActionPerformed
       //Auto fill admission details when Admission_id is given to AdmissionDetailForm
       
            Admission admission;
        try {
            admission = AdmissionController.searchAdmissionDetail(admissionIdText.getText());
            if (admission != null) {
            //AdmissionDetailForm.admissionIdLabel.setText(admissionIdText.getText());
            AdmissionEntryForm.patientIdText.setText(Integer.toString(admission.getPatient_record_Patient_id()));
            AdmissionEntryForm.wardIdCombo.setSelectedItem(Integer.toString(admission.getWard_Ward_id()));
            AdmissionEntryForm.dateAdmittedText.setText(admission.getDate_admitted());
            AdmissionEntryForm.dateDischargedText.setText(admission.getDate_discharged());
            
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetailsGetAdmissionId.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DetailsGetAdmissionId.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Auto fill details to Admission Detail Form
        Patient_record patientRecord;
        try {
            patientRecord = PatientController.searchPatientDetail(patientIdText.getText());
            if (patientRecord != null) {
            //AdmissionEntryForm.patientIdText.setText(patientIdLabel.getText());
            AdmissionEntryForm.firstNameText.setText(patientRecord.getFirst_name());
            AdmissionEntryForm.lastNameText.setText(patientRecord.getLast_name());
            AdmissionEntryForm.nicText.setText(patientRecord.getNIC());
            AdmissionEntryForm.addressText.setText(patientRecord.getAddress());
            AdmissionEntryForm.genderCombo.setSelectedItem(patientRecord.getSex());
            AdmissionEntryForm.ageText.setText(Integer.toString(patientRecord.getAge()));
            AdmissionEntryForm.bloodGroupCombo.setSelectedItem(patientRecord.getBlood_group());
            AdmissionEntryForm.contactNoText.setText(Integer.toString(patientRecord.getContact_no()));
            AdmissionEntryForm.sicknessHistoryText.setText(patientRecord.getSickness_history());}
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetailsGetAdmissionId.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DetailsGetAdmissionId.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_admissionIdTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String Admission_id_String = admissionIdText.getText();
        int Admission_id = Integer.parseInt(Admission_id_String); 
        String Patient_id_String = patientIdText.getText();
        int Patient_id = Integer.parseInt(Patient_id_String);
        String Doctor_id_String = patientIdText.getText();
        int Doctor_id = Integer.parseInt(Doctor_id_String); 
        String NIC = nicText.getText();
        String First_name = firstNameText.getText();
        String Last_name = lastNameText.getText();
        String Gender = (String)genderCombo.getSelectedItem();
        String Age_String = ageText.getText();
        int Age = Integer.parseInt(Age_String); 
        String Date_admitted = dateAdmittedText.getText();
        String Date_discharged = dateDischargedText.getText();
        String Address = addressText.getText();
        String Blood_group = (String)bloodGroupCombo.getSelectedItem();
        String Sickness_history = sicknessHistoryText.getText();
        String Contact_no_String = contactNoText.getText();
        int Contact_no = Integer.parseInt(Contact_no_String); 
        String Ward_id_String = (String)wardIdCombo.getSelectedItem();
        int Ward_id = Integer.parseInt(Ward_id_String);
        
        Admission admission = new Admission(Date_admitted,Date_discharged,Doctor_id,Ward_id,Patient_id);
        Patient_record patient = new Patient_record(First_name, Last_name, NIC, Address, Gender, Age, Blood_group, Contact_no, Sickness_history);
        
        try {
            boolean updateAdmission = AdmissionController.UpdateAdmission(admission);
            boolean updatePatient = PatientController.UpdatePatient(patient);
            if(updateAdmission){
            JOptionPane.showMessageDialog(this, "Successful");
            }else{
            JOptionPane.showMessageDialog(this, "Failed");
            }
            if(updatePatient){
            JOptionPane.showMessageDialog(this, "Su");
            }else{
            JOptionPane.showMessageDialog(this, "Fa");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdmissionEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdmissionEntryForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextPane addressText;
    private javax.swing.JPanel admissionEntryFormPanel;
    public static javax.swing.JTextField admissionIdText;
    public static javax.swing.JTextField ageText;
    public static javax.swing.JComboBox<String> bloodGroupCombo;
    public static javax.swing.JTextField contactNoText;
    public static javax.swing.JTextField dateAdmittedText;
    public static javax.swing.JTextField dateDischargedText;
    public static javax.swing.JTextField firstNameText;
    public static javax.swing.JComboBox<String> genderCombo;
    public static javax.swing.JTextField inchargeDoctorIdText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField lastNameText;
    public static javax.swing.JTextField nicText;
    public static javax.swing.JTextField patientIdText;
    public static javax.swing.JTextPane sicknessHistoryText;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    public static javax.swing.JComboBox<String> wardIdCombo;
    // End of variables declaration//GEN-END:variables
}
