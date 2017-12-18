package com.example.dante.firstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);//setting refernce to the xml layout


        Button chkCmd = (Button) findViewById(R.id.bResults);
        final ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
        final EditText input = (EditText) findViewById(R.id.etCommands);
        final TextView display = (TextView) findViewById(R.id.tvDisplay);

        passTog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (passTog.isChecked()){
                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                }else {

                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                }

            }
        });

        chkCmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String check = input.getText().toString();

                if (check.contentEquals("left")){
                    display.setGravity(Gravity.START);
                }else if (check.contentEquals("center")){
                    display.setGravity(Gravity.CENTER);
                }else if (check.contentEquals("right")){
                    display.setGravity(Gravity.END);
                }
            }
        });

    }
}
