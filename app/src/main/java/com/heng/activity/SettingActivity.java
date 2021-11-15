package com.heng.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.heng.R;
import com.heng.db.DBManager;

/**
 * @author : HengZhang
 * @date : 2021/11/7 17:11
 * 设置
 */
public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.setting_iv_back:
                finish();
                break;
            case R.id.setting_tv_clear:
                showDeleteDialog();
                break;
        }
    }

    private void showDeleteDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("删除提示")
                .setMessage("您确定要删除所有记录么？\n注意：删除后无法恢复，请慎重选择！")
                .setPositiveButton("取消", null)
                .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        DBManager.deleteAllAccount();
                        Toast.makeText(SettingActivity.this, "删除成功！", Toast.LENGTH_SHORT).show();
                    }
                }).create().show();
    }
}
