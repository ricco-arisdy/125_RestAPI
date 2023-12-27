package com.example.restapi

import android.app.Application
import com.example.restapi.repository.AppContainer
import com.example.restapi.repository.KontakContainer

class KontakApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain depedencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}