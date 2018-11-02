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
public class Student {
    private String fName;
    private String lName;
    private Course[] course = new Course[4];
    private School school;
    
    public Student(String first, String last) {
        this.fName = first;
        this.lName = last;
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
        String result = "Full Name: " + this.fName + " " + this.lName + "\n" + this.school + "\nCourses:\n";
        for (Course i: this.course) {
            result += i.toString() + "\n";
        }
        return result;
    }
    
    public String getName() {
        return this.fName + " " + this.lName;
    }
    
    public Course[] getCourses() {
        return this.course;
    }
    
    public School getSchool() {
        return this.school;
    }
}
