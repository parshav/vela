package com.pv.pvbase.main_list

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.ui.graphics.toArgb
import com.pv.base.log
import com.pv.pvbase.CommandItemData
import com.pv.pvbase.R

class MainListAdapter : RecyclerView.Adapter<MainListAdapter.ViewHolder>() {

    private val data = CommandItemData.testData()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with (holder) {
        holder.bind(position)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val title: TextView = view.findViewById(R.id.tv_title)
        private val background: CardView = view.findViewById(R.id.ll_main_item)
        private val action: Button = view.findViewById(R.id.btn_action)

        fun bind(position: Int) {
            val data = data[position]
            title.text = data.name
            background.setCardBackgroundColor(data.color.toArgb())
        }
    }
}