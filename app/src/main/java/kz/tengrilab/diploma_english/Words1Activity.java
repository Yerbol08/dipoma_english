package kz.tengrilab.diploma_english;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Words1Activity extends AppCompatActivity {
    String[] words = {"Come - Келіңіз", "Speak - Сөйлеу", "Early - Ерте", "Always - Әрқашан","Generally - Жалпы"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words1);

        TextView selection = (TextView) findViewById(R.id.title);

        ListView countriesList = (ListView) findViewById(R.id.wordsList);

        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                R.layout.layout_words, words);

        countriesList.setAdapter(adapter);

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
}