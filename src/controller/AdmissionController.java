/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Admission;
import model.Patient_record;

/**
 *
 * @author sanu
 */
public class AdmissionController {
    static JFrame frame = new JFrame();
    public static boolean addAdmission(Admission admission) throws SQLException, ClassNotFoundException{
       String sql = "Insert into admission(Date_admitted,Date_discharged,Doctor_Doctor_id,Ward_Ward_id,Patient_record_Patient_id) values(?,?,?,?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
       preparedStatement.setString(1, admission.getDate_admitted());
       preparedStatement.setString(2, admission.getDate_discharged());
       preparedStatement.setInt(3, admission.getDoctor_Doctor_id());
       preparedStatement.setInt(4, admission.getWard_Ward_id());
       //preparedStatement.setInt(5, PatientController.getLastPatientId());
       preparedStatement.setInt(5, admission.getPatient_record_Patient_id());

       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
    }
   
    public static boolean searchBillId(Admission admission) throws SQLException, ClassNotFoundException{
        try {
            String sql = "Update admission set Bill_Bill_id=? where Patient_record_Patient_id=?";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
       preparedStatement.setInt(1, admission.getBill_Bill_id());
       preparedStatement.setInt(2, admission.getPatient_record_Patient_id());
       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e);
        }
        return true;
    }
    
    public static boolean UpdateAdmission(Admission admission) throws SQLException, ClassNotFoundException {//?
        String sql = "Update admission set Date_admitted,Date_discharged,Doctor_Doctor_id,Ward_Ward_id,Patient_record_Patient_id where Admission_id = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, admission.getDate_admitted());
            stm.setObject(2, admission.getDate_discharged());
            stm.setObject(3, admission.getDoctor_Doctor_id());
            stm.setObject(4, admission.getWard_Ward_id());
            stm.setObject(5, admission.getPatient_record_Patient_id());
            stm.setObject(6, admission.getAdmission_id());
      

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
    
    public static int getLastAdmissionId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Admission_id FROM admission ORDER BY Admission_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Admission_id");
        }
        return lastId;
    }
    
    public static Admission searchAdmissionDetail(String Admission_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from admission where admission_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Admission_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Admission(rst.getInt("Admission_id"),rst.getString("Date_admitted"), rst.getString("Date_discharged"),rst.getInt("Doctor_Doctor_id"),rst.getInt("Ward_Ward_id"),rst.getInt("Patient_record_Patient_id"));
        }
        return null;
    }
    //Search admission Id when patient id given
    public static Admission searchAdmissionId(String Patient_record_Patient_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from admission where Patient_record_Patient_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Patient_record_Patient_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Admission(rst.getInt("Admission_id"),rst.getString("Date_admitted"), rst.getString("Date_discharged"),rst.getInt("Doctor_Doctor_id"),rst.getInt("Ward_Ward_id"),rst.getInt("Patient_record_Patient_id"));
        }
        return null;
    }
}
