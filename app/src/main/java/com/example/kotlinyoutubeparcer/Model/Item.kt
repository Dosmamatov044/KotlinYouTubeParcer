package com.example.kotlinyoutubeparcer.Model


import com.google.gson.annotations.SerializedName

data class Item(
        @SerializedName("etag")
    val etag: String?=null,
        @SerializedName("id")
    val id: String?= null,
        @SerializedName("kind")
    val kind: String?=null,
        @SerializedName("snippet")
    val snippet: Snippet?=null
)