package kz.tengrilab.diploma_english.lesson2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import kz.tengrilab.diploma_english.R;

public class Words2Activity extends AppCompatActivity {
    String[] words = {"Make - Жасаңыз", "Tired - Шаршадым", "Cold - Суық", "Garden - Бақша","Sunny - Күн ашық"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words2);
        TextView selection = (TextView) findViewById(R.id.title);

        ListView countriesList = (ListView) findViewById(R.id.wordsList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                R.layout.layout_words, words);

        countriesList.setAdapter(adapter);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_close);
        actionBar.setTitle("The simple past tense");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}