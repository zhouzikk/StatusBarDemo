package com.hk.statusbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //状态栏透明和间距处理
        StatusBarUtil.immersive(this);
        StatusBarUtil.setPaddingSmart(this, findViewById(R.id.text));
//        StatusBarUtil.setPaddingSmart(this, findViewById(R.id.profile));
//        StatusBarUtil.setPaddingSmart(this, findViewById(R.id.blurView));
    }
}
