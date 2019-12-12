package com.pv.pvbase.main_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_main, null)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = with (holder) {
        title.text = data[position].name
//        background.setBackgroundColor(data[position].color.toArgb())
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val title: TextView = view.findViewById(R.id.tv_title)
        val background: CardView = view.findViewById(R.id.cv_main)
        private val action: Button = view.findViewById(R.id.btn_action)

        init {
            action.setOnClickListener {
                log("Clicked action yo")
            }
        }
    }
}