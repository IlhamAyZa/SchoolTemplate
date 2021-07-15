package az.aidazade.school.person;

import az.aidazade.school.subjects.Subject;
import az.aidazade.school.main.Group;
import az.aidazade.school.subjects.Lesson;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Student extends Person {

    public HashMap<Lesson, Integer> assesments = new HashMap<>();
    private List<Subject> subjects = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();
    private List<Parent> parents = new ArrayList<>();
    private Group group;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String middleName, Date birthDate) {
        super(id, firstName, lastName, middleName, birthDate);
        
    }
    
    

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public HashMap<Lesson, Integer> getAssesments() {
        return assesments;
    }
    
    
    
}
