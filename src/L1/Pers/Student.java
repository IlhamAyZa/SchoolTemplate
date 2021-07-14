package L1.Pers;

import L1.Class_;
import L1.Person;
import Parameters.Class_sector;
import Parameters.Sex;

public class Student extends Person{
    
    Class_ class_;
    Class_sector class_sector;
    int mark;

    public Student(Class_ class_, Class_sector class_sector, int age, String name, float height, Sex sex, int mark) {
        super(age, name, height, sex);
        this.class_ = class_;
        this.class_sector = class_sector;
        this.mark = mark;
    }
    
    
    
}
