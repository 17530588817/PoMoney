package com.heng.activity;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author : HengZhang
 * @date : 2021/11/7 17:11
 * 闹钟提醒
 */
public class ClockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AlertDialog alert = new AlertDialog.Builder(this).create();
        alert.setTitle("温馨提示");       //设置对话框的标题
        alert.setMessage("记账时间到啦，快去添加新的账目吧！");   //设置对话框内容
        //添加确定按钮
        alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alert.show();       //显示对话框
    }

}