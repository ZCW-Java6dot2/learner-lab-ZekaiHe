package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class TestClassRoom {
    ClassRoom classroom;

    @Before
    public void setup(){
        classroom = new ClassRoom();
    }

    @Test
    public void testGetRoster(){
        ArrayList<Person> total = new ArrayList<Person>();
        total.addAll(ZipCodeWilmington.getInstructors());
        total.addAll(TechConnect.getStudents());
        for (Person x: classroom.getRoster().values())
        Assert.assertTrue(total.contains(x));
        }
}
