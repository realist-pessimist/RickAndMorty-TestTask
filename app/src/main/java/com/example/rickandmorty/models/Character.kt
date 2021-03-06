package com.example.rickandmorty.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    @SerializedName("image")
    val avatar: String,
    val created: Date,
): Serializable