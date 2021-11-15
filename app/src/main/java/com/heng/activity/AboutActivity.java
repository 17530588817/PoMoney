package com.heng.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.heng.R;

/**
 * @author : HengZhang
 * @date : 2021/11/7 17:11
 * 关于
 */
public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void onClick(View view) {
        finish();
    }
}
