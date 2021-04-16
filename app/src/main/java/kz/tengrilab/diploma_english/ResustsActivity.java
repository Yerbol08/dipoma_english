package kz.tengrilab.diploma_english;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResustsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resusts);
        int score = getIntent().getIntExtra("score", 0);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(score) + "/5");
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        if (score <= 3){
            textView1.setText("Дайындалу керек...");
        }
        else if (score ==4 ){
            textView1.setText("Жаман емес!)");
        }
        else {
            textView1.setText("Тамаша көрсеткіш!)");
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_close);
        actionBar.setTitle("Басты бет");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}