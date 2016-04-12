package com.example.jz.myapplication;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView text1 = (TextView) findViewById(R.id.first_number);
        TextView text2 = (TextView) findViewById(R.id.second_number);
        final TextView vysledek = (TextView) findViewById(R.id.result);
        Button scitani = (Button) findViewById(R.id.plus);
        Button odecitani = (Button) findViewById(R.id.minus);
        Button nasobeni = (Button) findViewById(R.id.multiply);
        Button deleni = (Button) findViewById(R.id.divide);
        final EditText first_number = (EditText) findViewById(R.id.ins_first_number);
        final EditText second_number = (EditText) findViewById(R.id.ins_second_number);
        text1.setText("X =");
        text2.setText("Y =");
        text1.setTextSize(15);
        text2.setTextSize(15);
        scitani.setText("+");
        odecitani.setText("-");
        nasobeni.setText("*");
        deleni.setText("/");
        vysledek.setTextSize(30);

        scitani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1 = String.valueOf(first_number.getText());
                String S2 = String.valueOf(second_number.getText());
                if (S1.isEmpty()||S2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Empty field",Toast.LENGTH_LONG);

                } else {
                    int result = Integer.parseInt(S1)+Integer.parseInt(S2);
                    vysledek.setText(String.valueOf(result));
                }

            }
        });
        odecitani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1 = String.valueOf(first_number.getText());
                String S2 = String.valueOf(second_number.getText());
                if (S1.isEmpty()||S2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Empty field",Toast.LENGTH_LONG);

                } else {
                    int result = Integer.parseInt(S1)-Integer.parseInt(S2);
                    vysledek.setText(String.valueOf(result));
                }
            }
        });
        nasobeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1 = String.valueOf(first_number.getText());
                String S2 = String.valueOf(second_number.getText());
                if (S1.isEmpty()||S2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Empty field",Toast.LENGTH_LONG);

                } else {
                    int result = Integer.parseInt(S1)*Integer.parseInt(S2);
                    vysledek.setText(String.valueOf(result));
                }
            }
        });
        deleni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1 = String.valueOf(first_number.getText());
                String S2 = String.valueOf(second_number.getText());
                if (S1.isEmpty()||S2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Empty field",Toast.LENGTH_LONG);

                } else {
                    if (S2.contains("0")){
                        Toast.makeText(getApplicationContext(),"Can not divide by zero.",Toast.LENGTH_LONG);
                    } else {
                        int result = Integer.parseInt(S1)/Integer.parseInt(S2);
                        vysledek.setText(String.valueOf(result));
                    }
                }

            }
        });
    }


}

