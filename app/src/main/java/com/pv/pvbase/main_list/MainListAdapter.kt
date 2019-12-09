package com.pv.pvbase.main_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pv.base.log
import com.pv.pvbase.R

class MainListAdapter : RecyclerView.Adapter<MainListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_main, null)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 3

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = "Item at $position"
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val title: TextView = view.findViewById(R.id.tv_title)
        private val action: Button = view.findViewById(R.id.btn_action)

        init {
            action.setOnClickListener {
                log("Clicked action yo")
            }
        }
    }
}