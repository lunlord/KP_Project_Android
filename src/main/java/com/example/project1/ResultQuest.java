package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;

public class ResultQuest extends AppCompatActivity implements Serializable {
    private String questOne;
    private String questTwo;
    private String questThree;

    public String getQuestOne() {
        return questOne;
    }

    public void setQuestOne(String questOne) {
        this.questOne = questOne;
    }

    public String getQuestTwo() {
        return questTwo;
    }

    public void setQuestTwo(String questTwo) {
        this.questTwo = questTwo;
    }

    public String getQuestThree() {
        return questThree;
    }

    public void setQuestThree(String questThree) {
        this.questThree = questThree;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quest);

//        ResultQuest model = (ResultQuest) getIntent().getSerializableExtra("ResultAnswer");
//
//        String ans1 = model.getQuestOne();
//        String ans2 = model.getQuestTwo();
//        String ans3 = model.getQuestThree();
//        TextView textView1 = findViewById(R.id.AnswerforQuest1);
//        textView1.setText(ans1);
//        TextView textView2 = findViewById(R.id.AnswerforQuest2);
//        textView2.setText(ans2);
//        TextView textView3 = findViewById(R.id.AnswerforQuest3);
//        textView3.setText(ans3);


    }
}