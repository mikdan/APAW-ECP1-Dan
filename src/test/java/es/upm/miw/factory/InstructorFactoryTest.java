package es.upm.miw.factory;

import static org.junit.Assert.*;

import org.junit.Test;
import es.upm.miw.entities.Instructor;
public class InstructorFactoryTest {
    
    private Instructor ins1;
    private Instructor ins2;
    
    @Test
    //prueba singleton
    public void test() {
        assertSame(InstructorFactory.getInstructorFactory(),InstructorFactory.getInstructorFactory());
    }
    
    @Test
    public void instructorFactoryTest() {
        ins1 = new Instructor(0, "Lily");
        ins2 = new Instructor(1, "Juan");
        InstructorFactory.getInstructorFactory().setInstructors(ins1);
        InstructorFactory.getInstructorFactory().setInstructors(ins2);
        InstructorFactory.getInstructorFactory().getInstructors(0);
        InstructorFactory.getInstructorFactory().getInstructors(1);
    }
    

}
