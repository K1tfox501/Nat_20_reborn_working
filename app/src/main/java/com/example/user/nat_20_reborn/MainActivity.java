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
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            b1 = (Button) findViewById(R.id.b1);

//        splash();
//        setContentView(R.layout.nat_20_roller);
    } // end oncreate
    //for splash/MainActivity

    @Override
    protected void onStart(){
        super.onStart();

//        b1.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick (View v)
//            {
//                Toast.makeText(MainActivity.this, "in the first method", Toast.LENGTH_LONG);
//                  setContentView(R.layout.nat_20_roller);
//                startActivity(die_roller.die_rollerSwap(MainActivity.this));
//                startActivity(new Intent(MainActivity.this, die_roller.class));
//                System.out.print("i am working");
//            }
//        });
//        splash();

    }

public  void splash() {
        CountDownTimer splashTimer = new CountDownTimer(3000, 1000) {

            public void onTick(long millsUntilFinished) {

            }


            public void onFinish() {
//                Toast.makeText(MainActivity.this, "ding", Toast.LENGTH_LONG);

//                Toast.makeText(MainActivity.this, "changing to roller class", Toast.LENGTH_LONG);

//                setContentView(R.layout.nat_20_roller);
                Intent intent = die_roller.die_rollerSwap(MainActivity.this);
                startActivity(intent);
            }
        };
    // end timer
}// end splash
    //end splash/mainactiviy



}
// end all
