package com.example.kunal.machinetest1;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KUNAL on 8/27/2016.
 */
public class PersonDatabase {

    List<Person> student;

    public PersonDatabase(){
        student = new ArrayList<Person>();
    }

    public boolean addPerson(Person person){
        if (student.size() <=5)
            student.add(person);
        else
            return false;

        return true;

    }


}
