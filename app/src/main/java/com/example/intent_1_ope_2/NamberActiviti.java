package com.example.intent_1_ope_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class NamberActiviti extends AppCompatActivity {

    //ArrayList<integer>
    TextView textView;
    String num1, num2, plus, egual;
    String rawFirsOperand = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namber_activiti);
        textView = findViewById(R.id.text_view);

    }

    public void onNumberClick(View v) {
        switch (v.getId()) {
            case R.id.number1:
                num1 = "1";
                textView.append(num1);
                rawFirsOperand = num1;
                break;
            case R.id.number2:
                num2 = "2";
                textView.append(num2);
                break;
            case R.id.egual:
                egual = "=";
                textView.append(egual);
                //Intent intent = new Intent(NamberActiviti.this,OperethionsActiviti.class);
                //intent.putExtra("n",num1);
                //intent.putExtra("c",num2);
                //intent.putExtra("b",plus);
                // startActivity(intent);

            case R.id.share:
                //  Intent intent = new Intent(this,OperethionsActiviti.class);
                //  startActivity(intent);
                break;
            case R.id.plus:
                plus = "+";
                textView.append(plus);
                break;

        }


    }
    public void onOperetionClick (View view){


}



    public void onNextClick (View view){
        Intent intent = new Intent(NamberActiviti.this,OperethionsActiviti.class);
        intent.putExtra("n",num1);
        startActivity(intent);
    }

    public void onShareClick(View view) {

       Intent intent = new Intent(Intent.ACTION_SEND);
       intent.setType("text/plain");
       intent.putExtra(Intent.EXTRA_TEXT, num1);
       Intent chosenIntent = Intent.createChooser(intent, "Window");
       startActivity(chosenIntent);

    }
}