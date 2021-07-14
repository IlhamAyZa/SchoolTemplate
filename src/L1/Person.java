package L1;

import Parameters.Sex;

public class Person {

    int age;
    String name;
    float height;
    Sex sex;

    // CONSTRUCTOR
    public Person(int age, String name, float height, Sex sex) {

        this.age = checkAge(age);
        this.name = name;
        this.sex = sex;
        this.height = checkHeight(height);
    }

    // GET SET METHODS
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    // ToString mathod
    @Override
    public String toString() {
        if (getSex() == Sex.FEMALE) {
            return "Mrs " + name + " is an " + age + " age woman, with " + height + " m height.";
        } else {
            return "Mr " + name + " is an " + age + " age man, with " + height + " m height.";
        }
    }

    // methods checking the correctness of input
    private float checkHeight(float input_height) {

        if (0 < input_height && input_height < 4) {
            return input_height;
        } else if (input_height < 400 && input_height > 0) {
            return (float) input_height / 100;
        } else {
            // input_height is negative --> invalid
            System.out.println("Height of Person should not be negative or more than 400 sm. \n Base height was used for Person's (1.65 m).");
            return (float) 1.65;
        }
    }

    private int checkAge(int input_age) {
        if (input_age < 4) {
            System.out.println("Age should not be negative or less than 5. \n Base age was used for Person's (8).");
            return 8;
        } else {
            return input_age;
        }
        
    }
}
