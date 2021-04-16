package kz.tengrilab.diploma_english.lesson3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kz.tengrilab.diploma_english.R;
import kz.tengrilab.diploma_english.Words1Activity;
import kz.tengrilab.diploma_english.lesson2.Testting2Activity;
import kz.tengrilab.diploma_english.lesson2.Text2Activity;

public class Lesson3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);
        Button btnText = (Button) findViewById(R.id.text);
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Text3Activity.class));
            }
        });

        Button btnVocabulary = (Button) findViewById(R.id.words);
        btnVocabulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Word3Activity.class));
            }
        });

        Button btnTest = (Button) findViewById(R.id.test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Testing3Activity.class));
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
}