package com.heng.activity;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

import com.heng.R;

/**
 * @author : HengZhang
 * @date : 2021/11/7 17:11
 * 通知
 */
public class NotificationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_outcome);

        //打开页面后关掉通知
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        manager.cancel(1);
    }
}