package com.example.orca;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CtegoryViewHolder> {

    Context context;
    ArrayList<CategoryModel> categoryModels;

    public CategoryAdapter(HomeActivity context, ArrayList<CategoryModel> categoryModels){
        this.context=context;
        this.categoryModels=categoryModels;
    }


    @NonNull
    @Override
    public CtegoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_category,null);
        return new CtegoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CtegoryViewHolder holder, int position) {
CategoryModel model=categoryModels.get(position);
holder.Categoryname.setText(model.getCategoryName());
holder.Categoryprice.setText(model.getCategoryPrice());
        Glide.with(context).load(model.getCategoryImage())
                .into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,TransactionActivity.class);
                intent.putExtra("catId",model.getCategoryId());
                context.startActivity(intent);
            }
        });

//todo
    }

    @Override
    public int getItemCount() {
        return categoryModels.size();
    }

    public class CtegoryViewHolder extends RecyclerView.ViewHolder{
ImageView imageView;
TextView Categoryname;
TextView Categoryprice;
        public CtegoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.categoryimage);
            Categoryname=itemView.findViewById(R.id.categoryname);
            Categoryprice=itemView.findViewById(R.id.categoryprice);
        }
    }
}
