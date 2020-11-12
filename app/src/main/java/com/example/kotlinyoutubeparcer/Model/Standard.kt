package com.example.kotlinyoutubeparcer.Model


import com.google.gson.annotations.SerializedName

data class Standard(
    @SerializedName("height")
    val height: Int?=null,
    @SerializedName("url")
    val url: String?=null,
    @SerializedName("width")
    val width: Int?=null
)