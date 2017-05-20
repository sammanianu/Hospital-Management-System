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
public class Ward {
    private int Ward_id;
    private String Type;

    public Ward() {
    }

    public Ward(int Ward_id, String Type) {
        this.Ward_id = Ward_id;
        this.Type = Type;
    }

    /**
     * @return the Ward_id
     */
    public int getWard_id() {
        return Ward_id;
    }

    /**
     * @param Ward_id the Ward_id to set
     */
    public void setWard_id(int Ward_id) {
        this.Ward_id = Ward_id;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }
    
    
}

