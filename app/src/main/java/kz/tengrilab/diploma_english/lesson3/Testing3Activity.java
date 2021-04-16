package kz.tengrilab.diploma_english.lesson3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kz.tengrilab.diploma_english.R;
import kz.tengrilab.diploma_english.ResustsActivity;

public class Testing3Activity extends AppCompatActivity implements View.OnClickListener {
    int i = 0 ;
    int score =0;
    TextView question , answer1,answer2 , answer3,scoreView,showTime,questionsOrder;
    TextView   txtAnswer1A,txtAnswer2B,txtAnswer3C;

    String[] questions = new String[]{"He _____ arrive on time.", "Will your folks _____ before Tuesday?", "We _____ get there until after dark.", "We will _____ what your father says.", "I don't ________ go swimming today."};
    int [] answers = {1,2,3,1,2};
    String[]  answers_a = {"will", "leaving", "will", "see", "think I"};
    String[]  answers_b = {"is", "leave", "won't", "to see", "think I'll"};
    String[]  answers_c = {"not", "leaves", "will'nt", "seeing", "thinking"};
    LinearLayout linear ;
    LinearLayout  layoutAnswer1,layoutAnswer2,layoutAnswer3;

    List<Integer> usersAnswers = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing3);
        question  =  findViewById(R.id.question);
        answer1   =  findViewById(R.id.answer1);
        answer2   =  findViewById(R.id.answer2);
        answer3   =  findViewById(R.id.answer3);
        txtAnswer1A = findViewById(R.id.txtAnswer1A);
        txtAnswer2B = findViewById(R.id.txtAnswer2B);
        txtAnswer3C = findViewById(R.id.txtAnswer3C);
        showTime  =  findViewById(R.id.time);
        scoreView =  findViewById(R.id.score);
        linear    =  findViewById(R.id.test) ;
        layoutAnswer1 = findViewById(R.id.layoutAnswer1);
        layoutAnswer2 = findViewById(R.id.layoutAnswer2);
        layoutAnswer3 = findViewById(R.id.layoutAnswer3);
        layoutAnswer1.setOnClickListener(this);
        layoutAnswer2.setOnClickListener(this);
        layoutAnswer3.setOnClickListener(this);
        MakeQuestion(i);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_close);
        actionBar.setTitle("The simple future tense");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.layoutAnswer1:
                if (i< questions.length)
                    if (answers[i]==1)
                    {
                        score++;
                        scoreView.setText("Score : "+score);

                        layoutAnswer1.setBackgroundColor(Color.parseColor("#27995C"));

                        ////////ADD USERS ANSWERS
                        usersAnswers.add(1) ;

                        //checkCategoryMark () ;



                    }
                    else
                    {
                        usersAnswers.add(1) ;
                        layoutAnswer1.setBackgroundColor(Color.parseColor("#ff6861"));

                    }
                if (i<questions.length)

                    if (i<questions.length)
                        i++;
                MakeQuestion(i);
                break;

            case R.id.layoutAnswer2:
                if (i< questions.length)
                    if (answers[i]==2)
                    {
                        score++;
                        scoreView.setText("Score : "+score);

                        layoutAnswer2.setBackgroundColor(Color.parseColor("#27995C"));

                        ////////ADD USERS ANSWERS
                        usersAnswers.add(2) ;

                        //checkCategoryMark () ;



                    }
                    else
                    {
                        usersAnswers.add(2) ;
                        layoutAnswer2.setBackgroundColor(Color.parseColor("#ff6861"));

                    }
                if (i<questions.length)

                    if (i<questions.length)
                        i++;
                MakeQuestion(i);
                break;

            case R.id.layoutAnswer3:
                if (i< questions.length)
                    if (answers[i]==3)
                    {
                        score++;
                        scoreView.setText("Score : "+score);

                        layoutAnswer3.setBackgroundColor(Color.parseColor("#27995C"));

                        ////////ADD USERS ANSWERS
                        usersAnswers.add(3) ;

                        //checkCategoryMark () ;



                    }
                    else
                    {
                        usersAnswers.add(3) ;
                        layoutAnswer3.setBackgroundColor(Color.parseColor("#ff6861"));

                    }
                if (i<questions.length)

                    if (i<questions.length)
                        i++;
                MakeQuestion(i);
                break;

        }

        if (i==questions.length) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(getApplicationContext(), ResustsActivity.class);
                    intent.putExtra("score", score);
                    startActivity(intent);
                    finish();
                    return;
                }
            }, 500);
        }
    }

    public void MakeQuestion(int y){
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run()
            {
                if( i<questions.length)
                {
                    question.setText(
                            questions[y]);
                    answer1.setText(answers_a[i]);
                    answer2.setText(answers_b[i]);
                    answer3.setText(answers_c[i]);
                    txtAnswer1A.setText("A )");
                    txtAnswer2B.setText("B )");
                    txtAnswer3C.setText("C )");

                    layoutAnswer1.setBackgroundColor(Color.parseColor("#484344"));
                    layoutAnswer2.setBackgroundColor(Color.parseColor("#484344"));
                    layoutAnswer3.setBackgroundColor(Color.parseColor("#484344"));




                }
                else
                {
                    answer1.setClickable(false);
                    answer2.setClickable(false);
                    answer3.setClickable(false);



                }
            }
        }, 1000);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}