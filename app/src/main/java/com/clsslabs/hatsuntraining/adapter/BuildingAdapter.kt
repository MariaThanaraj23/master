package com.clsslabs.hatsuntraining.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.clsslabs.hatsuntraining.R
import com.clsslabs.hatsuntraining.model.Rows

class BuildingAdapter(var rows: ArrayList<Rows>) :
    RecyclerView.Adapter<BuildingAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var buildingName: TextView = view.findViewById(R.id.name);
        var status: TextView = view.findViewById(R.id.status);
        var fromdate: TextView = view.findViewById(R.id.from_date);
        var todate: TextView = view.findViewById(R.id.to_date);
        var editImage: ImageView = view.findViewById(R.id.edit_img)
        var deleteImage: ImageView = view.findViewById(R.id.delete_img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.building_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.buildingName.text = rows[position].buildingName
        holder.status.text = rows[position].status
        holder.fromdate.text = rows[position].idFromDate
        holder.todate.text = rows[position].toDate
    }

    override fun getItemCount(): Int {
        return rows.size
    }
}