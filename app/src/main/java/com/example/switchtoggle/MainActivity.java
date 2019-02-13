package com.example.switchtoggle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tvred, tvgreen, tvblue, tvyellow;
    ToggleButton tg;
    Switch sw;
    LinearLayout ll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        tg = (ToggleButton) findViewById(R.id.tg);
        sw = (Switch) findViewById(R.id.sw);
        ll = (LinearLayout) findViewById(R.id.ll);


    }

    public void clicked(View view) {
        if (tg.isChecked()){
            if (sw.isChecked()){
                ll.setBackgroundColor(Color.GREEN);
            }
            else ll.setBackgroundColor(Color.BLUE);
        }
        else {
            if (sw.isChecked()){
                ll.setBackgroundColor(Color.RED);
            }
            else ll.setBackgroundColor(Color.YELLOW);
        }
    }
}
