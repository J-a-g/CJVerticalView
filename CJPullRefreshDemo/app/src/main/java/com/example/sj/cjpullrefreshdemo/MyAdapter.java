package com.example.sj.cjpullrefreshdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by SJ on 2017.4.21.
 */

public class MyAdapter extends BaseAdapter {
    private String[] contents;
    private Context context;
    private LayoutInflater inflater;

    public MyAdapter(String[] contents, Context context) {
        this.contents = contents;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contents.length;
    }

    @Override
    public Object getItem(int i) {
        return contents[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view == null){
            viewHolder = new ViewHolder();
            view = inflater.inflate(R.layout.item,viewGroup,false);
            viewHolder.textView = (TextView) view.findViewById(R.id.content);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.textView.setText(contents[i]);
        return view;
    }

    class ViewHolder {
        TextView textView;
    }


}
