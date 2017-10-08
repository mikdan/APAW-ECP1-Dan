package es.upm.miw.builder;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import es.upm.miw.entities.Instructor;

public class InstructorBuilderTest {

    @Test
    public void test() {
        Instructor instructor = new InstructorBuilder(0, "Lily").lastName("Sanchez").hireDate(Calendar.getInstance()).build();
        assertEquals(0,instructor.getId());
        assertEquals("Lily",instructor.getFirstName());
        assertEquals("Sanchez",instructor.getLastName());
        
    }

}
