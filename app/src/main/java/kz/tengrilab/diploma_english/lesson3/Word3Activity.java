package kz.tengrilab.diploma_english.lesson3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;

import kz.tengrilab.diploma_english.R;

public class Word3Activity extends AppCompatActivity {
    String[] words = {"Shall - Болады", "Tonight - Бүгін кешке", "Suggestion - Ұсыныс", "Advice - Кеңес","Literary - Әдеби"};
    String[] sounds = {"shall.mp3", "tonight.mp3", "suggestion.mp3", "advice.mp3", "literary.mp3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word3);
        TextView selection = (TextView) findViewById(R.id.title);

        ListView countriesList = (ListView) findViewById(R.id.wordsList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                R.layout.layout_words, words);

        countriesList.setAdapter(adapter);

        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Play(sounds[position]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_close);
        actionBar.setTitle("The simple future tense");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void Play(String fileName) throws IOException {
        AssetFileDescriptor descriptor = getApplicationContext().getAssets().openFd(fileName);
        long start = descriptor.getStartOffset();
        long end = descriptor.getLength();
        MediaPlayer mediaPlayer=new MediaPlayer();
        mediaPlayer.setDataSource(descriptor.getFileDescriptor(), start, end);
        mediaPlayer.prepare();
        mediaPlayer.start();
    }
}