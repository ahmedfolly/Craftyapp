package com.example.craftyapp.utils

sealed class AppResult<out T> {
    object Loading : AppResult<Nothing>()
    class Success<T>(val data: T) : AppResult<T>()
    class Error(val e: Exception) : AppResult<Nothing>()
}
