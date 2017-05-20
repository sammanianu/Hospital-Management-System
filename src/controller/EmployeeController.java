/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.DBConnection;
import model.Employee;
import model.Patient_record;

/**
 *
 * @author sanu
 */
public class EmployeeController {
    public static boolean addEmployee(Employee employee) throws SQLException, ClassNotFoundException{
       String sql = "Insert into Employee(First_name,Last_name,NIC,Address,Sex,Contact_no,Registration_date,Email)values(?,?,?,?,?,?,?,?)";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       //preparedStatement.setObject(1, employee.getEmployee_id());
       preparedStatement.setObject(1, employee.getFirst_name());
       preparedStatement.setObject(2, employee.getLast_name());
       preparedStatement.setObject(3, employee.getNIC());
       preparedStatement.setObject(4, employee.getAddress()); 
       preparedStatement.setObject(5, employee.getSex());
       preparedStatement.setObject(6, employee.getContact_no());
       preparedStatement.setObject(7, employee.getRegistration_date());
       preparedStatement.setObject(8, employee.getEmail());
       
       int res = preparedStatement.executeUpdate();
       if (res>0){
           return true;
       }
       return false;
    }
    
    public static boolean updateEmployee(Employee employee) throws SQLException, ClassNotFoundException {
        String sql = "Update employee set First_name=?,Last_name=?,NIC=?,Address=?,Sex=?,Contact_no=?,Registration_date=?,Email=? where Employee_id = ?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setObject(1, employee.getFirst_name());
            preparedStatement.setObject(2, employee.getLast_name());
            preparedStatement.setObject(3, employee.getNIC());
            preparedStatement.setObject(4, employee.getAddress()); 
            preparedStatement.setObject(5, employee.getSex());
            preparedStatement.setObject(6, employee.getContact_no());
            preparedStatement.setObject(7, employee.getRegistration_date());
            preparedStatement.setObject(8, employee.getEmail());
            preparedStatement.setObject(9, employee.getEmployee_id());

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                        return true;
            }
            return false;
    }
    
    public static int getLastEmployeeId() throws ClassNotFoundException, SQLException{
       String sql = "SELECT employee_id FROM employee ORDER BY employee_id DESC LIMIT 1";
       Connection connection = DBConnection.getDBConnection().getConnection();
       PreparedStatement preparedStatement = connection.prepareStatement(sql);
       
        ResultSet res = preparedStatement.executeQuery();
        int lastId = 0;
        while(res.next()){
            lastId = res.getInt("Employee_id");
        }
        return lastId;
    }
    
    public static Employee searchEmployeeDetail(String Employee_id) throws ClassNotFoundException, SQLException {
        String sql = "Select * from employee where Employee_id=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, Employee_id);
        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Employee(rst.getString("First_Name"), rst.getString("Last_Name"), rst.getString("NIC"), rst.getString("Address"), rst.getString("Sex"), rst.getString("Contact_no"), rst.getString("Registration_date"), rst.getString("Email"));
        }
        return null;
    }
    
}
