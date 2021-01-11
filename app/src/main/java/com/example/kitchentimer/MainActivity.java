 package com.example.kitchentimer;

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.widget.ImageView;
 import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    TextView mTimerText;
    ImageView mStartButton;
    ImageView mStopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTimerText = (TextView) findViewById(R.id.timer_text);
        mStartButton =(ImageView) findViewById(R.id.timer_start);
        mStopButton =(ImageView) findViewById(R.id.timer_stop);
    }
}
