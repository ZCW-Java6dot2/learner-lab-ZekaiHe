package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class TestPerson {

    Person person;

    @Before
    public void constructor(){
        person = new Person("Zekai");
    }

    @Test
    public void getNameTest(){
        String expected = "Zekai";
        String actual = person.getName();
        Assert.assertEquals(expected,actual);

    }

}
