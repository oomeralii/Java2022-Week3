package entities;

public class Educators {
    private int id;
    private String educaterName;
    private String educatorLastName;

    public Educators(int id, String educaterName, String educatorLastName) {
        this.id = id;
        this.educaterName = educaterName;
        this.educatorLastName = educatorLastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducaterName() {
        return educaterName;
    }

    public void setEducaterName(String educaterName) {
        this.educaterName = educaterName;
    }

    public String getEducatorLastName() {
        return educatorLastName;
    }

    public void setEducatorLastName(String educatorLastName) {
        this.educatorLastName = educatorLastName;
    }
}
