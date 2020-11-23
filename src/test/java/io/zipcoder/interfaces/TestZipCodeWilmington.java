package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {

    @Before
    public void setup(){
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void testFireStaff(){
        Assert.assertTrue(ZipCodeWilmington.getInstructors().isEmpty());
    }

    @Test
    public void testHireStaff() {
        String[] instructorNames = {"Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu"};
        for (String instructorName : instructorNames) {
            Instructor instructor = new Instructor(instructorName);
            ZipCodeWilmington.hire(instructor);
        }
        Assert.assertEquals(ZipCodeWilmington.getInstructors().size(), 6);
    }
}
