package com.hnakyol.kotlinfoursquare

import android.app.Application
import com.parse.Parse

class StarterApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG)
        Parse.initialize(Parse.Configuration.Builder(this)
            .applicationId("fwoKvaojmFQfeobH0MIpm5rFFC9josDMNSBTZkVj")
            .clientKey("qdrF0ZFwNtVcXN9hS7Do0TiNUzzdKxeb1TqJ8B0j")
            .server("https://parseapi.back4app.com/")
            .build())
    }



}