package es.upm.miw.composite;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.builder.InstructorBuilder;
import es.upm.miw.entities.Instructor;
public class InstructorCompositeTest {
    
    private Instructor ins1;
    
    private InstructorLeaf leaf1;
    
    private InstructorComposite insComposite1;
    
    @Before
    public void before(){
        
        ins1 = new InstructorBuilder().id(0).firstName("Lily").lastName("Sanchez").hireDate(Calendar.getInstance()).build();
        
        leaf1 = new InstructorLeaf(ins1);
        
        insComposite1 = new InstructorComposite("newInstructor");
        
        
    }

    @Test
    public void testLeaf() {
        assertEquals("0", this.leaf1.view());
    }
    
    @Test
    public void testCompositeName() {
        assertEquals("newInstructor", this.insComposite1.view());
    }

}
