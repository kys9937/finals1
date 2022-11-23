package com.example.finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class Hansik_1 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hansik_1);

        Integer[][] picture = {{R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4,
                R.drawable.h5,R.drawable.h6,R.drawable.h7,R.drawable.h8},
                {R.drawable.c1, R.drawable.c2}};
        String[][] youtube = {{"https://www.youtube.com/watch?v=S7qcu7iFvB4",//김치
                "https://www.youtube.com/watch?v=nVzwOOJLt24",//불고기
                "https://www.youtube.com/watch?v=eeiqjyYgPew",//닭도리탕
                "https://www.youtube.com/watch?v=qWbHSOplcvY",//김치찌개
                "https://www.youtube.com/watch?v=v32NjYn5pSc",//갈비찜
                "https://www.youtube.com/watch?v=DNj3YiaP42s",//잡채
                "https://www.youtube.com/watch?v=t4Es8mwdYlE",//떡볶이
                "https://www.youtube.com/watch?v=wfm951HEpGU"},//부침개
                //한식
                {"https://www.youtube.com/watch?v=j1I3dKRR6Xw",//양장피
                "https://www.youtube.com/watch?v=sFLGovdEBr4"}//고추잡채

        };
        ImageView image;




        image = (ImageView) findViewById(R.id.image);

        Intent intent = getIntent();//받기 전용 변수 만들기

        //중식을 선택해도 한식이 나옴 여기서 받는게 문제거나 주는게 문제 같은데 잘 모르겠음
        int ind_MainMenu = intent.getIntExtra("Index_MeinMenu",0);//MeinMenu에서 index받는 역할
        int ind = intent.getIntExtra("Index_Hansik",1);//Hansik에서 index받는 역할

        image.setImageResource(picture[ind_MainMenu][ind]);//선택한 버튼의 사진으로 바꾸기



        image.setOnClickListener(view -> {//유튜브 가기
            String url = youtube[ind_MainMenu][ind];
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent1);
        });
    }
}