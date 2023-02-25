package com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.state

data class UserState(
    val data: List<String>? = null,
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)