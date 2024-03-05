package com.example.sat_akele

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.recyclerview.widget.RecyclerView
import com.example.sat_akele.databinding.ActivityMainBinding
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsarrayList: ArrayList<News>, var context : Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent,false)
        return MyViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        var currentItem = newsarrayList[position]
        holder.hTitle.text = currentItem.newsH
        holder.hImage.setImageResource(currentItem.newsI )

    }

    override fun getItemCount(): Int {
        return newsarrayList.size
    }
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
        val hTitle = itemView.findViewById<TextView>(R.id.title)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.image)

    }

}

