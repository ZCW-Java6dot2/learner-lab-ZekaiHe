package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {

        Student student;

        @Before
        public void Constructor(){
            student = new Student("Zekai");
        }

        @Test
        public void testImplementation(){
            Assert.assertTrue(student instanceof Learner);
        }

        @Test
        public void testInheritance(){
            Assert.assertTrue(student instanceof Person);
        }

        @Test
        public void testLearn(){
            double expected = 2;
            student.learn(expected);
            double actual = student.getTotalStudyTime();
            Assert.assertEquals(expected,actual,0.1);
        }
}
