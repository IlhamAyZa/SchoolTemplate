package az.aidazade.school.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parent extends Person {
    private List<Student> students = new ArrayList<>();

    public Parent() {
    }

    public Parent(Long id, String firstName, String lastName, String middleName, Date birthDate) {
        super(id, firstName, lastName, middleName, birthDate);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    
}
