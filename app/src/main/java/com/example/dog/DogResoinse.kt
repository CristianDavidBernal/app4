package com.example.dog

import com.google.gson.annotations.SerializedName

data class DogResoinse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>)
