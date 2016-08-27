package com.example.kunal.machinetest1;

import android.content.pm.InstrumentationInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText studName;
    EditText studAge;
    Button studAdd;
    PersonDatabase students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        students = new PersonDatabase();
        studAdd = (Button) findViewById(R.id.btn_add);
        studAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add();
            }
        });
    }

    private void add() {
        studName = (EditText) findViewById(R.id.edt_name);
        String name = studName.getText().toString();
        studAge = (EditText) findViewById(R.id.edt_age);
        Integer age = Integer.parseInt(studAge.getText().toString());

        Person person = new Person();
        person.setAge(age);
        person.setName(name);
        if(students.addPerson(person)){

            Log.d("person", person.toString());
        }else {

        }
    }
}
