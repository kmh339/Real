package org.androidtown.real;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button recommend_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RecommendActivity intent
        recommend_btn = findViewById(R.id.recommend_btn);
        recommend_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //인텐트 선언 -> 현재 액티비티, 넘어갈 액티비티
                Intent intent = new Intent(MainActivity.this, RecommendActivity.class);
                //인텐트 실행
                startActivity(intent);
            }
        });
    }
}
