package com.example.study01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //onClick 속성으로 만든 메소드.
    public void sendbutton(View view) {
        //this에 굳이 현재 액티비티의 이름을 적어주지 않아도 된다.
        Intent intent = new Intent(this, DispalyMessageActivity.class);
        //필요하지 않다면 굳이 변수선언을 따로 할 필요가 없다.
        //차라리 필요하다면 나중에 선언하는게 나을듯
        EditText editText = findViewById(R.id.edit_message);
        //여기도 마찬가지. 필요하지 않다면 변수선언을 밖에서 할 필요가 없다.
        String message = editText.getText().toString();
        intent.putExtra("message", message);
        startActivity(intent);
    }
}