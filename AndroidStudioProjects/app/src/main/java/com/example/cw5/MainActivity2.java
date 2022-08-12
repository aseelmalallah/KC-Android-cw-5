package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView AN2 = findViewById(R.id.appname2);
        ImageView P2 = findViewById(R.id.pic2);
        TextView TV2 = findViewById(R.id.textview2);
        TextView N2 = findViewById(R.id.name2);
        TextView EN = findViewById(R.id.editname);
        TextView EE = findViewById(R.id.editage);
        TextView E2 = findViewById(R.id.age2);


        Bundle b = getIntent().getExtras();

        String NAME = b.getString("n");
        EN.setText(NAME);

        int AGE = b.getInt("a");
        EE.setText(String.valueOf(AGE));






    }
}