package com.mindorks.framework.mvvm.data.api

import com.mindorks.framework.mvvm.data.model.UserJson
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers(): Response<List<UserJson.Result>>
}