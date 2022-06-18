package com.mindorks.framework.mvvm.data.api

import com.mindorks.framework.mvvm.data.model.UserJson
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {

    override suspend fun getUsers(): Response<List<UserJson.Result>> = apiService.getUsers()

}