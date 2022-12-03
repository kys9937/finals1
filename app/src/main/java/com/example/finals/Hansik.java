package com.example.finals;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Hansik extends AppCompatActivity {





    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hansik);


        Intent intent = getIntent();//받기 전용 변수 만들기
        int Index_MainMenu = intent.getIntExtra("Index",0);//MainMenu에서 index받는 역할

        Integer[][] btnName = {{R.id.h1_btn, R.id.h2_btn, R.id.h3_btn, R.id.h4_btn,
                R.id.h5_btn,R.id.h6_btn,R.id.h7_btn,R.id.h8_btn},//한식 음식 버튼
                {R.id.c1_btn, R.id.c2_btn, R.id.c3_btn, R.id.c4_btn,
                R.id.c5_btn, R.id.c6_btn, R.id.c7_btn, R.id.c8_btn},
                {R.id.j1_btn, R.id.j2_btn, R.id.j3_btn, R.id.j4_btn, R.id.j5_btn},
                {R.id.y1_btn, R.id.y2_btn, R.id.y3_btn, R.id.y4_btn, R.id.y5_btn},
                {R.id.b1_btn, R.id.b2_btn, R.id.b3_btn, R.id.b4_btn, R.id.b5_btn},
                {R.id.d1_btn, R.id.d2_btn, R.id.d3_btn, R.id.d4_btn, R.id.d5_btn}
        };
        Button[] btn = new Button[btnName[Index_MainMenu].length];//선택지 추가하면 자동으로 늘어남

        Integer[] layoutName = {R.id.h1_layout, R.id.c1_layout, R.id.j1_layout,
                R.id.y1_layout, R.id.b1_layout, R.id.d1_layout};//MainMenu의 레이아웃 아이디
        LinearLayout[] ll = new LinearLayout[layoutName.length];




        for (int i = 0; i < layoutName.length; i++) {
            ll[i] = (LinearLayout) findViewById(layoutName[i]);
            ll[i].setVisibility(View.GONE);
        }

        ll[Index_MainMenu].setVisibility(View.VISIBLE);//선택한 레이아웃만 출력

        for (int i = 0; i < btn.length; i++) {
            btn[i] = (Button) findViewById(btnName[Index_MainMenu][i]);
        }

        for (int i = 0; i < btn.length; i++) {
            final int Index_Hansik;
            Index_Hansik = i;

            btn[Index_Hansik].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Hansik_1.class);
                    intent.putExtra("Index_MainMenu", Index_MainMenu);//Hansik_1로 ind_MainMenu보내는 역할
                    intent.putExtra("Index_Hansik", Index_Hansik);//Hansik_1로 index보내는 역할
                    startActivity(intent);
                    //intent : 앱 구성요소(컴포넌트) 간에 작업 수행을 위한 정보를 전달하는 역할
                }
            });
        }
    }
}