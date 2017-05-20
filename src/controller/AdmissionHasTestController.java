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
import model.AdmissionHasTest;

/**
 *
 * @author sanu
 */
public class AdmissionHasTestController {
    public static boolean addAdmissionHasTest(AdmissionHasTest aht) throws SQLException, ClassNotFoundException{
       String sql = "Insert into admission_has_test values(?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
     
       preparedStatement.setObject(1, aht.getAdmission_Admission_id());
       preparedStatement.setObject(2, aht.getTest_Test_id());
      
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
   }
    
    public static boolean UpdateAdmissionHasTest(AdmissionHasTest aht) throws SQLException, ClassNotFoundException {
        String sql = "Update admission_has_test set Admission_Admission_id where Test_Test_id=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setObject(1, aht.getAdmission_Admission_id());
            stm.setObject(2, aht.getTest_Test_id());

            int res = stm.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
    public static AdmissionHasTest searchAdmissionId(String Admission_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from admission_has_test where Admission_Admission_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Admission_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new AdmissionHasTest(rst.getInt("Test_Test_id"));
        }
        return null;
    }

    
}
