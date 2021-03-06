package com.example.hakim.mivokeapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create an array of words
       final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("red","lutti", R.drawable.color_red,R.raw.color_red));
        words.add(new Word("mustard yellow","otikko", R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Word("dusty yellow","tolookosu", R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Word("green","oyyisa", R.drawable.color_green,R.raw.color_green));
        words.add(new Word("brown","massokka", R.drawable.color_brown,R.raw.color_brown));
        words.add(new Word("gray","temmokka", R.drawable.color_gray,R.raw.color_gray));
        words.add(new Word("black","kenekaku", R.drawable.color_black,R.raw.color_black));
        words.add(new Word("white","kawinta", R.drawable.color_white,R.raw.color_white));
        WordAdapter  adapter=new WordAdapter(this, words,R.color.category_colors);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
                mediaPlayer.start();

            }
        });






    }
}
