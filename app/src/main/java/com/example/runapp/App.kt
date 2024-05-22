package com.example.runapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.runapp.screens.login.LoginScreen
import com.example.runapp.ui.theme.RunAppTheme

@Composable
fun App(){
    RunAppTheme {
        /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        }*/
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    RunAppTheme {
        App()
    }
}