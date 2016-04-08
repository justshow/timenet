package com.timenet.timenet;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;

public class SplashActivity extends Activity {
    private Switch tb_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initView();
    }

    private void initView() {
        tb_button = (Switch)findViewById(R.id.tb_button);

    }
}
