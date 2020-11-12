package com.example.kotlinyoutubeparcer.Model


import com.google.gson.annotations.SerializedName

data class ResourceId(
    @SerializedName("kind")
    val kind: String?=null,
    @SerializedName("videoId")
    val videoId: String?=null
)