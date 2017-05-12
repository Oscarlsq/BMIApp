package com.example.n.bmiapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void calcbmi(View view){
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String msg = null;

        EditText et1 = (EditText)findViewById(R.id.editText);
        EditText et2 = (EditText)findViewById(R.id.editText2);
        Button b1 = (Button)findViewById(R.id.button2);
        TextView  t1 = (TextView)findViewById(R.id.textView2);
        TextView  t2 = (TextView)findViewById(R.id.textView3);

        weight = Double.parseDouble(et1.getText().toString());
        height = Double.parseDouble(et2.getText().toString());

        bmi = height*height;
        bmi = weight/bmi;
        t1.setText(String.valueOf(bmi));
        if(bmi<18.5) {
            msg = "Underweight";
        }
        else if(bmi>18.5 && bmi<25){
            msg = "Normal";
        }
        else{
            msg = "Overweight";
        }
        t2.setText(msg);
    }

}
