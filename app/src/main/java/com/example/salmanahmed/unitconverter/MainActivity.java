package com.example.salmanahmed.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent = new Intent(getApplicationContext(),Temperature.class);
            startActivity(intent);
        }
        });
        imageButton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent1 = new Intent(getApplicationContext(),Area.class);
                startActivity(intent1);
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Intent intent2 = new Intent(getApplicationContext(),Length.class);
                startActivity(intent2);
            }
        });
    }
}
