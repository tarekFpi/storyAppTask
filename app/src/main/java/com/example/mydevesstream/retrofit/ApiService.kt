package com.example.mydevesstream.retrofit


import NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("/news-list")
    suspend fun getItems(
        @Query("page") page: Int
    ) : NewsResponse

    @GET("/GET/story/<id>")
    suspend fun postData(@Query("id") id:String,
    ): Response<NewsResponse>
}