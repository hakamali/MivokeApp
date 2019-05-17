package com.example.hakim.mivokeapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create an array of words
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("where are you going","minto wiksus",R.raw.phrase_where_are_you_going));
        words.add(new Word("what is your name","tinna oyaase na",R.raw.phrase_what_is_your_name));
        words.add(new Word("my name is","oyaaset", R.raw.phrase_my_name_is));
        words.add(new Word("how are you feeling","mickakises?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("i am feeling good ","kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word("are you coming","aanas aa?", R.raw.phrase_are_you_coming));
        words.add(new Word("yes i am coming","haa ' aanam", R.raw.phrase_yes_im_coming));
        words.add(new Word("i am comimg","aanam", R.raw.phrase_im_coming));
        words.add(new Word("lets go","yoowutist", R.raw.phrase_lets_go));
        words.add(new Word("come here","anni nem", R.raw.phrase_come_here));
        WordAdapter  adapter=new WordAdapter(this, words,R.color.category_phrases);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(PhrasesActivity.this, word.getmAudioResourceId());
                mediaPlayer.start();

            }
        });






    }
}

