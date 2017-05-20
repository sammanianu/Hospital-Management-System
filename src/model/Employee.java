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
public class Employee {
    private int employeeId;
    private String First_name;
    private String Last_name;
    private String NIC;
    private String Address;
    private String Sex;
    private String Contact_no;
    private String Registration_date;
    private String Email;

    public Employee() {
    }

    public Employee(String First_name, String Last_name, String NIC, String Address, String Sex, String Contact_no, String Registration_date, String Email) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.NIC = NIC;
        this.Address = Address;
        this.Sex = Sex;
        this.Contact_no = Contact_no;
        this.Registration_date = Registration_date;
        this.Email = Email;
    }

    public Employee(int Employee_id, String First_name, String Last_name, String NIC, String Address, String Sex, String Contactno, String Registration_date, String Email) {
        this.employeeId = Employee_id;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.NIC = NIC;
        this.Address = Address;
        this.Sex = Sex;
        this.Contact_no = Contactno;
        this.Registration_date = Registration_date;
        this.Email = Email;
    }

    
    /**
     * @return the employeeId
     */
    public int getEmployee_id() {
        return employeeId;
    }

    /**
     * @param Employee_id the employeeId to set
     */
    public void setEmployee_id(int Employee_id) {
        this.employeeId = Employee_id;
    }

    /**
     * @return the First_name
     */
    public String getFirst_name() {
        return First_name;
    }

    /**
     * @param First_name the First_name to set
     */
    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    /**
     * @return the Last_name
     */
    public String getLast_name() {
        return Last_name;
    }

    /**
     * @param Last_name the Last_name to set
     */
    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Sex
     */
    public String getSex() {
        return Sex;
    }

    /**
     * @param Sex the Sex to set
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * @return the Contact_no
     */
    public String getContact_no() {
        return Contact_no;
    }

    /**
     * @param Contact_no the Contact_no to set
     */
    public void setContact_no(String Contact_no) {
        this.Contact_no = Contact_no;
    }

    /**
     * @return the Registration_date
     */
    public String getRegistration_date() {
        return Registration_date;
    }

    /**
     * @param Registration_date the Registration_date to set
     */
    public void setRegistration_date(String Registration_date) {
        this.Registration_date = Registration_date;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    
}

    