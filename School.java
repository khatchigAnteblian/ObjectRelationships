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
public class School {
    private String name;
    private String address;
    private int capacity;
    
    public School(String nm, String addr, int cap) {
        this.name = nm;
        this.address = addr;
        this.capacity = cap;
    }
    
    public String toString() {
        return "School Name: " + this.name + "\nAddress: " + this.address + "\n";
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getAddress() {
        return this.address;
    }
}
