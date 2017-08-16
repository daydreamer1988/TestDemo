package com.austin.testdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    private BeepManager beepManager;
    private LinearLayout inflate;
    private LinearLayout mRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoot = (LinearLayout) findViewById(R.id.root);





        inflate = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout, null);
        //第一种方法（成功）
       /* mRoot.addView(inflate);
        inflate.post(new Runnable() {
            @Override
            public void run() {
                log(inflate);
            }
        });*/

        inflate.measure(0, 0);
        log(inflate);

    }




    private void mesureView(View view) {

        view.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

       /* int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        view.measure(w, h);
        int height = view.getMeasuredHeight();
        int width = view.getMeasuredWidth();*/


/*
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if(layoutParams==null){
            layoutParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        int widthSpec = 0;
        int tempWidth = layoutParams.width;
       *//* if(tempWidth>0 || tempWidth==-1){
            widthSpec = View.MeasureSpec.makeMeasureSpec(tempWidth, View.MeasureSpec.EXACTLY);
        }else if(tempWidth == -2){
            widthSpec = View.MeasureSpec.makeMeasureSpec(tempWidth, View.MeasureSpec.AT_MOST);
        }else{
            widthSpec = View.MeasureSpec.makeMeasureSpec(tempWidth, View.MeasureSpec.UNSPECIFIED);
        }*//*

        if(tempWidth==-1){
            widthSpec = View.MeasureSpec.makeMeasureSpec(tempWidth, View.MeasureSpec.UNSPECIFIED);
        }


        int heightSpec;
        int tempHeight = layoutParams.height;
        if(tempHeight>0 || tempHeight==-1){
            heightSpec = View.MeasureSpec.makeMeasureSpec(tempHeight, View.MeasureSpec.EXACTLY);
        } else if (tempHeight == -2) {
            heightSpec = View.MeasureSpec.makeMeasureSpec(tempHeight, View.MeasureSpec.AT_MOST);
        } else {
            heightSpec = View.MeasureSpec.makeMeasureSpec(tempHeight, View.MeasureSpec.UNSPECIFIED);
        }

        view.measure(widthSpec, heightSpec);*/

    }

    public void doClick(View view) {

    }

    public void log(View inflate){
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        JLogUtils.E(measuredWidth + ":" + measuredHeight);

    }
}














