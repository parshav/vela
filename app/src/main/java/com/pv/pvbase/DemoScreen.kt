package com.pv.pvbase

import android.view.View
import com.pv.base.BaseScreen
import com.pv.base.Screen
import com.pv.base.screen
import io.reactivex.disposables.Disposable

class DemoScreen : BaseScreen() {
    override fun ui(): Screen = screen {
        layout = R.layout.screen_demo
    }

    override fun bindings() = emptyArray<Disposable>()

}