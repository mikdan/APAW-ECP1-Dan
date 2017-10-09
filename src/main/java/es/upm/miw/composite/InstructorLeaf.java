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
        // TODO Auto-generated method stub
        return toString();
    }
    
    

    @Override
    public String toString() {
        return "InstructorLeaf [instructor=" + this.instructor.getId() + "]";
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
