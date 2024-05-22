package com.example.runapp.screens.register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RegisterViewModel: ViewModel() {
    var nick by mutableStateOf("")
    var mail by mutableStateOf("")
    var pass by mutableStateOf("")
    var confrimPass by mutableStateOf("")
}