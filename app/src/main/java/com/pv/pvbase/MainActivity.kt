package com.pv.pvbase

import com.pv.base.BaseActivity
import com.pv.base.ui
import com.pv.pvbase.main_list.MainListScreen

class MainActivity : BaseActivity() {

    override fun uiBuilder() = ui {
        layout = R.layout.activity_main
        screen = MainListScreen()
    }
}
