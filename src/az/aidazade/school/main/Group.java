package az.aidazade.school.main;

import az.aidazade.school.person.Student;
import az.aidazade.school.subjects.Subject;
import az.aidazade.school.person.Teacher;
import az.aidazade.school.subjects.Lesson;
import az.aidazade.school.utils.Sector;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private long id;
    private String name;
    private int grade;
    private Sector sector;

    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();

    public Group() {
    }

    public Group(String name, int grade, Sector sector) {
        this.name = name;
        this.grade = grade;
        this.sector = sector;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
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

    
}
