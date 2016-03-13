package com.example.android.logical;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    TextView textView_sup;
    public int cislo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text);
        textView_sup = (TextView)findViewById(R.id.text_podminky);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cislo = (int) (Math.random() * 20) +1;
                Log.e("CISLO", "Cislo je: " + cislo);
                textView.setText(String.valueOf(cislo));
                text();


                }


        });

    }
    public void text() {

        switch (cislo) {
            case (2):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("+");
                break;
            case (4):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("+ -");
                break;
            case (5):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("(1)");
                break;
            case (6):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("+");
                break;
            case (8):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("+ -");
                break;
            case (9):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("(1)");
                break;
            case (12):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("-");
                break;
            case (13):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("-");
                break;
            case (14):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("+ -");
                break;
            case (16):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("-");
                break;
            case (17):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("(1, 13)");
                break;
            case (18):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("-");
                break;
            case (19):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("(11, 13)");
                break;
            case (20):
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("-");
                break;
            default:
                textView.setText(String.valueOf(cislo));
                textView_sup.setText("");
                break;
        }

        }




}
