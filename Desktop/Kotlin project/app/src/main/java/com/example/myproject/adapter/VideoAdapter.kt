package com.example.myproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject.R

class VideoAdapter(var titleList: ArrayList<String>, var imageList: ArrayList<Int>): RecyclerView.Adapter<VideoAdapter.FruitsViewHolder>() {
    class FruitsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.textView)
        var image: ImageView = view.findViewById(R.id.imageShow)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VideoAdapter.FruitsViewHolder {
        var view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.sample_recycler_view,parent,false)

        return FruitsViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoAdapter.FruitsViewHolder, position: Int) {
        holder.title.text = titleList[position]
        holder.image.setImageResource(imageList[position])
    }

    override fun getItemCount(): Int {
        return titleList.size
    }
}




