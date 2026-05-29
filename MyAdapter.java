package com.example.recyclerviewassignment.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewassignment.Models.CardModel;
import com.example.recyclerviewassignment.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<CardModel> data;

    public MyAdapter(List<CardModel> data) {
        this.data = data;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name,role;
       public MyViewHolder(View itemView){
           super(itemView);
           img=itemView.findViewById(R.id.img1);
           name=itemView.findViewById(R.id.name);
           role=itemView.findViewById(R.id.role);
       }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        CardModel item = data.get(position);
        holder.name.setText(item.getName());
        holder.role.setText(item.getRole());
        holder.img.setImageResource(item.getImg());
    }
}
