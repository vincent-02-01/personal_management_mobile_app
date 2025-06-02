package com.example.personal_management_app

import android.app.Application

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Init SharedPreferences, Hilt (nếu cần)
    }
}
