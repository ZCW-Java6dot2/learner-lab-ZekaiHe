package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    Instructor instructor;
    Student student;
    Student[] students = new Student[3];
    @Before
    public void constructor(){
        instructor = new Instructor("Dr. He");
        student = new Student("Zekai");
        students[0] = new Student("Vi");
        students[1] = new Student("Roger");
        students[2] = new Student("Brian");
    }

    @Test
    public void testImplementation(){
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        double expected = 2;
        instructor.teach(student,expected);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.1);
    }

    @Test
    public void testLecture(){
        double expected = 10.0/3.0;
        instructor.lecture(students, 10);
        double actual = students[1].getTotalStudyTime();
        Assert.assertEquals(actual,expected,0.01);
    }
}
