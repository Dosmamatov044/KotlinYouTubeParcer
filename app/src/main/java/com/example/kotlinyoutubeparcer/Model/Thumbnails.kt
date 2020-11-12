package com.example.kotlinyoutubeparcer.Model


import com.example.kotlinyoutubeparcer.Model.*
import com.google.gson.annotations.SerializedName

data class Thumbnails(
    @SerializedName("default")
    val default: Default?=null,
    @SerializedName("high")
    val high: High?=null,
    @SerializedName("maxres")
    val maxres: Maxres?=null,
    @SerializedName("medium")
    val medium: Medium?=null,
    @SerializedName("standard")
    val standard: Standard?=null
)