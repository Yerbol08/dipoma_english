package kz.tengrilab.diploma_english.lesson2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kz.tengrilab.diploma_english.Lesson1.TestingActivity;
import kz.tengrilab.diploma_english.Lesson1.Text1Activity;
import kz.tengrilab.diploma_english.R;
import kz.tengrilab.diploma_english.Words1Activity;

public class Lesson2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);
        Button btnText = (Button) findViewById(R.id.text);
        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Text2Activity.class));
            }
        });

        Button btnVocabulary = (Button) findViewById(R.id.words);
        btnVocabulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Words2Activity.class));
            }
        });

        Button btnTest = (Button) findViewById(R.id.test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Testting2Activity.class));
            }
        });


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