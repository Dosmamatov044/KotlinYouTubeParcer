package com.example.kotlinyoutubeparcer.Model


import com.example.kotlinyoutubeparcer.Model.Item
import com.example.kotlinyoutubeparcer.Model.PageInfo
import com.google.gson.annotations.SerializedName

data class YouTubeParcerModel(
    @SerializedName("etag")
    val etag: String?=null,
    @SerializedName("items")
    val items: List<Item>?=null,
    @SerializedName("kind")
    val kind: String?=null,
    @SerializedName("nextPageToken")
    val nextPageToken: String?=null,
    @SerializedName("pageInfo")
    val pageInfo: PageInfo?=null
)