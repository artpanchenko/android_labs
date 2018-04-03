package com.example.artem1.laba_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private Button bcreate;
    private Button next;
    private LinearLayout mLayout;
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bcreate = findViewById(R.id.BCreate);
        bcreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mLayout=(LinearLayout)findViewById(R.id.SV_LL);
                Button b = new Button(view.getContext());
                b.setText("Success");
                b.setTextSize(20);
                mLayout.addView(b);
            }
        });

        next = findViewById(R.id.BNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                EditText editText = (EditText) findViewById(R.id.ETName_of_controll);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
    }
}
