package kz.tengrilab.diploma_english.lesson2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import kz.tengrilab.diploma_english.R;

public class Text2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text2);
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