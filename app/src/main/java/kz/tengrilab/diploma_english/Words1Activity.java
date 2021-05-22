package kz.tengrilab.diploma_english;

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

public class Words1Activity extends AppCompatActivity {
    String[] words = {"Come - Келіңіз", "Speak - Сөйлеу", "Early - Ерте", "Always - Әрқашан","Generally - Жалпы"};
    String[] sounds = {"come.mp3", "speak.mp3", "early.mp3", "always.mp3", "generally.mp3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words1);

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
        actionBar.setTitle("The simple present tense");
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