package az.aidazade.school.main;

import az.aidazade.school.person.Employee;
import az.aidazade.school.subjects.Lesson;
import az.aidazade.school.person.Student;
import az.aidazade.school.subjects.Subject;
import az.aidazade.school.person.Teacher;
import az.aidazade.school.utils.EmployeeType;
import az.aidazade.school.utils.ScienceName;
import az.aidazade.school.utils.Sector;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create Students, Groups and Teachers
        Student personNumber1 = new Student(1L, "Ahmed", "Yusubov", "Jafar", new Date(2000, 5, 31));
        Student personNumber2 = new Student(2L, "Vugar", "", "", new Date(2000, 4, 12));
        Student personNumber3 = new Student(3L, "Fidan", "Ayubov", "Kamal", new Date(2000, 11, 27));
        Student personNumber4 = new Student(4L, "Huraman", "", "", new Date(1998, 11, 31));
        Student personNumber5 = new Student(5L, "Nasib", "", "", new Date(1999, 3, 3));
        Student personNumber6 = new Student(6L, "Rafael", "", "", new Date(1999, 10, 21));
        Student personNumber7 = new Student(7L, "Usuf", "", "", new Date(1999, 12, 28));

        Group group1A = new Group("1A", 1, Sector.AZERBAYCAN);
        Group group2B = new Group("2B", 2, Sector.RUS);

        group1A.getStudents().add(personNumber1);
        group1A.getStudents().add(personNumber2);
        group1A.getStudents().add(personNumber3);
        group1A.getStudents().add(personNumber7);

        group2B.getStudents().add(personNumber4);
        group2B.getStudents().add(personNumber5);
        group2B.getStudents().add(personNumber6);

        Teacher teacherNumber1 = new Teacher(ScienceName.TEACHER, 801L, "Gulnara", " ", " ", new Date(1976, 3, 12));
        Teacher teacherNumber2 = new Teacher(ScienceName.TEACHER, 802L, "Ahmed", " ", " ", new Date(1974, 4, 22));

        group1A.getTeachers().add(teacherNumber1);
        group2B.getTeachers().add(teacherNumber2);

        // Create Subjects, lessons and Shedule
        Subject subjectNumber1 = new Subject(1001L, "Math");
        Subject subjectNumber2 = new Subject(1002L, "Litreature");

        group1A.getSubjects().add(subjectNumber1);
        group1A.getSubjects().add(subjectNumber2);

        group2B.getSubjects().add(subjectNumber1);
        group2B.getSubjects().add(subjectNumber2);

        Lesson lessonNumber1G1A = new Lesson(3001L, 45, new Date(2021, 7, 13), subjectNumber1, teacherNumber1, group1A);
        Lesson lessonNumber2G1A = new Lesson(3002L, 45, new Date(2021, 7, 13), subjectNumber2, teacherNumber1, group1A);
        Lesson lessonNumber1G2B = new Lesson(3011L, 45, new Date(2021, 7, 13), subjectNumber2, teacherNumber2, group2B);
        Lesson lessonNumber2G2B = new Lesson(3012L, 45, new Date(2021, 7, 13), subjectNumber1, teacherNumber2, group2B);

        teacherNumber1.setMark(personNumber3, 5, lessonNumber1G1A);

        System.out.println(personNumber3.getAssesments().get(lessonNumber1G1A));

        SheduleItem item1 = new SheduleItem(50L, 1, 1, lessonNumber1G1A, group1A);
        SheduleItem item2 = new SheduleItem(51L, 1, 2, lessonNumber2G1A, group1A);

        SheduleItem item11 = new SheduleItem(60L, 1, 1, lessonNumber1G2B, group2B);
        SheduleItem item12 = new SheduleItem(61L, 1, 2, lessonNumber2G2B, group2B);

        List<SheduleItem> day1 = new ArrayList<>();
        day1.add(item1);
        day1.add(item2);
        day1.add(item11);
        day1.add(item12);

        Schedule sheduleOfDay1 = new Schedule(day1);

        System.out.println("Shedule: ");

        sheduleOfDay1.getSheduleItems().forEach(System.out::print);

        // Printing Groups
        System.out.println("");

        System.out.println("Print Groups: ");

        group1A.getStudents().forEach(System.out::print);
        System.out.println("");
        group2B.getStudents().forEach(System.out::print);

        System.out.println("Wrong linking was made. Repairing ...");

        Employee employee1 = new Employee(EmployeeType.SECRETARY, 111L, "Ilaha", "", "", new Date(1980, 2, 2));

        employee1.changeStudentGroup(group1A, group2B, personNumber7);

        System.out.println("Print Groups: ");

        group1A.getStudents().forEach(System.out::print);
        System.out.println("");
        group2B.getStudents().forEach(System.out::print);

    }

}
