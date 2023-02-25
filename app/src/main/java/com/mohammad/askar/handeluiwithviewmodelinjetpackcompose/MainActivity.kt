package com.mohammad.askar.handeluiwithviewmodelinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.component.UserScreen
import com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.ui.theme.HandelUIWithViewModelInJetpackComposeTheme
import com.mohammad.askar.handeluiwithviewmodelinjetpackcompose.viewModel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HandelUIWithViewModelInJetpackComposeTheme {
                UserScreen()
            }
        }
    }
}
