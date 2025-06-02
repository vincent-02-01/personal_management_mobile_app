Project name: WeFit
Description: Personal management mobile app

Folder Structure:
app/
├── data/                                // Tầng xử lý dữ liệu (local & remote)
│   ├── local/                           // Dữ liệu nội bộ: Room, SharedPreferences
│   │   ├── dao/
│   │   │   └── TodoDao.kt               // Interface thao tác với DB
│   │   ├── db/
│   │   │   └── AppDatabase.kt           // Room database config
│   │   └── model/
│   │       └── TodoEntity.kt            // Entity dùng cho Room
│   ├── remote/                          // Dữ liệu từ server
│   │   ├── api/
│   │   │   └── TodoApi.kt               // Retrofit API interface
│   │   └── dto/
│   │       └── TodoDto.kt               // Dữ liệu từ JSON
│   ├── repository/
│   │   └── TodoRepositoryImpl.kt       // Triển khai giao diện từ domain
│   └── mapper/
│       └── TodoMapper.kt               // Chuyển DTO ↔ Entity ↔ Domain Model
│
├── domain/                              // Business logic
│   ├── model/
│   │   └── Todo.kt                      // Model thuần Kotlin
│   ├── repository/
│   │   └── TodoRepository.kt           // Interface repository
│   └── usecase/
│       └── GetTodoListUseCase.kt       // Trường hợp sử dụng cụ thể
│
├── presentation/                        // Giao diện và logic hiển thị
│   ├── common/
│   │   ├── base/
│   │   │   └── BaseViewModel.kt        // ViewModel chung
│   │   ├── component/
│   │   │   └── LoadingDialog.kt        // Component dùng chung
│   │   └── utils/
│   │       └── Extensions.kt           // Extension functions
│   ├── todo/                            // Mỗi feature riêng 1 folder
│   │   ├── ui/
│   │   │   └── TodoListScreen.kt       // Màn hình danh sách công việc
│   │   ├── state/
│   │   │   └── TodoUiState.kt          // Trạng thái UI
│   │   └── viewmodel/
│   │       └── TodoViewModel.kt        // ViewModel tương ứng
│   └── navigation/
│       └── AppNavGraph.kt              // Graph điều hướng toàn app
│
├── di/                                  // Dependency Injection
│   └── AppModule.kt                     // Cung cấp các dependency
│
├── utils/                               // Công cụ hỗ trợ chung
│   └── Constants.kt                     // Hằng số toàn cục
│
└── MainActivity.kt                      // Activity chính của ứng dụng
