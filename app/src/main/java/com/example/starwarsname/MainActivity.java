package com.example.starwarsname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText FirstName;
    private EditText LastName;
    private EditText MomsMiddleName;
    private EditText CityBorn;
    private TextView StarName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirstName = findViewById(R.id.FirstName);
        LastName = findViewById(R.id.LastName);
        MomsMiddleName = findViewById(R.id.MomsMiddleName);
        CityBorn = findViewById(R.id.City);
        StarName = findViewById(R.id.Name);
        ImageButton generate = findViewById(R.id.Generate);

        generate.setOnClickListener(v -> {
            calculateName();
        });


    }

    public void calculateName(){
        String first  =  FirstName.getText().toString();
        String last = LastName.getText().toString();
        String momMiddle = MomsMiddleName.getText().toString();
        String born = CityBorn.getText().toString();

        String starWarsName = "Welcome! " + last.substring(0,3) + first.substring(0,2) + " " + momMiddle.substring(0,2) + born.substring(0,2) + ", May the force be with you!";
        StarName.setText(starWarsName);
    }
}