package com.heng.activity;

import android.app.Application;

import com.heng.db.DBManager;

/**
 * @author : HengZhang
 * @date : 2021/11/7 17:11
 * 表示全局应用的类
 */
public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化数据库
        DBManager.initDB(getApplicationContext());
    }
}
