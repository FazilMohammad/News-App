package com.example.tradptoxn;
//for working with recyclerview we need adapter class

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
//RecyclerView is the ViewGroup that contains the views corresponding to your data.
//An Adapter object acts as a bridge between an AdapterView and the underlying data for that view.
//A ViewHolder describes an item view and metadata about its place within the RecyclerView
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<ModelClass> modelClassArrayList; //we will get the model array of any type data articls (so we have show data articls on our recycler view )
    private ViewHolder holder;
    private int position;

    public Adapter(Context context, ArrayList<ModelClass> modelClassArrayList) {
        this.context = context;
        this.modelClassArrayList = modelClassArrayList;
    }

    //we need to return the view to work with recycler view
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // LayoutInflater-- Instantiates a layout XML file into its corresponding View objects. It is never used directly. Instead, use Activity.
        //then we have the pass the two things null and false
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, null, false);
        return new ViewHolder(view); //we return this
    }

    //onBindViewHolder(VH holder, int position) Called by RecyclerView to display the data at the specified position.
    // we need onBindViewHolder here to simply set the data according to our item or we can according our position
//CardView is the view that can display views on top of each other.
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, webview.class);
                intent.putExtra("url", modelClassArrayList.get(position).getUrl()); // need to pass the url to open the url in the webview activity
                context.startActivity(intent);
            }
        });

//below we are concatenating the string

        holder.mtime.setText("Published At:- "+modelClassArrayList.get(position).getPublishedAt());
        holder.mauthor.setText(modelClassArrayList.get(position).getAuthor());
        holder.mheading.setText(modelClassArrayList.get(position).getTitle());
        holder.mcontent.setText(modelClassArrayList.get(position).getDescription());
        //glide is use to show the image
        Glide.with(context).load(modelClassArrayList.get(position).getUrlToImage()).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView mheading,mcontent,mauthor,mtime;
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
