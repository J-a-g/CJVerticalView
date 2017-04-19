package com.example.sj.cjpullrefreshdemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by SJ on 2017.4.20.
 */

public class HeadView extends LinearLayout {

    private TextView textView;

    public HeadView(Context context) {
        super(context);
        init();
    }

    public HeadView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HeadView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        Log.v("tag","init");
        textView = new TextView(getContext());
        textView.setText("Test");
        textView.setTextSize(20.0f);
        addView(textView, new LinearLayout.LayoutParams(

                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
    }

}
