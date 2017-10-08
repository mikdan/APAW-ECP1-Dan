package es.upm.miw.builder;

import es.upm.miw.entities.Course;

public class CourseBuilder {
    
    private Course course;
    
    public CourseBuilder(int id){
        course = new Course(id);
    }
    
    public CourseBuilder title(String title){
        this.course.setTitle(title);
        return this;    
    }
    
    public CourseBuilder credits(int credits){
        this.course.setCredits(credits);
        return this;
    }
    
    public Course build(){
        return this.course;
    }
}
