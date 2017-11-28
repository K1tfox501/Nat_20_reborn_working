package com.example.user.nat_20_reborn;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class die_roller extends AppCompatActivity {
    //give buttons names and pre declare them
    String tag = "Lifecycle Step";
    Button d20, d4, d6, d10, d12, percentile, d8;
    EditText modifier;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(tag, "in the onCreate () event");
        // declare all the buttons
        setContentView(R.layout.activity_die_roller);

        d20 = (Button) findViewById(R.id.d20);
        d12 = (Button) findViewById(R.id.d12);
        d10 = (Button) findViewById(R.id.d10);
        d8 = (Button)findViewById(R.id.d8);
        d6 = (Button) findViewById(R.id.d6);
        d4 = (Button) findViewById(R.id.d4);
        percentile = (Button) findViewById(R.id.percentile);
        modifier = (EditText) findViewById(R.id.modifier);
        result = (TextView) findViewById(R.id.result);
    }

    //test
//    public static Intent swap_roller(Context context){
//        return new Intent(context, roller.class);

    //    }
    //end test
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
//proxied "dumb" rollers, probably will change to use a function in another java file so they can be executed by another program
        result.setText("im working");
        //d20
        d20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Random d20 = new Random();
                result.setText(String.valueOf(d20.nextInt(20) + 1));
            }
        });
        //d12
        d12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Random d12 = new Random();
                result.setText(String.valueOf(d12.nextInt(12) + 1));
                System.out.println("button is pressed");
            }
        });
        //d10
        d10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Random d10 = new Random();
                result.setText(String.valueOf(d10.nextInt(10) + 1));
            }
        });
        //d8
        d8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Random d8 = new Random();
                result.setText(String.valueOf(d8.nextInt(8) + 1));
            }
        });
        //d6
        d6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Random D6 = new Random();
                result.setText(String.valueOf(D6.nextInt(6) + 1));
            }
        });
        //d4
        d4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Random d4 = new Random();
                result.setText(String.valueOf(d4.nextInt(4) + 1));
            }
        });
        //percentile
        percentile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Random d100 = new Random();
                result.setText(String.valueOf(d100.nextInt(100) + 1));
            }

        });
    }
    @Override
    public void onRestart ()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart () event");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }
    @Override
    public void onDestroy ()
    {
        super.onDestroy();
        Log.d(tag, "in the onDestroy() event");
    }

    public static Intent die_rollerSwap (Context context){
        return new Intent(context, roller.class);
    }

}