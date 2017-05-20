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
public class Test {
    //private int Admission_id;
    private int Test_id;
    private int Doctor_id;
    private String Category;
    private String Description;
    private String Date;
    private String results;

    public Test() {
    }

    public Test(int Doctor_id, String Category, String Description, String Date, String results) {
        this.Doctor_id = Doctor_id;
        this.Category = Category;
        this.Description = Description;
        this.Date = Date;
        this.results = results;
    }

    public Test(int Test_id, int Doctor_id, String Category, String Description, String Date, String results) {
        this.Test_id = Test_id;
        this.Doctor_id = Doctor_id;
        this.Category = Category;
        this.Description = Description;
        this.Date = Date;
        this.results = results;
    }

    /**
     * @return the Test_id
     */
    public int getTest_id() {
        return Test_id;
    }

    /**
     * @param Test_id the Test_id to set
     */
    public void setTest_id(int Test_id) {
        this.Test_id = Test_id;
    }

    /**
     * @return the Doctor_id
     */
    public int getDoctor_id() {
        return Doctor_id;
    }

    /**
     * @param Doctor_id the Doctor_id to set
     */
    public void setDoctor_id(int Doctor_id) {
        this.Doctor_id = Doctor_id;
    }

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the results
     */
    public String getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(String results) {
        this.results = results;
    }

   
}
