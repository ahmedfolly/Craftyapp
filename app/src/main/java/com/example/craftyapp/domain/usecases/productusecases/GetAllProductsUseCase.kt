package com.example.craftyapp.domain.usecases.productusecases

import com.example.craftyapp.domain.repos.ProductRepo

class GetAllProductsUseCase(private val productRepo: ProductRepo) {
    suspend operator fun invoke() = productRepo.getAllProducts()
}