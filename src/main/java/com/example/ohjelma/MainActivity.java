package com.example.ohjelma;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText Input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Input = findViewById(R.id.Input);

        //this.test_method();
    }


    public void test_method(View v) {
        //System.out.println("HELLO WORLD!");
        //TextView test = findViewById(R.id.textView);
        textView.setText(Input.getText());

    }
}