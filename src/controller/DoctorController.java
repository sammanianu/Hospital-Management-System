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
import model.Doctor;
import model.Nurse;
import model.Patient_record;

/**
 *
 * @author sanu
 */
public class DoctorController {
    public static boolean addDoctor(Doctor doctor) throws SQLException, ClassNotFoundException{
       String sql = "Insert into Doctor(Qualifications,Employee_Employee_id) values(?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       //preparedStatement.setObject(1, doctor.getDoctor_id());
       preparedStatement.setObject(1, doctor.getQualifications());
       preparedStatement.setInt(2, EmployeeController.getLastEmployeeId());
       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
    
    public static boolean UpdateDoctor(Doctor doctor) throws SQLException, ClassNotFoundException {
        String sql = "Update doctor set  Qualifications = ?, Employee_Employee_id = ? where Doctor_id=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, doctor.getQualifications());
            stm.setObject(2, doctor.getEmployee_Employee_id());
            stm.setObject(3, doctor.getDoctor_id());
            
            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
        public static int getLastDoctorId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT Doctor_id FROM doctor ORDER BY Doctor_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Doctor_id");
        }
        return lastId;
    }
        public static Doctor searchDoctorDetail(String Doctor_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from doctor where Doctor_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Doctor_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Doctor(rst.getInt("Doctor_id"), rst.getInt("Employee_Employee_id"), rst.getString("Qualifications"));
        }
        return null;
    }
}
