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
public class ObjectRelationships {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise questions.
        
        // e) Create 2 school objects and 8 course objects.
        School schl1 = new School("Northview", "550 Finch West", 2500);
        School schl2 = new School("Earl Haig", "100 Princess Ave", 3000);
        
        Course course1 = new Course("MCR3U", "Functions", "11");
        Course course2 = new Course("MHF4U", "Advanced Functions", "12");
        Course course3 = new Course("SPH3U", "Physics", "11");
        Course course4 = new Course("SPH4U", "Physics", "12");
        Course course5 = new Course("ICS3U", "Computer Science", "11");
        Course course6 = new Course("ICS4U", "Computer Science", "12");
        Course course7 = new Course("ENG3U", "English", "11");
        Course course8 = new Course("ENG4U", "English", "12");
        
        // f) Create 3 student objects, 2 belonging to one school
        // and the other to another; add courses to each student.
        
        Student[] students = {new Student("John", "Doe"), 
                              new Student("Jane", "Doe"), 
                              new Student("Jackie", "Wilson")};
        
        students[0].setSchool(schl1);
        students[1].setSchool(schl2);
        students[2].setSchool(schl1);
        
        students[0].addCourse(course1);
        students[0].addCourse(course4);
        students[0].addCourse(course5);
        students[0].addCourse(course8);
        
        students[1].addCourse(course2);
        students[1].addCourse(course3);
        students[1].addCourse(course6);
        students[1].addCourse(course8);
        
        students[2].addCourse(course1);
        students[2].addCourse(course3);
        students[2].addCourse(course5);
        students[2].addCourse(course7);
        
        // g) Create 2 teacher objects, each belonging to a different school; 
        // add courses to each teacher.
        
        Teacher[] teachers = {new Teacher("Anderson"), new Teacher("Johnson")};
        
        teachers[0].setSchool(schl2);
        teachers[1].setSchool(schl1);
        
        teachers[0].addCourse(course1);
        teachers[0].addCourse(course3);
        
        teachers[1].addCourse(course6);
        teachers[1].addCourse(course8);
        
        // h) For each student, output all their information, along with details 
        // on each course they are taking and   the school they are attending.
        
        for (int i=0; i<students.length; i++) {
            System.out.println("Student " + (i+1));
            System.out.println("----------------------");
            System.out.println(students[i].toString());
        }

        // i) For each teacher, output all their information, 
        // along with details on each course they are teaching and the school they are attending.

        for (int i=0; i<teachers.length; i++) {
            System.out.println("Teacher " + (i+1));
            System.out.println("----------------------");
            System.out.println(teachers[i].toString());
        }

    }
    
}
