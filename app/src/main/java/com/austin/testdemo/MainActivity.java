package com.austin.testdemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private BeepManager beepManager;
    private LinearLayout inflate;
    private LinearLayout mRoot;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRoot = (LinearLayout) findViewById(R.id.root);

        view = new View(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(300, 300);
        view.setLayoutParams(layoutParams);



      /*  ShapeDrawable drawable = new ShapeDrawable();
        drawable.setIntrinsicHeight(100);
        drawable.setIntrinsicWidth(100);

        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(100, 100);
       */
        view.setBackgroundResource(R.drawable.drawable30dp_30dp);

        Drawable background = view.getBackground();
        int intrinsicWidth = background.getIntrinsicWidth();
        int intrinsicHeight = background.getIntrinsicHeight();
        mRoot.addView(view);

        view.measure(0, 0);
        int width = view.getWidth();
        int height = view.getHeight();
        int measuredWidthAndState = view.getMeasuredWidthAndState();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeightAndState = view.getMeasuredHeightAndState();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

    }

    private void getMesureData(View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        int measuredWidthAndState = view.getMeasuredWidthAndState();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeightAndState = view.getMeasuredHeightAndState();
    }

}














