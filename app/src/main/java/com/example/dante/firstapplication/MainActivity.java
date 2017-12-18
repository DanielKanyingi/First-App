package com.example.dante.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter;
    Button add;
    Button sub;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        //finding view by id...reference to xml
        add = (Button) findViewById(R.id.btnAdd);
        sub = (Button) findViewById(R.id.btnSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        //setting an onClickListener
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write your code here
                counter++;
                display.setText("Your total is " + counter);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write your code here
                counter--;
                display.setText("Your total is " + counter);

            }
        });



    }
}
