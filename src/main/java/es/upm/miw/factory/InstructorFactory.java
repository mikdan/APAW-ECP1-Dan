package es.upm.miw.factory;

import java.util.HashMap;
import java.util.Map;

import es.upm.miw.entities.Instructor;

public class InstructorFactory {
    
    private Map<Integer, Instructor> instructors;
    private static final InstructorFactory instructorFactory = new InstructorFactory();

    public InstructorFactory() {
        this.instructors = new HashMap<>();
    }

    public Instructor getInstructors(int id) {
        return instructors.get(id); 
    }

    public static InstructorFactory getInstructorFactory() {
        return instructorFactory;
    }

    public void setInstructors(Instructor instructor) {
        this.instructors.put(instructor.getId(), instructor);
    }

    public void removeInstructors(String id) {
        this.instructors.remove(id);
    }

}
