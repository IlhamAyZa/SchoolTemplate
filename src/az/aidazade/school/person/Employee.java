package az.aidazade.school.person;

import az.aidazade.school.main.Group;
import az.aidazade.school.utils.EmployeeType;
import java.util.Date;

public class Employee extends Person{
    EmployeeType employeeType;

    public Employee(EmployeeType employeeType, Long id, String firstName, String lastName, String middleName, Date birthDate) {
        super(id, firstName, lastName, middleName, birthDate);
        this.employeeType = employeeType;
    }

    public Employee() {
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
    
    public void changeStudentGroup(Group group1, Group group2, Student student){
        if ( employeeType == EmployeeType.STAFF || employeeType == EmployeeType.SECRETARY){
            group1.getStudents().remove(student);
            group2.getStudents().add(student);
            student.setGroup(group2);
        }
        else{
            System.out.println("Only Staff or Secretary can transfer student into different group");
        }
    }
}
