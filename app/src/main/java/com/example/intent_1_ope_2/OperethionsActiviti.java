package com.example.intent_1_ope_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OperethionsActiviti extends AppCompatActivity {
     TextView result2;
    Button minus;
    Button plus;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operethions_activiti);
        result2= findViewById(R.id.text_result2);

        String res= getIntent().getStringExtra("key");
        result2.setText(res);

        minus = findViewById(R.id.minus);
        plus =  findViewById(R.id.plus);
        btn1 = findViewById(R.id.btn1);


    }
    public void onNextClick (View v){

        Intent i = new Intent(OperethionsActiviti.this,ResultActiviti.class);
    }
    public void  onClick (View v){
        switch (v.getId()){
            case R.id.minus:
              String  minus = "-";
                result2.append(minus);
                break;
            case R.id.btn1:
                String btn1 = "1";
                result2.append(btn1);
                break;
        }

    }
    public void onClicOperethion (){

    }


}
