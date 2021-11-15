package com.heng.frag_record;

import com.heng.R;
import com.heng.db.DBManager;
import com.heng.db.TypeBean;

import java.util.List;

/**
 * 收入记录页面
 */
public class IncomeFragment extends BaseRecordFragment {


    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> inList = DBManager.getTypeList(1);
        typeList.addAll(inList);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.in_qt_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(1);
        DBManager.insertItemToAccounttb(accountBean);
    }
}
