package com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.state.UserState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {

    private val _userState = MutableStateFlow<UserState>(value = UserState())
    val userState: StateFlow<UserState> = _userState.asStateFlow()

    init {
        getUser()
    }

    private fun getUser() = viewModelScope.launch {

        _userState.update { it.copy(isLoading = true) }
        delay(2000L)

        val userList = listOf<String>("Farouh", "Alaa", "Askar", "Haviz")
        _userState.update { it.copy(isLoading = false, data = userList) }
        delay(2000L)

        _userState.update { it.copy(isLoading = true) }
        delay(500L)

        _userState.update { it.copy(data = null, isLoading = false, errorMessage = "Error Data Not Found!") }
    }
}