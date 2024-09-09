package com.example.craftyapp.domain.repos

import com.example.craftyapp.domain.models.Product
import com.example.craftyapp.utils.AppResult
import kotlinx.coroutines.flow.Flow

interface ProductRepo {
    suspend fun getAllProducts():Flow<AppResult<List<Product>>>
}