package com.example.kotlinyoutubeparcer.Model


import com.google.gson.annotations.SerializedName

data class Snippet(
    @SerializedName("channelId")
    val channelId: String?=null,
    @SerializedName("channelTitle")
    val channelTitle: String?=null,
    @SerializedName("description")
    val description: String?=null,
    @SerializedName("playlistId")
    val playlistId: String?=null,
    @SerializedName("position")
    val position: Int?=null,
    @SerializedName("publishedAt")
    val publishedAt: String?=null,
    @SerializedName("resourceId")
    val resourceId: ResourceId?=null,
    @SerializedName("thumbnails")
    val thumbnails: Thumbnails?=null,
    @SerializedName("title")
    val title: String?=null
)