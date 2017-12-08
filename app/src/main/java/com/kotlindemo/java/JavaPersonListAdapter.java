package com.kotlindemo.java;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kotlindemo.R;
import com.kotlindemo.java.visibilitymodifiers.JavaPerson;

import java.util.List;

/**
 * Created by timothyhe on 2017/12/8.
 */

public class JavaPersonListAdapter extends RecyclerView.Adapter<JavaPersonListAdapter.ViewHolder> {


    private List<JavaPerson> mListData;

    public JavaPersonListAdapter(List<JavaPerson> listData) {
        mListData = listData;
    }

    @Override
    public JavaPersonListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (holder != null) {
            holder.bind(mListData.get(position));
        }
    }


    @Override
    public int getItemCount() {
        return mListData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView age;
        private TextView sex;
        private TextView height;
        private TextView idcard;

        public ViewHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            sex = itemView.findViewById(R.id.sex);
            height = itemView.findViewById(R.id.height);
            idcard = itemView.findViewById(R.id.idcard);
        }

        private void bind(JavaPerson person) {
            name.setText(person.name);
            age.setText(String.valueOf(person.age));
            sex.setText(String.valueOf(person.sex));
            height.setText(String.valueOf(person.height));
            idcard.setText(person.idcard);
        }
    }
}
