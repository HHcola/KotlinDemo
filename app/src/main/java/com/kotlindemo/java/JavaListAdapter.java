package com.kotlindemo.java;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by timothyhe on 2017/12/8.
 */

public class JavaListAdapter extends RecyclerView.Adapter<JavaListAdapter.ViewHolder> {

    private String mItems[];

    public JavaListAdapter(String items[]) {
        mItems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mText.setText(mItems[position]);
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return mItems.length;
    }

    public  static class ViewHolder extends RecyclerView.ViewHolder {
        TextView mText;
        public ViewHolder(View itemView) {
            super(itemView);
            mText = (TextView) itemView;
        }
    }
}
