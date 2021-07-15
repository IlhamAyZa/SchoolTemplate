package az.aidazade.school.person;

import az.aidazade.school.subjects.Subject;
import az.aidazade.school.main.Group;
import az.aidazade.school.subjects.Lesson;
import az.aidazade.school.utils.ScienceName;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends Person {

    private ScienceName scienceName;

    public Teacher() {
    }

    private List<Subject> subjects = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();

    public Teacher(ScienceName scienceName, Long id, String firstName, String lastName, String middleName, Date birthDate) {
        super(id, firstName, lastName, middleName, birthDate);
        this.scienceName = scienceName;
    }

    public ScienceName getScienceName() {
        return scienceName;
    }

    public void setScienceName(ScienceName scienceName) {
        this.scienceName = scienceName;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
 
    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
    
    public void setMark(Student student, int mark, Lesson lesson){
        
        student.assesments.put(lesson, mark);
        
    }
    
}
