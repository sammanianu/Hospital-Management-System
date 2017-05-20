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
public class Clerk extends Employee {
    private int Clerk_id;
    private int Employee_Employee_id;

    public Clerk() {
    }

    public Clerk(String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email) {
        super(First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        //this.Clerk_id = Clerk_id;
    }

    public Clerk(int Clerk_id, int Employee_Employee_id) {
        this.Clerk_id = Clerk_id;
        this.Employee_Employee_id = Employee_Employee_id;
    }

    public Clerk(int Clerk_id, int Employee_Employee_id, String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email) {
        super(Employee_Employee_id,First_name, Last_name, NIC, Address, Sex, Contact_no, Registration_date, Email);
        this.Clerk_id = Clerk_id;
        this.Employee_Employee_id = Employee_Employee_id;
    }
    
    

    /**
     * @return the Clerk_id
     */
    public int getClerk_id() {
        return Clerk_id;
    }

    /**
     * @param Clerk_id the Clerk_id to set
     */
    public void setClerk_id(int Clerk_id) {
        this.Clerk_id = Clerk_id;
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
   
}

