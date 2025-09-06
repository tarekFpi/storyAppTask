package com.example.mydevesstream.adapter
import NewsData
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.mydevesstream.R
import com.example.mydevesstream.databinding.NewsLayoutBinding
import com.example.mydevesstream.utils.DateConvert
import com.squareup.picasso.Picasso

class NewsAdapter(
    private val context: Context,
    private var newsList: ArrayList<NewsData>
) : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    private var listPosition = -1
    private var clickListener: OnItemClickListener? = null

    inner class MyViewHolder(val binding: NewsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                clickListener?.onClick(position)
            }
        }
    }

    interface OnItemClickListener {
        fun onClick(position: Int)
    }

    fun setOnItemClick(listener: OnItemClickListener) {
        this.clickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = NewsLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = newsList[position]

        when (item.type) {
            "story", "weblink" -> {
                holder.binding.tvHeadline.text = item.headline ?: "No headline"
                holder.binding.tvTeaser.text = item.teaserText ?: "No teaser"
              //  holder.binding.tvTime.text = "36m ago"
                holder.binding.tvTime.text = DateConvert.formatRelativeTime(item.creationDate.toString())

                val imageUrl = item.teaserImage?.links?.url?.href ?: ""
                if (imageUrl.isNotEmpty()) {
                    Picasso.get()
                        .load(imageUrl)
                        .placeholder(R.drawable.image1)
                        .into(holder.binding.ivThumbnail)
                } else {
                    holder.binding.ivThumbnail.setImageResource(R.drawable.image1)
                }
            }

            "advert" -> {
                holder.binding.tvHeadline.text = "Sponsored"
                holder.binding.tvTeaser.text = item.url ?: "No URL"
                holder.binding.ivThumbnail.setImageResource(R.drawable.image3) // তোমার একটা ad placeholder
                holder.binding.tvTime.text = "36m ago"
            }
        }

        setAnimation(holder.itemView, position)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewsList(list: ArrayList<NewsData>) {
        this.newsList = list
        notifyDataSetChanged()
    }

    fun filterList(filterList: ArrayList<NewsData>) {
        this.newsList = filterList
        notifyDataSetChanged()
    }

    private fun setAnimation(view: View, position: Int) {
        if (position > listPosition) {
            val animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left)
            animation.duration = 500
            view.startAnimation(animation)
            listPosition = position
        }
    }
}
