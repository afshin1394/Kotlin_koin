package com.mindorks.framework.mvvm.data.model

import com.squareup.moshi.Json

data class UserJson(
    @Json(name = "result")
    val result: List<Result>,
) {
    data class Result(
        @Json(name = "bottleGuid")
        val bottleGuid: String,
        @Json(name = "categoryId")
        val categoryId: Int,
        @Json(name = "image")
        val image: String,
        @Json(name = "isPurchased")
        val isPurchased: Int,
        @Json(name = "name")
        val name: String
    )
}