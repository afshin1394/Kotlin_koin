package com.mindorks.framework.mvvm.data.api

import com.mindorks.framework.mvvm.data.model.UserJson
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/api/Bottle/GetAll")
    suspend fun getUsers(): Response<List<UserJson.Result>>

}