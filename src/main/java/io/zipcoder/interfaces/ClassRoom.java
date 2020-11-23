package io.zipcoder.interfaces;

import java.util.HashMap;

public class ClassRoom {
    private HashMap<String, Person> roster;

    public ClassRoom(){
        roster = new HashMap<String, Person>();
    }
    public HashMap<String,Person> getRoster(){
        for(Instructor x: ZipCodeWilmington.getInstructors()){
            roster.put(x.getName(), x);
        }
        for(Student y: TechConnect.getStudents()){
            roster.put(y.getName(), y);
        }
        return roster;
    }

}
