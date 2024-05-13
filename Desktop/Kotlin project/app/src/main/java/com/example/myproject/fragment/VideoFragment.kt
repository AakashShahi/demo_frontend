package com.example.myproject.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myproject.R
import com.example.myproject.adapter.VideoAdapter
import com.example.myproject.databinding.FragmentVideoBinding

class VideoFragment : Fragment() {
   lateinit var videoBinding: FragmentVideoBinding
   var titleList= ArrayList<String>()
    var imageList= ArrayList<Int>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        videoBinding=FragmentVideoBinding.inflate(inflater,container,false)
        titleList.add("apple")
        imageList.add(R.drawable.apple)
        titleList.add("apple")
        imageList.add(R.drawable.apple)
        titleList.add("apple")
        imageList.add(R.drawable.apple)
        titleList.add("apple")
        imageList.add(R.drawable.apple)

        var adapter=VideoAdapter(titleList,imageList)

        videoBinding.recyclerView.layoutManager=LinearLayoutManager(context)
        videoBinding.recyclerView.adapter=adapter

        return videoBinding.root
    }

}