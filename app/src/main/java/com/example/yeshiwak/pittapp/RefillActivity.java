package com.example.yeshiwak.pittapp;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

/**
 * Created by yeshiwak on 2/29/16.
 */
public class RefillActivity extends MainActivity {
    private Button mBreadsticksButton;
    private Button mWaterButton;
    private Button mOtherButton;


    private Button mRefillButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.activity_refill);

        mBreadsticksButton = (Button) findViewById(R.id.mBreadsticksButton);
        mWaterButton = (Button) findViewById(R.id.mWaterButton);
        mOtherButton = (Button) findViewById(R.id.mOtherButton);


        mRefillButton.setOnClickListener(new MyRefillListener());


    }
}
