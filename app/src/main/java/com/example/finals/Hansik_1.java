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
                {R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4,
                R.drawable.c5, R.drawable.c6, R.drawable.c7, R.drawable.c8},
                {R.drawable.j1, R.drawable.j2, R.drawable.j3, R.drawable.j4,
                R.drawable.j5},
                {R.drawable.y1, R.drawable.y2, R.drawable.y3, R.drawable.y4,
                R.drawable.y5}};
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
                "https://www.youtube.com/watch?v=sFLGovdEBr4",//고추잡채
                "https://www.youtube.com/watch?v=I0UXgqBoIEQ",//마파두부
                "https://www.youtube.com/watch?v=9ZuSRJtpWSE",//중국냉면
                "https://www.youtube.com/watch?v=c5I1y8R0dN8",//난자와스
                "https://www.youtube.com/watch?v=6V7T6B_8uEM",//어향가지볶음
                "https://www.youtube.com/watch?v=n9IvJZIsRFQ",//건부두볶음
                "https://www.youtube.com/watch?v=rJyxZamsIPQ"},//탄탄면
                //중식
                {"https://www.youtube.com/watch?v=XD8SKZOA3jQ",//야키소바빵
                "https://www.youtube.com/watch?v=zXpznElExPI",//규동
                "https://www.youtube.com/watch?v=9hjbPcz0atg",//오코노미아키
                "https://www.youtube.com/watch?v=LvuF9vGyJkE",//오야코동
                "https://www.youtube.com/watch?v=bcTRLW3eNPU"},//일본식 계란말이
                //일식
                {"https://www.youtube.com/watch?v=dLvoNRiaasM",//치즈오믈렛
                 "https://www.youtube.com/watch?v=ZrpoXBUupj4",//페퍼스테이크
                 "https://www.youtube.com/watch?v=j0-_vTbLALM",//감자스프
                 "https://www.youtube.com/watch?v=ohihzV6Z85k",//알리오 올리오 파스타
                 "https://www.youtube.com/watch?v=_881oO2R0ac"},//라따뚜이
                //양식
                {
                }
       };
        ImageView image;


        image = (ImageView) findViewById(R.id.image);

        Intent intent = getIntent();//받기 전용 변수 만들기

        //주는 쪽의 이름과 받는 쪽의 이름은 동일해야햔다.
        int Index_MainMenu = intent.getIntExtra("Index_MainMenu",0);//MeinMenu에서 index받는 역할
        int Index_hansik = intent.getIntExtra("Index_Hansik",0);//Hansik에서 index받는 역할

        image.setImageResource(picture[Index_MainMenu][Index_hansik]);//선택한 버튼의 사진으로 바꾸기



        image.setOnClickListener(view -> {//유튜브 가기
            String url = youtube[Index_MainMenu][Index_hansik];
            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent1);
        });
    }
}