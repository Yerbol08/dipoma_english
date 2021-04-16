package kz.tengrilab.diploma_english.lesson3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import kz.tengrilab.diploma_english.R;

public class Word3Activity extends AppCompatActivity {
    String[] words = {"Shall - Болады", "Tonight - Бүгін кешке", "Suggestion - Ұсыныс", "Advice - Кеңес","Literary - Әдеби"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word3);
        TextView selection = (TextView) findViewById(R.id.title);

        ListView countriesList = (ListView) findViewById(R.id.wordsList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                R.layout.layout_words, words);

        countriesList.setAdapter(adapter);

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
}