package com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

import com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.viewModel.UserViewModel

@Composable
fun UserScreen(
    viewModel: UserViewModel = viewModel()
){
    val state by viewModel.userState.collectAsState()
    
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        if (!state.errorMessage.isNullOrEmpty()){
            Text(text = state.errorMessage!!)
        }else if (state.isLoading) CircularProgressIndicator()
        else if (!state.data.isNullOrEmpty()){
            val userList = state.data!!

            LazyColumn {
                items(userList){
                    Text(text = it)
                }
            }
        }
    }
}