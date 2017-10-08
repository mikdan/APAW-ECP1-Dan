package es.upm.miw.builder;

import java.util.Calendar;

import es.upm.miw.entities.Instructor;

public class InstructorBuilder {
    
    private Instructor instructor;
    
    public InstructorBuilder(int id, String firstName){
        this.instructor = new Instructor(id,firstName);
    }
    
    public InstructorBuilder(){
        this(0, "");
    }
    
    public InstructorBuilder id(int id){
        this.instructor.setId(id);;
        return this;
    }
    
    public InstructorBuilder firstName(String firstName){
        this.instructor.setFirstName(firstName);
        return this;    
    }
    
    public InstructorBuilder lastName(String lastName){
        this.instructor.setFirstName(lastName);
        return this;    
    }
    
    public InstructorBuilder hireDate(Calendar hireDate){
        this.instructor.setHireDate(hireDate);
        return this;    
    }
    
}
