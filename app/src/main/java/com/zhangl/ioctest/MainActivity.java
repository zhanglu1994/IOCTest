package com.zhangl.ioctest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zhangl.ioctest.ioc.CheckNet;
import com.zhangl.ioctest.ioc.OnClick;
import com.zhangl.ioctest.ioc.ViewById;
import com.zhangl.ioctest.ioc.ViewUtils;

public class MainActivity extends AppCompatActivity {


    @ViewById(R.id.tv_main)
    TextView tv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);



        tv_main.setText("qqq");


    }




    @OnClick(R.id.tv_main)
    @CheckNet
    private void onClick(View view){
        Toast.makeText(this,"我被点击啦！",Toast.LENGTH_SHORT).show();
    }


}
