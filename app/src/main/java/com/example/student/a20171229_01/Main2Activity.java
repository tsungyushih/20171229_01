package com.example.student.a20171229_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv= findViewById(R.id.textView);
        Intent it2=getIntent();
        String data1=it2.getStringExtra(Intent.EXTRA_TEXT);
        tv.setText(data1);
    }
}
