package com.kmj.self6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart,btnEnd;
        final ViewFlipper vFlipper;

        btnStart =(Button)findViewById(R.id.btnStart);
        btnEnd = (Button)findViewById(R.id.btnEnd);
        vFlipper =(ViewFlipper)findViewById(R.id.viewFlipper1);

        vFlipper.setFlipInterval(1000); //1000 = 1초 실행간격 1초로 설정

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.startFlipping(); //Flipper 시작
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.stopFlipping(); //Flipper 정지
            }
        });

    }
}