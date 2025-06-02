package com.example.personal_management_app.presentation.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.personal_management_app.data.local.UserPreferences
import com.example.personal_management_app.data.repository.LoginRepository
import com.example.personal_management_app.databinding.ActivityLoginBinding
import com.example.personal_management_app.presentation.main.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    // Tạo ViewModel với custom factory
    private val viewModel: LoginViewModel by viewModels {
        LoginViewModelFactory(LoginRepository(applicationContext, UserPreferences(applicationContext)))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            if (email.isNotEmpty() && password.isNotEmpty()) {
                viewModel.login(email, password)
            } else {
                Toast.makeText(this, "Vui lòng nhập đầy đủ", Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.loginResult.observe(this) { success ->
            if (success) {
                Toast.makeText(this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show()
            }
        }
    }
}