package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(String name){
        super(name);
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);
    }

    public void lecture(Student[] student, double numberOfHours) {
        double numberOfHoursPerStudent = numberOfHours/student.length;
        for(Student x: student){
            x.learn(numberOfHoursPerStudent);
        }
    }
}
