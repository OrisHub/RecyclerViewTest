package com.example.recyclerviewtestapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private final Context context;
    private final ArrayList<String> strings;
    private final LayoutInflater inflater;

    public ListAdapter(Context context, ArrayList<String> strings) {
        this.context=context;
        this.strings=strings;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(android.R.layout.simple_list_item_1, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(strings.get(position));
    }
    @Override
    public int getItemCount() {
        return strings.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView text1;

        public ViewHolder (View itemView) {
            super(itemView);
            text1 = itemView.findViewById(android.R.id.text1);
        }
        public void bindData(String s) {
            text1.setText(s);
        }
    }
}
