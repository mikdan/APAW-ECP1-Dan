package es.upm.miw.builder;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.miw.entities.Course;

public class CourseBuilderTest {

    @Test
    public void test() {
        Course course=new CourseBuilder(0).title("CourseMonday").credits(6).build();
        assertEquals(0,course.getId());
        assertEquals("CourseMonday",course.getTitle());
        assertEquals(6,course.getCredits());
        
    }

}
