package com.example.kotlinyoutubeparcer.Model


import com.google.gson.annotations.SerializedName

data class PageInfo(
    @SerializedName("resultsPerPage")
    val resultsPerPage: Int?=null,
    @SerializedName("totalResults")
    val totalResults: Int?=null
)