package es.upm.miw.composite;

public abstract class InstructorComponent {
    public abstract String view();
    public abstract void add(InstructorComponent instructorComponent);
    public abstract void remove(InstructorComponent instructorComponent);
    public abstract boolean isComposite();
    
}
