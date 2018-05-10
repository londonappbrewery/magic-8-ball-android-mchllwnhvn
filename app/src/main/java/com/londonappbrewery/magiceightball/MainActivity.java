package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link the views in the layout xml file to the java code
        final ImageView achtBal = findViewById(R.id.afbeelding_achtBal);

        Button vraagKnop = findViewById(R.id.vraagKnop);


        // Store the dice images in an array (collection)
        final int[] balArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };


        // Tell the button to listen for clicks
        vraagKnop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This code gets executed when the button is pressed
                // Create a random number generator
                Random randomNumberGenerator = new Random();

                // Make the random number generator spit out a new random number
                int number = randomNumberGenerator.nextInt(4);

                // Print this random number to the logcat to see it in the Android monitor
                Log.d("Achtbal", "Het nummer is " + number);

                // grab a random dice image from the diceArray. Then tell the ImageView to display
                // this image
                achtBal.setImageResource(balArray[number]);
            }
        });
    }
}


