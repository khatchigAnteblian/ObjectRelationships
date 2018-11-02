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
public class Teacher {
    private String lName;
    private Course[] course = new Course[3];
    private School school;
    
    public Teacher(String ln) {
        this.lName = ln;
    }
    
    public boolean addCourse(Course course) {
        boolean added = false;
        
        for (int i=0; i<this.course.length; i++) {
            if (this.course[i] == null) {
                this.course[i] = course;
                added = true;
                break;
            }
        }
        return added;
    }
    
    public boolean setSchool(School school) {
        boolean added = false;
        if (this.school != school || this.school == null) {
            this.school = school;
            added = true;
        }
        return added;
    }
    
    public String toString() {
        String result = "Last Name: " + this.lName + "\n";
        if (this.school != null) {
            result += this.school;
        }
        
        result += "\nCourses:\n";
        for (Course i: this.course) {
            if (i != null) {
                result += i.toString() + "\n";
            }
        }
        
        return result;
    }
    
    public String getName() {
        return this.lName;
    }
    
    public Course[] getCourses() {
        return this.course;
    }
    
    public School getSchool() {
        return this.school;
    }
}
