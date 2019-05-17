package com.example.hakim.mivokeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the view to show the numbers category
        TextView numbers=(TextView)findViewById(R.id.numbers);
        // Set a onclick Listener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new Intent to open the { @Link NumbersActivity }
                Intent numbersintent=new Intent(MainActivity.this,NumbersActivity.class);
                // start the new activity
                startActivity(numbersintent);

            }
        });
        // find the view to show the numbers category
        TextView familymembers=(TextView)findViewById(R.id.family);
        // Set a onclick Listener on that view
        familymembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new Intent to open the { @Link FamilyMembersActivity }
                Intent familyintent=new Intent(MainActivity.this,FamilyMembersActivity.class);
                // start the new activity
                startActivity(familyintent);

            }
        });
        // find the view to show the Colorscategory
        TextView colors=(TextView)findViewById(R.id.colors);
        // Set a onclick Listener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new Intent to open the { @Link ColorsActivity }
                Intent colorsintent=new Intent(MainActivity.this,ColorsActivity.class);
                // start the new activity
                startActivity(colorsintent);

            }
        });
        // find the view to show the Phraeseategory
        TextView phrases=(TextView)findViewById(R.id.phrases);
        // Set a onclick Listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create a new Intent to open the { @Link PhrasesActivity }
                Intent phrasesintent=new Intent(MainActivity.this,PhrasesActivity.class);
                // start the new activity
                startActivity(phrasesintent);

            }
        });
    }

}
