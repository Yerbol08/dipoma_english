package kz.tengrilab.diploma_english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.ui.auth.AuthUI;
import com.google.android.material.badge.BadgeUtils;
import com.google.firebase.auth.FirebaseAuth;

import kz.tengrilab.diploma_english.Lesson1.Lesson1Activity;
import kz.tengrilab.diploma_english.lesson2.Lesson2Activity;
import kz.tengrilab.diploma_english.lesson3.Lesson3Activity;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    private static int SIGN_IN_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        if (FirebaseAuth.getInstance().getCurrentUser() == null) {
            startActivityForResult(AuthUI.getInstance()
                    .createSignInIntentBuilder()
                    .build(), SIGN_IN_REQUEST_CODE);
        }
        Button btn1 =  (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Lesson1Activity.class));
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Lesson2Activity.class));
            }
        });
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Lesson3Activity.class));
            }
        });

    }
}