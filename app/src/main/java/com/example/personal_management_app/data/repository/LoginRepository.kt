package com.example.personal_management_app.data.repository

import android.content.Context
import com.example.personal_management_app.data.local.UserPreferences
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first

class LoginRepository(private val context: Context, private val dataStore: UserPreferences) {

    // Giả lập gọi API đăng nhập
    suspend fun login(email: String, password: String): String? {
        delay(1000) // giả lập loading
        return if (email == "test@example.com" && password == "123456") {
            "fake_token_123456"
        } else null
    }

    suspend fun saveToken(token: String) {
        dataStore.saveToken(token)
    }

    suspend fun getToken(): String? {
        return dataStore.tokenFlow.first()
    }
}
