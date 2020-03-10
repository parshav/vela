package com.pv.pvbase.secondaryscreen

import android.view.View
import android.widget.Button
import com.pv.base.BaseScreen
import com.pv.base.NavigatorTemplate
import com.pv.base.screen
import com.pv.pvbase.R
import com.pv.pvbase.camera.CameraScreen
import io.reactivex.disposables.Disposable
import org.koin.android.ext.android.inject

class SecondaryScreen : BaseScreen() {

    private lateinit var cameraButton: Button
    private val navigator: NavigatorTemplate by inject()

    override fun ui() = screen {
        layout = R.layout.screen_secondary
    }

    override fun onViewLoaded(view: View) {
        super.onViewLoaded(view)

        cameraButton = view.findViewById(R.id.btn_camera)

        cameraButton.setOnClickListener {
            navigator.navigateTo(CameraScreen())
        }
    }

    override fun bindings(): Array<Disposable> = emptyArray()
}
