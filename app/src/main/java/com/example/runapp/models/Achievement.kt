package com.example.runapp.models

data class Achievement(
    val id:Int,
    val title: String,
    val image_url: String,
    val for_level: Int,
    val for_steps: Int,
    val for_length: Int
)
