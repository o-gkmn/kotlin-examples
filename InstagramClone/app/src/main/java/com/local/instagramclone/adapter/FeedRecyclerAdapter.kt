package com.local.instagramclone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.local.instagramclone.databinding.RecyclerViewRowBinding
import com.local.instagramclone.model.Post
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter(val postList : List<Post>) : RecyclerView.Adapter<FeedRecyclerAdapter.FeedRecyclerHolder>() {
    class FeedRecyclerHolder(val binding : RecyclerViewRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedRecyclerHolder {
        val binding = RecyclerViewRowBinding.inflate(LayoutInflater.from(parent.context))
        return FeedRecyclerHolder(binding)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: FeedRecyclerHolder, position: Int) {
        holder.binding.recyclerEmailText.text = postList[position].userEmail
        holder.binding.recyclerCommentText.text = postList[position].comment
        Picasso.get().load(postList[position].downloadUrl).into(holder.binding.recyclerImageView)
    }

}