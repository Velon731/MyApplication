package com.example.jz.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView one =(TextView) findViewById(R.id.text_file_one);

        one.setText(reverseString("Hello"));
        one.setTextSize(64);
        one.setTextColor(Color.RED);

        Button two = (Button) findViewById(R.id.button_one);

        two.setText("Reverse");
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = one.getText().toString();

                String reverseString = reverseString(text);

                one.setText(reverseString);


            }
        });

        Button three = (Button) findViewById(R.id.button_two);
        three.setText("Calculator");
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSecondActivity();
            }
        });




        reverseString("sentence");

    }

    private void startSecondActivity() {
        Intent myIntent = new Intent(this, Main2Activity.class);
        startActivity(myIntent);
    }

    private String reverseString(String sentence) {

        char[] chars = sentence.toCharArray();

        for (int index = 0; index < sentence.length()/2 ; index++)
        {   char temp = chars[index];
            chars[index] = chars [sentence.length()-1-index];
            chars[sentence.length()-1-index] = temp;

        }


        return new String(chars);
    }
}