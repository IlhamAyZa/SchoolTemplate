package L1.Pers;

import L1.Class_;
import L1.Person;
import Parameters.Class_sector;
import Parameters.Sex;

public class Student extends Person{
    
    Class_ class_;
    int mark;

    public Student(Class_ class_, int age, String name, float height, Sex sex, int mark) {
        super(age, name, height, sex);
        this.class_ = class_;
        this.mark = mark;
    }

    public Class_ getClass_() {
        return class_;
    }

    public int getMark() {
        return mark;
    }

    public void setClass_(Class_ class_) {
        this.class_ = class_;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
    
    
    
}
