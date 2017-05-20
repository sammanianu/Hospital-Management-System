/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import database.DBConnection;
import java.sql.ResultSet;
import model.Patient_record;

/**
 *
 * @author sanu
 */
public class PatientController {
    public static boolean addPatient(Patient_record patient) throws SQLException, ClassNotFoundException{
       String sql = "Insert into patient_record(NIC,First_Name,Last_Name,Address,Sex,Age,Blood_Group,Contact_no,Sickness_History) values(?,?,?,?,?,?,?,?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       //preparedStatement.setObject(1, patient.getPatient_id());
       preparedStatement.setString(1, patient.getFirst_name());
       preparedStatement.setString(2, patient.getLast_name());
       preparedStatement.setString(3, patient.getNIC());
       preparedStatement.setString(4, patient.getAddress()); 
       preparedStatement.setString(5, patient.getSex());
       preparedStatement.setInt(6, patient.getAge());
       preparedStatement.setString(7, patient.getBlood_group());
       preparedStatement.setInt(8, patient.getContact_no());
       preparedStatement.setString(9, patient.getSickness_history());
       //preparedStatement.setString(10, patient.getWard_type());
       //preparedStatement.setObject(11, patient.getReceptionist_Receptionist_id());
       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
    }
     public static boolean UpdatePatient(Patient_record patient) throws SQLException, ClassNotFoundException {
        String sql = "Update patient_record set NIC=?,First_name=?,Last_name=?,Address=?,Sex=?,Age=?,Blood_group=?,Contact_no=?,Sickness_History=? where Patient_id = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, patient.getNIC());
            stm.setObject(2, patient.getFirst_name());
            stm.setObject(3, patient.getLast_name());
            stm.setObject(4, patient.getAddress());
            stm.setObject(5, patient.getSex());
            stm.setObject(6, patient.getAge());
            stm.setObject(7, patient.getBlood_group());
            stm.setObject(8, patient.getContact_no());
            stm.setObject(9, patient.getSickness_history());
            stm.setObject(10, patient.getPatient_id());
            //stm.setObject(1, patient.getReceptionist_Receptionist_id());

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
    public static int getLastPatientId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Patient_id FROM patient_record ORDER BY patient_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Patient_id");
        }
        return lastId;
    }
    public static Patient_record searchPatientDetail(String Patient_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from patient_record where Patient_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Patient_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Patient_record(rst.getString("NIC"), rst.getString("First_Name"), rst.getString("Last_Name"), rst.getString("Address"), rst.getString("Sex"), rst.getInt("Age"), rst.getString("Blood_Group"), rst.getInt("Contact_no"), rst.getString("Sickness_History"));
        }
        return null;
    }
}
