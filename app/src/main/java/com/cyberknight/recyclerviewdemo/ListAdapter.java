package com.cyberknight.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Parth on 21-02-2017.
 * Project RecyclerViewDemo.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    ArrayList<String> names;
    ArrayList<String> disc;
    Context mainActivityContext;

    public ListAdapter(Context mainActivityContext,
                       ArrayList<String> names, ArrayList<String> disc){
        this.mainActivityContext = mainActivityContext;
        this.names = names;
        this.disc = disc;
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.single_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, int position) {
        holder.tvName.setText(names.get(position));
        holder.tvDescription.setText(disc.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvDescription;
        LinearLayout llSingleItem;

        public ViewHolder(View itemView){
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDiscription);
            llSingleItem = (LinearLayout) itemView.findViewById(R.id.llSingleItem);

            llSingleItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mainActivityContext,
                            "You clicked: "+getAdapterPosition(),
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}
