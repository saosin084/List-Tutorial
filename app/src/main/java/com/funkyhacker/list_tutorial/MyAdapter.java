package com.funkyhacker.list_tutorial;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private ArrayList<Item> mDataset;
    private String[] mDataset2 = new String[20];

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView,mTextView2;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView)itemView.findViewById(R.id.text_view);
            mTextView2 = (TextView)itemView.findViewById(R.id.text_view2);
        }
    }

    public MyAdapter(ArrayList<Item> list) {
        mDataset = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.mTextView.setText(mDataset[position]);
        holder.mTextView2.setText(mDataset2[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
