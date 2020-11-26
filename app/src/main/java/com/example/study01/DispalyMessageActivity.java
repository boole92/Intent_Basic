package com.example.study01;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DispalyMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispaly_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        //여기서 부터 xml이 아닌 자바에서 텍스트뷰를 추가하는 방법인데
        //굳이?
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setTextSize(40);

        ViewGroup layout = findViewById(R.id.activity_display_message);
        layout.addView(textView);

    }
}