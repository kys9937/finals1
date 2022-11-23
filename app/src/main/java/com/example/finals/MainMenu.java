package com.example.finals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainMenu extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        Button btn_1;
        Integer[] btnName_MainMenu = {R.id.btn_1, R.id.btn_2};
        Button[] btn_MainMenu = new Button[btnName_MainMenu.length];

        for (int i = 0; i < btn_MainMenu.length; i++) {
            btn_MainMenu[i] = (Button) findViewById(btnName_MainMenu[i]);
        }


        for (int i = 0; i < btn_MainMenu.length; i++) {
            final int index;
            index = i;


            //개발자 정보 버튼 클릭시 액티비티 전환
            btn_MainMenu[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getApplicationContext(), Hansik.class);
                    intent.putExtra("Index", index);
                    startActivity(intent);
                    //intent : 앱 구성요소(컴포넌트) 간에 작업 수행을 위한 정보를 전달하는 역할
                }
            });
        }
    }
}