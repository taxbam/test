package com.example.test11111111111111111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    ImageView img_dice;
    TextView txt_dice;
    Button btn_roll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        img_dice = findViewById(R.id.img_dice);
        txt_dice = findViewById(R.id.txt_dice);
        btn_roll = findViewById(R.id.btn_roll);

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//                int num = (int) (Math.random()*5) + 1;
//                if (num == 1) {
//                    img_dice.setImageResource(R.drawable.dice1);
//                }
//                else {
//                    img_dice.setImageResource(R.drawable.dice2);
//                }
                Intent intent = new Intent(MainActivity.this , dice1.class );
                startActivity(intent);
            }
        });










    }
}