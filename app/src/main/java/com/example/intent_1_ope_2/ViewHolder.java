package com.example.intent_1_ope_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ViewHolder extends RecyclerView.ViewHolder {
    TextView textView22;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        textView22 = itemView.findViewById(R.id.txt_viewholder);
    }

           public void onBind(String s){
    }
}
