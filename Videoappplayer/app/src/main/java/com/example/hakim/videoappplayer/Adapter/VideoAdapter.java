package com.example.hakim.videoappplayer.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.hakim.videoappplayer.Model.VideoModel;
import com.example.hakim.videoappplayer.R;

import java.util.ArrayList;
import java.util.Objects;

public  class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder>
{
    Context context;
    ArrayList<VideoModel> arrayListVideos;
    public VideoAdapter(Context context,ArrayList<VideoModel> arrayListVideos)
    {
      this.context=context;
      this.arrayListVideos=arrayListVideos;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view=LayoutInflater.from (parent.getContext ()).inflate (R.layout.custom_video,parent,false);
        return new VideoAdapter.ViewHolder (view);


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i)
    {
        Glide.with (context).load ("file://"+arrayListVideos.get (i).getStr_thum ())
                .skipMemoryCache(false)
                .into(viewHolder.imageView);
        viewHolder.rl_select.setBackgroundColor (Color.parseColor ("#FFFFFF"));
        viewHolder.rl_select.setAlpha (0);
        viewHolder.rl_select.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText (context, "You clicked the video", Toast.LENGTH_SHORT).show ();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListVideos.size ();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
       ImageView imageView;
       RelativeLayout rl_select;
       public ViewHolder(@NonNull View itemView) {
          super (itemView);
          imageView=(ImageView)itemView.findViewById (R.id.iv_image);
          rl_select=(RelativeLayout)itemView.findViewById (R.id.rl_select);

       }
    }
   }

