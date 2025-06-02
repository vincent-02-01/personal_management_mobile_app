Project name: WeFit
Description: Personal management mobile app

# 📱 Kotlin Android App - MVVM Folder Structure
com.example.myapp
├── data/
│ ├── local/ # Dữ liệu lưu trên máy (SharedPreferences, Room DB)
│ ├── remote/ # Giao tiếp server (Retrofit hoặc fake API)
│ └── repository/ # Triển khai các Repository interface (dùng cho UseCase)
│
├── domain/
│ ├── model/ # Các model dùng trong toàn bộ domain
│ ├── repository/ # Interface các Repository
│ └── usecase/ # Chứa logic nghiệp vụ, dùng trong ViewModel
│
├── presentation/
│ ├── login/ # Mỗi màn hình là 1 folder riêng
│ │ ├── LoginActivity.kt # Giao diện
│ │ ├── LoginViewModel.kt # ViewModel xử lý UI logic
│ │ └── LoginState.kt # State cho login
│
├── di/ # Dependency Injection (nếu dùng Hilt/Koin)
├── utils/ # Tiện ích: Constants, Extension, Helpers...
└── MyApp.kt # Application class (khai báo ViewBinding, Hilt, etc.)