/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author sanu
 */
public class Login {
    private int Employee_Employee_id;
    private String User_name;
    private String Password;

    public Login() {
    }

    public Login(int Employee_Employee_id, String User_name, String Password) {
        this.Employee_Employee_id = Employee_Employee_id;
        this.User_name = User_name;
        this.Password = Password;
    }

    /**
     * @return the Employee_Employee_id
     */
    public int getEmployee_Employee_id() {
        return Employee_Employee_id;
    }

    /**
     * @param Employee_Employee_id the Employee_Employee_id to set
     */
    public void setEmployee_Employee_id(int Employee_Employee_id) {
        this.Employee_Employee_id = Employee_Employee_id;
    }

    /**
     * @return the User_name
     */
    public String getUser_name() {
        return User_name;
    }

    /**
     * @param User_name the User_name to set
     */
    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
}
