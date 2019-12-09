package com.pv.pvbase

import com.pv.base.BaseScreen
import com.pv.base.screen
import io.reactivex.disposables.Disposable

class MainListScreen : BaseScreen() {

    override fun ui() = screen {
        layout = R.layout.screen_main_list
    }

    override fun bindings(): Array<Disposable> = emptyArray()
}