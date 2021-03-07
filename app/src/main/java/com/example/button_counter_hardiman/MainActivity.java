package com.example.button_counter_hardiman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    Button addButton;
    Button subButton;
    Button clearButton;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.addButton);
        subButton = (Button) findViewById(R.id.subButton);
        clearButton = (Button) findViewById(R.id.clearButton);

        txv = (TextView) findViewById(R.id.txv);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                txv.setText(Integer.toString(count));
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                txv.setText(Integer.toString(count));
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            public void onCLick(View view) {
                count = 0;
                txv.setText(Integer.toString(count));
            }
        });
    }
}