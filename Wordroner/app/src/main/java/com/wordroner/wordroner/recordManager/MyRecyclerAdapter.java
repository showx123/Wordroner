package com.wordroner.wordroner.recordManager;

/**
 * Created by oneno on 2017-02-17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wordroner.wordroner.R;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {
    private List<String> speechList;


    public MyRecyclerAdapter(List<String> speechList) {
        this.speechList = speechList;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_record, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = speechList.get(position);
        holder.tvTitle.setText(item);
    }

    @Override
    public int getItemCount() {
        return speechList != null ? speechList.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = ((TextView) itemView.findViewById(R.id.tv_item_record_title));
        }
    }
}