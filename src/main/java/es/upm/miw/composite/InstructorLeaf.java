package es.upm.miw.composite;

import es.upm.miw.entities.Instructor;

public class InstructorLeaf extends InstructorComponent{
   
    private Instructor instructor;

    public InstructorLeaf(Instructor instructor) {
        super();
        this.instructor = instructor;
    }

    @Override
    public String view() {
        System.out.println(instructor.getId());
        return (new StringBuilder()).append(instructor.getId()).toString();
        // TODO Auto-generated method stub
    }
    
    @Override
    public void add(InstructorComponent instructorComponent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Operación no soportada");
        
    }

    @Override
    public void remove(InstructorComponent instructorComponent) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Operación no soportada");
        
    }

    @Override
    public boolean isComposite() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
