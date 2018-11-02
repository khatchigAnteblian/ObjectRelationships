/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package objectrelationships;

/**
 *
 * @author 345983704
 */
public class Course {
    private String code;
    private String name;
    private String level;
    
    public Course(String cd, String nm, String lvl) {
        this.code = cd;
        this.name = nm;
        this.level = lvl;
    }
    
    public String toString() {
        return "Course Code: " + this.code + "\nName: " + this.name + "\nLevel: " + this.level + "\n";
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLevel() {
        return this.level;
    }
}
