package com.example.learnassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity3 extends AppCompatActivity {
    private TextView tvQuestion, tvScore, tvQuestionNo;
    private RadioGroup radioGroup;
    private RadioButton rb1, rb2, rb3;
    private Button btnNext;

    int totalQuestions;
    int qCounter = 0;

    int score;

    ColorStateList dfRbColor;
    boolean answered;


    private QuestionModel currentQuestion;

    private List<QuestionModel> questionsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        questionsList = new ArrayList<>();
        tvQuestion = findViewById(R.id.textQuestion);
        tvScore = findViewById((R.id.textScore));
        tvQuestionNo = findViewById(R.id.textQuestionNo);

        radioGroup = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        btnNext = findViewById(R.id.btnNext);

        dfRbColor = rb1.getTextColors();


        addQuestions();
        totalQuestions = questionsList.size();
        showNextQuestion();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answered == false){
                    if(rb1.isChecked() || rb2.isChecked() || rb3.isChecked()){
                        checkAnswer();

                    }else{
                        Toast.makeText(QuizActivity3.this, "Please select an option", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    showNextQuestion();
                }
            }
        });

    }

    private void checkAnswer() {
        answered = true;
        RadioButton rbselected = findViewById(radioGroup.getCheckedRadioButtonId());
        int answerNo = radioGroup.indexOfChild(rbselected) + 1;
        if (answerNo == currentQuestion.getCorrectAnsNo()){
            score++;
            tvScore.setText("Дұрыс жауап: "+score);
        }
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        switch (currentQuestion.getCorrectAnsNo()){
            case 1:
                rb1.setTextColor(Color.GREEN);
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                break;
        }
        if(qCounter < totalQuestions){
            btnNext.setText("Келесі");

        }else{
            btnNext.setText("Бітіру");
        }
    }

    private void showNextQuestion() {

        radioGroup.clearCheck();
        rb1.setTextColor(dfRbColor);
        rb2.setTextColor(dfRbColor);
        rb3.setTextColor(dfRbColor);


        if(qCounter < totalQuestions){
            currentQuestion = questionsList.get(qCounter);
            tvQuestion.setText(currentQuestion.getQuestion());
            rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());

            qCounter++;

            btnNext.setText("Енгізу");
            tvQuestionNo.setText("Сұрақ: "+qCounter+"/"+totalQuestions);
            answered = false;

        }
        else{
            finish();
        }


    }


    private void addQuestions() {
        questionsList.add(new QuestionModel("Арифметикалық амалдардың қайсысы 1-ші орындалады?", "көбейту / бөлу", "қосу / азайту", "айырмашылығы жоқ", 1));
        questionsList.add(new QuestionModel("√(3^2+4^2 ) =", "7", "6", "5", 3));
        questionsList.add(new QuestionModel("Мына өрнекке (a + b) * c қай тұжырым таңдаса дұрыс жауап шығады?", "алдымен жақша іші қосылып, кейін көбейтілсе", "жақша ішіндегі сандарға көбейтіліп, кейін қосылса", "Барлық жауап дұрыс", 3));
        questionsList.add(new QuestionModel("Санды бөлшекке көбейтсе не болады?", "сан бөлшектін алымына көбейтіледі", "сан бөлшектің бөліміне көбейтіледі", "сан бөлшектің алдына жазылады", 1));

    }
}