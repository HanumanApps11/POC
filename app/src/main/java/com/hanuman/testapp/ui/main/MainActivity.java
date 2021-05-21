package com.hanuman.testapp.ui.main;

import android.os.Bundle;

import com.hanuman.testapp.R;
import com.hanuman.testapp.ui.list.ListFragment;
import com.hanuman.testapp.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null)
            getSupportFragmentManager().beginTransaction().add(R.id.screenContainer, new ListFragment()).commit();
    }
}
