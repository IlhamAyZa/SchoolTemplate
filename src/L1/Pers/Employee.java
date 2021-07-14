package L1.Pers;

import L1.Person;
import Parameters.*;

public class Employee extends Person {
    
    employeeType empType;
    
    Employee(int age, String name, float height, Sex sex, employeeType empType) {

        super(age, name, height, sex);
        this.empType = empType;
        
    }

    public employeeType getEmpType() {
        return empType;
    }

    public void setEmpType(employeeType empType) {
        this.empType = empType;
    }
    
    @Override
    public String toString() {
        if (getSex() == Sex.FEMALE) {
            return "Mrs " + this.getName() + " is an " + this.getAge() + " age woman, with " + this.getHeight() + " m height.\n"
                    + "She works as a" + empType;
        } else {
            return "Mr " + this.getName() + " is an " + this.getAge() + " age man, with " + this.getHeight() + " m height.\n"
                    + "He works as a" + empType;
        }
    }   
}
