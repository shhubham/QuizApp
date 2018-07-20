package com.example.android.quizapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String quizQ[]={"your name","adress"};
    public String options[][]={
            {"a","b","c","d"},
            {"e","f","g","h"}
    };
    public String c_options[]={"a","h"};
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private TextView Q;

    int score=0;int n=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updatequestion();
        final Button b1 =(Button)(findViewById(R.id.button1));
        final Button b2 =(findViewById(R.id.button2));
        final Button b3 =(findViewById(R.id.button3));
        final Button b4 =(findViewById(R.id.button4));
        final TextView Q =(findViewById(R.id.quest));

        if (n<=2)
        {
            b1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (b1.getText().toString().equals(c_options[n])) {
                        score = score + 1;
                    }


                    updatequestion();
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (b2.getText().toString().equals(c_options[n])) {
                        score = score + 1;
                    }

                    updatequestion();

                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (b3.getText().toString().equals(c_options[n])) {
                        score = score + 1;
                    }

                    updatequestion();

                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (b4.getText().toString().equals(c_options[n])) {
                        score = score + 1;
                    }

                    updatequestion();

                }
            });

        }

     else{
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

    }
    public void updatequestion()
    {
        Q.setText(quizQ[n]);
        b1.setText(options[n][1]);
        b2.setText(options[n][2]);
        b3.setText(options[n][3]);
        b4.setText(options[n][4]);
        n=n+1;
    }
    public int scc()
        {
            return score;
        }

}

