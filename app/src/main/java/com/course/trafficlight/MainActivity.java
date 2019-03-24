package com.course.trafficlight;

import android.app.Activity;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
class TestActivity extends Activity {

    Button button1 = null;
    long timeout = Long.MAX_VALUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button1.setBackgroundColor(Color.RED);

        change();
    }

    void change() {
        final int[] colors = {Color.GREEN, Color.ORANGE, Color.RED};
        CountDownTimer ctd = new CountDownTimer(timeout, 120) {

            int current = 0;

            @Override
            public void onTick(long arg0) {
                Log.d("TEST", "Current color index: " + current);
                button1.setBackgroundColor(colors[current++]);
                if (current == 3)
                    current = 0;
            }

            @Override
            public void onFinish() {
            }
        };

        ctd.start();
    }
}
