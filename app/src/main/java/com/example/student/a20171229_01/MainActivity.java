package com.example.student.a20171229_01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("LOG","開始啦!This is onCreate");
    }

    public void click1(View v)
    {
        Intent it=new Intent();
        it.setAction(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,"我要分享這段文字!");
        startActivity(it);
    }
    public void click2(View v)
    {
        Intent it2=new Intent();
        it2.setAction(Intent.ACTION_SEND);
        it2.setType("image/jpeg");
        Uri uri1 = Uri.parse("android.resource://" +
                getApplicationContext().getPackageName() + "/" + R.drawable.p1);
        it2.putExtra(Intent.EXTRA_STREAM,uri1);
        startActivity(it2);
    }

    protected void onResume()
    {
        super.onResume();
        Log.d("LOG","先回復啦!");
    }
    protected void onStop() {
        super.onStop();
        Log.d("LOG", "先暫停啦!");
    }
}
