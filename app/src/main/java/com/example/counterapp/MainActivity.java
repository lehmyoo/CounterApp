package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    // Declare all Variables
    // Link the elements (widgets) to the java file
    // on click listener but adding and subtracting

    TextView textView;
    int counter = 0;
    FloatingActionButton floatPlus, floatMinus;
    CircularProgressIndicator  circularProgressIndicator;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Linking
        textView = (TextView) findViewById(R.id.textView);
        floatPlus = (FloatingActionButton)  findViewById(R.id.buttonPlus);
        floatMinus = (FloatingActionButton)  findViewById(R.id.buttonMinus);
        circularProgressIndicator = (CircularProgressIndicator) findViewById(R.id.ci);
;
        floatPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circularProgressIndicator.setVisibility(v.VISIBLE);
                counter++;
                textView.setText(Integer.toString(counter));
                Snackbar.make(v,"Counter Added",Snackbar.LENGTH_LONG).setAction("Action",null).show();
            }
        });

        floatMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circularProgressIndicator.setVisibility(v.VISIBLE);
                counter --;
                textView.setText(Integer.toString(counter));
                Snackbar.make(v,"Counter Deducted",Snackbar.LENGTH_SHORT).setAction("Action",null).show();

            }
        });
    }
}