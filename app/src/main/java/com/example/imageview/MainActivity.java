package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button rdoOne, rdoTwo, rdoThree ;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rdoOne = findViewById(R.id.rdoOne);
        rdoTwo = findViewById(R.id.rdoTwo);
        rdoThree = findViewById(R.id.rdoThree);
        imgView = findViewById(R.id.imgView);

        rdoOne.setOnClickListener(this);
        rdoTwo.setOnClickListener(this);
        rdoThree.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                switch (v.getId())
                {
                    case R.id.rdoOne:
                        imgView.setImageResource(R.drawable.images);
                        break;




            }
        }
    }

