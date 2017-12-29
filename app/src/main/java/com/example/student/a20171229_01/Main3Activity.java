package com.example.student.a20171229_01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ImageView iv=findViewById(R.id.imageView);
        String x = getIntent().getExtras()
                .get(Intent.EXTRA_STREAM).toString();
        iv.setImageURI(Uri.parse(x));
    }
}
