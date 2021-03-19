package com.example.pruebasaleman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SubstantiveExercise extends AppCompatActivity {

    private SubstantiveData substantiveData;
    private MyDataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_sustantivo);
        db = new MyDataBase(this);

        if (substantiveData == null) {
            substantiveData = new SubstantiveData();
            randomSubstantive();
        }
    }



    private void randomSubstantive() {

        substantiveData = db.getRandomWord();

        setContentView(R.layout.activity_ejercicio_sustantivo);
        TextView txtWord = findViewById(R.id.textView_word_content);
        TextView txtPlural = findViewById(R.id.textView_plural_word_content);
        TextView txtTranslation = findViewById(R.id.textView_transalation_content);

        txtWord.setText(substantiveData.getWord());
        txtPlural.setText(substantiveData.getPluralWord());
        txtTranslation.setText(substantiveData.getTranslation());

    }

    public void btnDasOnclick(View view) {
       if (substantiveData.getWordGender().equals("das")) {
           positiveAnswer();
       } else {
           negativeAnswer();
       }

       randomSubstantive();
    }

    public void btnDerOnClick(View view) {
        if (substantiveData.getWordGender().equals("der")) {
            positiveAnswer();
        } else {
            negativeAnswer();
        }

        randomSubstantive();
    }

    public void btnDieOnClick(View view) {

        if (substantiveData.getWordGender().equals("die")) {
            positiveAnswer();
        } else {
            negativeAnswer();
        }

        randomSubstantive();
    }

    private void positiveAnswer(){
        showMessage("Richtig");
    }

    private void negativeAnswer(){
        showMessage("Falsch - " + substantiveData.getWordGender());
    }

    private void showMessage(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }




}