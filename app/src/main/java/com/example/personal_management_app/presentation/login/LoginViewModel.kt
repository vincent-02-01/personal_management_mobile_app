package com.example.personal_management_app.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.personal_management_app.data.repository.LoginRepository
import kotlinx.coroutines.launch

class LoginViewModel(private val repository: LoginRepository) : ViewModel() {

    private val _loginResult = MutableLiveData<Boolean>() // true nếu login thành công
    val loginResult: LiveData<Boolean> = _loginResult

    fun login(email: String, password: String) {
        viewModelScope.launch {
            val token = repository.login(email, password)
            if (token != null) {
                repository.saveToken(token) // lưu token
                _loginResult.postValue(true)
            } else {
                _loginResult.postValue(false)
            }
        }
    }
}