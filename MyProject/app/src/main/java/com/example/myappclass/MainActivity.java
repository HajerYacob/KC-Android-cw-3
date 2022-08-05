package com.example.myappclass;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView a = findViewById(R.id.Calculator);
        Button add =  findViewById(R.id.add);
        Button div =  findViewById(R.id.div);
        Button reslt =  findViewById(R.id.reslt);
        Button mult =  findViewById(R.id.mult);
        Button min =  findViewById(R.id.min);
        TextView total = findViewById(R.id.total);
        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);




    }
}