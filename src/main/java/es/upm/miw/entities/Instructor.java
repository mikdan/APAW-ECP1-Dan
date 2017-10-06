package es.upm.miw.entities;

import java.util.Calendar;

public class Instructor {
    
    private int id;
    private String firstName;
    private String lastName;
    private Calendar hireDate;
    
    
    
    public Instructor(int id, String firstName, String lastName, Calendar hireDate) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public Calendar getHireDate() {
        return hireDate;
    }
    
    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }
    

}
