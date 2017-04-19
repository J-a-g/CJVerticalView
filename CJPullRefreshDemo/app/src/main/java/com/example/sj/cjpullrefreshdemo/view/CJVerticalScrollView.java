package com.example.sj.cjpullrefreshdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by SJ on 2017.4.20.
 */

public class CJVerticalScrollView extends ViewGroup{

    private HeadView headView;
    private MyListView myListView;
    private FootView footView;

    private VelocityTracker velocityTracker;

    public CJVerticalScrollView(Context context) {
        super(context);
      //  init();
    }

    public CJVerticalScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
      //  init();
    }

    public CJVerticalScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
       // init();
    }

    private void init(){
        if(headView == null){
            headView = new HeadView(getContext());
        }
        if(myListView == null){
            myListView = new MyListView(getContext());
        }
        if(footView == null){
            footView = new FootView(getContext());
        }
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec,heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {
        int childTop = 0;
        final int childCount = getChildCount();
        Log.v("tag","childCount----> " +childCount);

        for(int j = 0; j < childCount; j++){
            final View childview = getChildAt(j);
            if(childview.getVisibility() == View.VISIBLE){
                final int childHeight = childview.getMeasuredHeight();
                Log.v("tag","childHeight----> " + childHeight);
                childview.layout(0,childTop,childview.getMeasuredWidth(),childTop + childHeight);
                childTop += childHeight;
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
