package com.shohayeb.areyoudepressed;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private   Integer id;
    private ScrollView mScrollView;
    // these two variables will be used by SharedPreferences
    private static final String FILE_NAME = "file_lang"; // preference file name
    private static final String KEY_LANG = "key_lang"; // preference key

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mScrollView=findViewById(R.id.scroll);
        super.onCreate(savedInstanceState);
        loadLanguage();
        setContentView(R.layout.activity_main);
        id=R.layout.activity_main;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("id",id);
//        if (id==R.layout.queations2) {
//            outState.putIntArray("ARTICLE_SCROLL_POSITION",
//                    new int[]{mScrollView.getScrollX(), mScrollView.getScrollY()});
//        }
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        id=savedInstanceState.getInt("id");
        setContentView(id);
        super.onRestoreInstanceState(savedInstanceState);
//        if (id==R.layout.queations2) {
//            final int[] position = savedInstanceState.getIntArray("ARTICLE_SCROLL_POSITION");
//            if (position != null)
//                mScrollView.post(new Runnable() {
//                    public void run() {
//                        mScrollView.scrollTo(position[0], position[1]);
//                    }
//                });
//        }
    }



    public void start(View view) {
        setContentView(R.layout.questions);
        id=R.layout.questions;
    }

    public void submit(View view) {
        int answered = calculateAnsweredQuestions2();
        int score = calculateScore2();
        if (answered != 12) {
            Toast.makeText(this, R.string.answer, Toast.LENGTH_SHORT).show();
        } else {
            if (score >= 7) {
                Toast.makeText(this, getResources().getString(R.string.severe), Toast.LENGTH_SHORT).show();
            } else if (score < 7 && score> 3) {
                Toast.makeText(this, getResources().getString(R.string.moderate), Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, getResources().getString(R.string.mild), Toast.LENGTH_SHORT).show();
            }
        }
    }


    public void submit1(View view) {

        int score = calculateScore();
        int answered =calculateAnsweredQuestions();
        if (answered!=3) {
            Toast.makeText(this, getResources().getString(R.string.answer), Toast.LENGTH_SHORT).show();
        }else {
            if (score>1) {
                setContentView(R.layout.queations2);
                id=R.layout.queations2;
            }
            if (score<2)
                Toast.makeText(this, getResources().getString(R.string.not), Toast.LENGTH_SHORT).show();
        }
    }

    public int calculateAnsweredQuestions(){
        RadioGroup radioGroup1 =findViewById(R.id.radio1);
        RadioGroup radioGroup2 =findViewById(R.id.radio2);
        RadioGroup radioGroup3 =findViewById(R.id.radio3);
        int answered =0;
        if (radioGroup1.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup2.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup3.getCheckedRadioButtonId()!= -1)
            answered++;
        return answered;
    }

    public int calculateScore() {
        int score = 0;
        RadioButton radioButton1 =findViewById(R.id.q1_y);
        RadioButton radioButton2 =findViewById(R.id.q2_y);
        RadioButton radioButton3 =findViewById(R.id.q3_y);
        if (radioButton1.isChecked())
            score++;
        if (radioButton2.isChecked())
            score++;
        if (radioButton3.isChecked())
            score++;
        return score;
    }

    public int calculateAnsweredQuestions2(){
        RadioGroup radioGroup1 =findViewById(R.id.radio4);
        RadioGroup radioGroup2 =findViewById(R.id.radio5);
        RadioGroup radioGroup3 =findViewById(R.id.radio6);
        RadioGroup radioGroup4 =findViewById(R.id.radio7);
        RadioGroup radioGroup5 =findViewById(R.id.radio8);
        RadioGroup radioGroup6 =findViewById(R.id.radio9);
        RadioGroup radioGroup7 =findViewById(R.id.radio10);
        RadioGroup radioGroup8 =findViewById(R.id.radio11);
        RadioGroup radioGroup9 =findViewById(R.id.radio12);
        RadioGroup radioGroup10 =findViewById(R.id.radio13);
        RadioGroup radioGroup11 =findViewById(R.id.radio14);
        RadioGroup radioGroup12 =findViewById(R.id.radio15);
        int answered =0;
        if (radioGroup1.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup2.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup3.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup4.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup5.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup6.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup7.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup8.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup9.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup10.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup11.getCheckedRadioButtonId()!= -1)
            answered++;
        if (radioGroup12.getCheckedRadioButtonId()!= -1)
            answered++;
        return answered;
    }

    public int calculateScore2() {
        int score = 0;
        RadioButton radioButton1 =findViewById(R.id.q4_y);
        RadioButton radioButton2 =findViewById(R.id.q5_y);
        RadioButton radioButton3 =findViewById(R.id.q6_y);
        RadioButton radioButton4 =findViewById(R.id.q7_y);
        RadioButton radioButton5 =findViewById(R.id.q8_y);
        RadioButton radioButton6 =findViewById(R.id.q9_y);
        RadioButton radioButton7 =findViewById(R.id.q10_y);
        RadioButton radioButton8 =findViewById(R.id.q11_y);
        RadioButton radioButton9 =findViewById(R.id.q12_y);
        RadioButton radioButton10 =findViewById(R.id.q13_y);
        RadioButton radioButton11 =findViewById(R.id.q14_y);
        RadioButton radioButton12 =findViewById(R.id.q15_y);

        if (radioButton1.isChecked())
            score++;
        if (radioButton2.isChecked())
            score++;
        if (radioButton3.isChecked())
            score++;
        if (radioButton4.isChecked())
            score++;
        if (radioButton5.isChecked())
            score++;
        if (radioButton6.isChecked())
            score++;
        if (radioButton7.isChecked())
            score++;
        if (radioButton8.isChecked())
            score++;
        if (radioButton9.isChecked())
            score++;
        if (radioButton10.isChecked())
            score++;
        if (radioButton11.isChecked())
            score+=7;
        if (radioButton12.isChecked())
            score+=7;
        return score;
    }

    private void saveLanguage(String lang) {
        // we can use this method to save language
        SharedPreferences preferences = getSharedPreferences(FILE_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(KEY_LANG, lang);
        editor.apply();
//        setTitle(getResources().getString(R.string.app_name));
        // we have saved
        // recreate activity after saving to load the new language, this is the same
        // as refreshing activity to load new language

        recreate();

    }

    private void loadLanguage() {
        // we can use this method to load language,
        // this method should be called before setContentView() method of the onCreate method

        Locale locale = new Locale(getLangCode());
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
        setTitle(getResources().getString(R.string.app_name));
    }

    private String getLangCode() {
        SharedPreferences preferences = getSharedPreferences(FILE_NAME, MODE_PRIVATE);
        String langCode = preferences.getString(KEY_LANG, "en");
        // save english 'en' as the default language
        return langCode;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_english:
                saveLanguage("en");
                break;

            case R.id.action_arabic:
                saveLanguage("ar");
                break;
        }
        return true;
    }

}