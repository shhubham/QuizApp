package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
public MainActivity obj=new MainActivity();

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    final Button btn =(findViewById(R.id.button2));

    btn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {

            ((TextView)findViewById(R.id.sc)).setText(obj.scc());

}});
}}