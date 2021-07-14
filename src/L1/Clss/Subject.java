package L1.Clss;

import L1.Pers.Teacher;
import java.util.*;

public class Subject {
    
    List<Lesson> lessons;
    Teacher teacher;

    public Subject(List<Lesson> lessons, Teacher teacher) {
        this.lessons = lessons;
        this.teacher = teacher;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
    
    public void addLesson(Lesson lesson){
        lessons.add(lesson);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }  
    
}
