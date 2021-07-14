package L1;

import L1.Build.Room;
import L1.Clss.Subject;
import L1.Pers.Student;
import Parameters.Class_sector;
import java.util.*;

public class Class_ {

    Room room;
    Class_sector class_sector;
    List<Subject> subjects;
    List<Student> students;

    public Class_(Room room, Class_sector class_sector, List<Subject> subjects, List<Student> students) {
        this.room = room;
        this.subjects = subjects;
        this.students = students;
        this.class_sector = class_sector;
    }

    public Room getRoom() {
        return room;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addStudent(Student std) {
        this.students.add(std);
    }

    public void addSubject(Subject sbj) {
        this.subjects.add(sbj);
    }

    public void removeStudent(Student std) {
        this.students.remove(std);
    }

    public void removeSubject(Subject sbj) {
        this.subjects.remove(sbj);
    }

    public Class_sector getClass_sector() {
        return class_sector;
    }

    public void setClass_sector(Class_sector class_sector) {
        this.class_sector = class_sector;
    }
   
}
