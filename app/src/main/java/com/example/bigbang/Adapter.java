package com.example.bigbang;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Calendar;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<APIMain> APIMainArrayList;

    public Adapter(Context context,ArrayList<APIMain>APIMainArrayList) {
        this.context = context;
        this.APIMainArrayList=APIMainArrayList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.layout_item,null,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,webView.class);
                intent.putExtra("url",APIMainArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        holder.mtime.setText("published At:-"+APIMainArrayList.get(position).getPublishedAt());
        holder.mauthor.setText(APIMainArrayList.get(position).getAuthor());
        holder.mheading.setText(APIMainArrayList.get(position).getTitle());
        holder.mcontent.setText(APIMainArrayList.get(position).getDescripton());
        Glide.with(context).load(APIMainArrayList.get(position).getUrlToImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return APIMainArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mheading,mcontent,mauthor,mcategory,mtime;
        CardView cardView;
        ImageView imageView;




        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mheading=itemView.findViewById(R.id.mainheading);
            mcontent=itemView.findViewById(R.id.content);
            mauthor=itemView.findViewById(R.id.author);
            mtime=itemView.findViewById(R.id.time);
            imageView=itemView.findViewById(R.id.imageview);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
}
