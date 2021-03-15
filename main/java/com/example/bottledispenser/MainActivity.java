package com.example.bottledispenser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    Button buyBottleButton;
    Button insertMoneyButton;
    Button returnMoneyButton;
    SeekBar seekbar;
    ProgressBar progressBar;
    int getMoney;

    BottleDispenser automaatti = new BottleDispenser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        buyBottleButton = findViewById(R.id.buyBottle);
        insertMoneyButton = findViewById(R.id.insertMoney);
        returnMoneyButton = findViewById(R.id.returnMoney);
        seekbar = findViewById(R.id.seekBar);
        progressBar = findViewById(R.id.progressBar);

        buyBottleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                automaatti.buyBottle(textView);
            }
        });
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                getMoney = progress;
                textView2.setText("" + getMoney + "€");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        insertMoneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                automaatti.addMoney(textView, getMoney);
                seekbar.setProgress(0);
                progressBar.setProgress(0);
                textView2.setText("");
            }
        });

        returnMoneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                automaatti.returnMoney(textView);
            }
        });
    }


}