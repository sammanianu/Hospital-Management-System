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
public class Patient_record {
    private int Patient_id;
    private String NIC;
    private String First_name;
    private String Last_name;
    private String Address;
    private String Sex;
    private int Age;
    private String Blood_group;
    private int Contact_no;
    private String Sickness_history;
    //private String Ward_type;
    //private int Receptionist_Receptionist_id;

    public Patient_record() {
    }

    public Patient_record(String NIC, String First_name, String Last_name, String Address, String Sex, int Age, String Blood_group, int Contact_no, String Sickness_history) {
        this.NIC = NIC;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Address = Address;
        this.Sex = Sex;
        this.Age = Age;
        this.Blood_group = Blood_group;
        this.Contact_no = Contact_no;
        this.Sickness_history = Sickness_history;
        //this.Ward_type = Ward_type;
    }

    public Patient_record(int Patient_id, String NIC, String First_name, String Last_name, String Address, String Sex, int Age, String Blood_group, int Contact_no, String Sickness_history) {
        this.Patient_id = Patient_id;
        this.NIC = NIC;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Address = Address;
        this.Sex = Sex;
        this.Age = Age;
        this.Blood_group = Blood_group;
        this.Contact_no = Contact_no;
        this.Sickness_history = Sickness_history;
    }
        
    /**
     * @return the Patient_id
     */
    public int getPatient_id() {
        return Patient_id;
    }

    /**
     * @param Patient_id the Patient_id to set
     */
    public void setPatient_id(int Patient_id) {
        this.Patient_id = Patient_id;
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
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    /**
     * @return the Blood_group
     */
    public String getBlood_group() {
        return Blood_group;
    }

    /**
     * @param Blood_group the Blood_group to set
     */
    public void setBlood_group(String Blood_group) {
        this.Blood_group = Blood_group;
    }

    /**
     * @return the Contact_no
     */
    public int getContact_no() {
        return Contact_no;
    }

    /**
     * @param Contact_no the Contact_no to set
     */
    public void setContact_no(int Contact_no) {
        this.Contact_no = Contact_no;
    }

    /**
     * @return the Sickness_history
     */
    public String getSickness_history() {
        return Sickness_history;
    }

    /**
     * @param Sickness_history the Sickness_history to set
     */
    public void setSickness_history(String Sickness_history) {
        this.Sickness_history = Sickness_history;
    }

    /**
     * @return the Ward_type
     */
    /*public String getWard_type() {
        return Ward_type;
    }*/

    /**
     * @param Ward_type the Ward_type to set
     */
    /*public void setWard_type(String Ward_type) {
        this.Ward_type = Ward_type;
    }*/

    

}
