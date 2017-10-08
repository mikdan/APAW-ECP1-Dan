package es.upm.miw.entities;

public class Course {
    
    private int id;
    private String title;
    private int credits; 
    
    public Course(int id) {
        super();
        this.id = id;
    }
    
    public Course(int id, String title, int credits) {
        super();
        this.id = id;
        this.title = title;
        this.credits = credits;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getCredits() {
        return credits;
    }
    
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    
}
