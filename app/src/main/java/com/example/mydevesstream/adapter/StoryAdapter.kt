package com.example.mydevesstream.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mydevesstream.R
import com.example.mydevesstream.databinding.StorylayoutBinding
import com.example.mydevesstream.model.storyResponse.Content
import com.example.mydevesstream.model.storyResponse.Story
import com.squareup.picasso.Picasso

class StoryAdapter(
    private val context: Context,
    private var storyList: ArrayList<Content>,
) : RecyclerView.Adapter<StoryAdapter.MyViewHolder>() {

   var imageUrl: String? = null

    var headline: String? = null


    inner class MyViewHolder(val binding: StorylayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = StorylayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = storyList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val item = storyList[position]

        // Hero Image (Top image)
        if (!imageUrl.isNullOrEmpty()) {
            Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.image1)
                .into(holder.binding.image)
        } else {
            holder.binding.image.setImageResource(R.drawable.image1)
        }

       if(!headline?.isEmpty()!!){
           holder.binding.headline.text = headline
       }

        holder.binding.newsType.text = item.type

        holder.binding.body.text = item.text?:"Sed ut perspiciatis"


    }

    fun setStoryList(list: ArrayList<Content>,imageUrl:String,headline:String) {
        storyList = list
        this.imageUrl= imageUrl
        this.headline= headline

        notifyDataSetChanged()
    }
}



