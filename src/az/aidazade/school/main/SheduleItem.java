package az.aidazade.school.main;

import az.aidazade.school.main.Group;
import az.aidazade.school.subjects.Lesson;

public class SheduleItem {
    private long id;
    private int numOfDay;
    private int numOfLesson;
    private Lesson lesson;
    private Group group;

    public SheduleItem(long id, int numOfDay, int numOfLesson, Lesson lesson, Group group) {
        this.id = id;
        this.numOfDay = numOfDay;
        this.numOfLesson = numOfLesson;
        this.lesson = lesson;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setNumOfLesson(int numOfLesson) {
        this.numOfLesson = numOfLesson;
    }

    public int getNumOfLesson() {
        return numOfLesson;
    }

    
}
