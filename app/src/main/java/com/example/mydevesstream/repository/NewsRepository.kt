package com.example.mydevesstream.repository

import NewsResponse
import android.content.Context
import com.google.gson.Gson
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class NewsRepository @Inject constructor(
    @ApplicationContext private val context: Context
) {
    fun getNewsFromAssets(): NewsResponse {
        val jsonString = context.assets.open("sample_list.json").bufferedReader().use { it.readText() }
        val gson = Gson()
        return gson.fromJson(jsonString, NewsResponse::class.java)
    }
}
