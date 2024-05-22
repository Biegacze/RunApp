package com.example.runapp.models

data class User(
    val id: Int,
    val uid: String,
    val name: String,
    val mail: String,
    val level: Int,
    val achievement_id: Int,
    val title_level_id: Int,
    val daily_count_steps_and_statistics: Int,
    val routes: Int,
    val best_routes: Int
)
