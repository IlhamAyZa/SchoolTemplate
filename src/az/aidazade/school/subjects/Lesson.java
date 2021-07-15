package az.aidazade.school.subjects;

import az.aidazade.school.main.Group;
import az.aidazade.school.person.Student;
import az.aidazade.school.person.Teacher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lesson {
    
    private long id;
    private long duration;
    private Date date;
    private Subject subject;
    private List<Student> students = new ArrayList<>();
    private Teacher teacher;
    private Group group;

    public Lesson() {
    }

    public Lesson(long id, long duration, Date date, Subject subject, Teacher teacher, Group group) {
        this.id = id;
        this.duration = duration;
        this.date = date;
        this.subject = subject;
        this.teacher = teacher;
        this.group = group;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    
    
    
}
