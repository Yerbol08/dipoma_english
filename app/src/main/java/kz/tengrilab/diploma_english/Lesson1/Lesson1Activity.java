package kz.tengrilab.diploma_english.Lesson1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kz.tengrilab.diploma_english.R;
import kz.tengrilab.diploma_english.Words1Activity;

public class Lesson1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);
        Button btnText = (Button) findViewById(R.id.text);
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Text1Activity.class));
            }
        });

        Button btnVocabulary = (Button) findViewById(R.id.words);
        btnVocabulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Words1Activity.class));
            }
        });

        Button btnTest = (Button) findViewById(R.id.test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TestingActivity.class));
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
}