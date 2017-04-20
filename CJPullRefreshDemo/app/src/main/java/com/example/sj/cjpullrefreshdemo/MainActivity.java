package com.example.sj.cjpullrefreshdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AbsListView;

import com.example.sj.cjpullrefreshdemo.view.MyListView;

public class MainActivity extends Activity {

    private String[] contents  = new String[15];
    MyListView myListView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (MyListView)findViewById(R.id.mylistview);
        init();
    }

    private void init(){
        Log.v("tag","MainActivity init");
        for(int i=0;i<15;i++){
            contents[i] = "Suchengjian-> " + i;
        }
        myAdapter = new MyAdapter(contents,this);
        myListView.setAdapter(myAdapter);
        myListView.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {

            }

            @Override
            public void onScroll(AbsListView absListView,int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                //absListView.get
                if(firstVisibleItem==0){
                    //Log.e("log", "滑到顶部");
                }
                if(visibleItemCount+firstVisibleItem==totalItemCount){
                   // Log.e("log", "滑到底部");
                }
            }
        });
    }


}
