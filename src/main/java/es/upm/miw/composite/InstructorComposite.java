package es.upm.miw.composite;

import java.util.ArrayList;
import java.util.List;

public class InstructorComposite extends InstructorComponent {
    
    private String name;
    private List<InstructorComponent> instructorList;

    public InstructorComposite(String name) {
        super();
        this.name = name;
        instructorList = new ArrayList<InstructorComponent>();
    }
    
    public String name(){
        return this.getName();
    }

    public String getName() {
        return name;
    }

    public String view() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }

 
    

    @Override
    public void add(InstructorComponent instructorComponent) {
        assert instructorComponent != null;
        instructorList.add(instructorComponent);
        
    }

    @Override
    public void remove(InstructorComponent instructorComponent) {
        assert instructorComponent != null;
        instructorList.remove(instructorComponent);
        
    }

    @Override
    public boolean isComposite() {
        // TODO Auto-generated method stub
        return true;
    }
    
    
    
}
