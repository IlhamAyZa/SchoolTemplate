package L1.Pers;

import L1.Clss.Subject;
import L1.Person;
import Parameters.ScientName;
import Parameters.Sex;

public class Teacher extends Person{
    
    ScientName scNm ;
    Subject subject;

    public Teacher(ScientName scNm, int age, String name, float height, Sex sex, Subject subject) {
        super(age, name, height, sex);
        this.scNm = scNm;
        this.subject = subject;
    }

    public ScientName getScNm() {
        return scNm;
    }

    public void setScNm(ScientName scNm) {
        this.scNm = scNm;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject lesson) {
        this.subject = subject;
    }
       
}
