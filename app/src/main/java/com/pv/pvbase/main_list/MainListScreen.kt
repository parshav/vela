package com.pv.pvbase.main_list

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pv.base.BaseScreen
import com.pv.base.screen
import com.pv.pvbase.R
import io.reactivex.disposables.Disposable

class MainListScreen : BaseScreen() {

    private lateinit var recyclerView: RecyclerView
    private val mainListAdapter = MainListAdapter()
    private val lm = LinearLayoutManager(this.context)

    override fun ui() = screen {
        layout = R.layout.screen_main_list
    }

    override fun onViewLoaded(view: View) {
        super.onViewLoaded(view)

        recyclerView = view.findViewById(R.id.rv_main)
        recyclerView.apply {
            layoutManager = lm
            adapter = mainListAdapter
        }
    }

    override fun bindings(): Array<Disposable> = emptyArray()
}