package com.example.user.nat_20_reborn;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Toast.makeText(MainActivity.this, "lol still in the first method", Toast.LENGTH_LONG);

            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splash();
//        setContentView(R.layout.nat_20_roller);
    } // end oncreate

public  void splash() {
        CountDownTimer splashTimer = new CountDownTimer(3000, 1000) {

            public void onTick(long millsUntilFinished) {

            }

            @Override
            public void onFinish() {
//                Toast.makeText(MainActivity.this, "changing to roller class", Toast.LENGTH_LONG);

                setContentView(R.layout.nat_20_roller);

//                startActivity(intent);
//                Intent intent = roller.rollerSwap(MainActivity.this);

            }
        }.start();
    // end timer
}// end splash



}
// end all
