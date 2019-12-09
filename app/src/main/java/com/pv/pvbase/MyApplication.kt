package com.pv.pvbase

import android.app.Application
import com.pv.base.activityHelperModule
import com.pv.base.navigatorModule
import com.pv.base.resourceHelperModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(
                listOf(
                    activityHelperModule,
                    navigatorModule,
                    resourceHelperModule
                )
            )
        }
    }
}
