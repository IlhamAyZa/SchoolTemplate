
package az.aidazade.school.main;

import az.aidazade.school.person.Student;
import az.aidazade.school.subjects.Lesson;

public class JurnalItem {
    
    private Student student;
    private Lesson lesson;
    private int mark;

    public JurnalItem(Student student, Lesson lesson, int mark) {
        this.student = student;
        this.lesson = lesson;
        this.mark = mark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    

}
