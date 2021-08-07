package com.example.test11111111111111111;

import static java.sql.DriverManager.println;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class dice1<random_num> extends AppCompatActivity {

    ImageView img_dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice1);

        img_dice = findViewById(R.id.img_dice);

        Button btn_restart;
        btn_restart = findViewById(R.id.btn_restart);
        btn_restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num = (int) (Math.random()*5) + 1;
                if (num == 1) {
                    img_dice.setImageResource(R.drawable.dice1);
                }
                else if (num == 2) {
                    img_dice.setImageResource(R.drawable.dice2);
                }
                else if (num == 3) {
                    img_dice.setImageResource(R.drawable.dice3);
                }
                else if (num == 4) {
                    img_dice.setImageResource(R.drawable.dice4);
                }
                else if (num == 5) {
                    img_dice.setImageResource(R.drawable.dice5);
                }
                else if (num == 6) {
                    img_dice.setImageResource(R.drawable.dice6);
                }


//                Intent intent = new Intent(dice1.this , MainActivity.class );
//                startActivity(intent);



            }
        });

    }
}