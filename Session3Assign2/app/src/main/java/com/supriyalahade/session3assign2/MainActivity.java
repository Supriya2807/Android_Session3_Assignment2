package com.supriyalahade.session3assign2;

import android.media.MediaPlayer;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button red,orange,yellow,green,blue,indigo,violet;
    MediaPlayer redsound,orangesound;
    Toast toast;
    Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red=(Button)findViewById(R.id.Red_Button);
        orange=(Button)findViewById(R.id.Orange_Button);
        yellow=(Button)findViewById(R.id.Yellow_Button);
        green=(Button)findViewById(R.id.Green_Button);
        blue=(Button)findViewById(R.id.Blue_Button);
        indigo=(Button)findViewById(R.id.Indigo_Button);
        violet=(Button)findViewById(R.id.Violet_Button);

        red.setOnClickListener(this);
        orange.setOnClickListener(this);
        yellow.setOnClickListener(this);
        green.setOnClickListener(this);
        blue.setOnClickListener(this);
        indigo.setOnClickListener(this);
        violet.setOnClickListener(this);


        Log.v("My Custom Tag","Initialising Sounds");

        redsound= MediaPlayer.create(this,R.raw.westminsterchimes);
        orangesound=MediaPlayer.create(this,R.raw.jinglebells);





    }



    @Override
    public void onClick(View view) {

            if(view.getId()==R.id.Red_Button){

               toast= Toast.makeText(this,"Playing Westmister Chimes",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();

                Log.v("My Custom Tag","Playing Red Sound");
                redsound.start();


            }
        else if(view.getId()==R.id.Orange_Button){


            toast= Toast.makeText(this,"You Clicked Orange",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,10);
                toast.show();
                Log.v("My Custom Tag","Playing Orange Sound");
                orangesound.start();
            }

        else if(view.getId()==R.id.Yellow_Button){

            toast= Toast.makeText(this,"You Clicked Yellow",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,10);
                toast.show();


            }

        else if(view.getId()==R.id.Green_Button){

               toast= Toast.makeText(this,"You Clicked Green",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,90);
                toast.show();


            }
        else if(view.getId()==R.id.Blue_Button){

               toast= Toast.makeText(this,"You Clicked Blue",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,150);
                toast.show();

            }
        else if(view.getId()==R.id.Indigo_Button){

               toast= Toast.makeText(this,"You Clicked Indigo",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,200);
                toast.show();


            }

        else if(view.getId()==R.id.Violet_Button){

               toast= Toast.makeText(this,"You Clicked Violet",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,250);
                toast.show();

            }

    }

    @Override
    protected void onPause() {
        super.onPause();
        redsound.release();
        orangesound.release();
    }


    @Override
    protected void onStop() {
        super.onStop();
        redsound.stop();
        orangesound.stop();
    }

}

