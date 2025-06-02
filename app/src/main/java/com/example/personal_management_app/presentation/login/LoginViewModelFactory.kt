package com.example.personal_management_app.presentation.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.personal_management_app.data.repository.LoginRepository

class LoginViewModelFactory(private val repository: LoginRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(repository) as T
    }
}