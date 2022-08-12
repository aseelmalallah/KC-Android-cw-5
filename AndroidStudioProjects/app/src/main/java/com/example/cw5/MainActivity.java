package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView AN = findViewById(R.id.appname);
        ImageView P = findViewById(R.id.pic);
        TextView TV = findViewById(R.id.textView);
        EditText N = findViewById(R.id.name);
        EditText A = findViewById(R.id.age);
        Button NB = findViewById(R.id.next);


        NB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NAME = N.getText().toString();
                int AGE = Integer.parseInt(A.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("n",NAME);
                intent.putExtra("a",AGE);

                if (TextUtils.isEmpty(NAME)){

                  N.setError("Error");
                  return;

                }
                if (TextUtils.isEmpty(AGE)){

                    A.setError("Error");
                    return;
                }



                startActivity(intent);




            }
        });








    }
}