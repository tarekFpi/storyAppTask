package com.example.mydevesstream.repository

// StoryRepository.kt
import android.content.Context
import com.example.mydevesstream.model.storyResponse.Story
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class StoryRepository @Inject constructor(private val context: Context) {

    /// uid is optional
    suspend fun getStory(): Story = withContext(Dispatchers.IO) {
        val jsonString = context.assets.open("sample_story1.json")
            .bufferedReader()
            .use { it.readText() }

        // Parse JSON
        val gson = Gson()
        gson.fromJson(jsonString, Story::class.java)
    }
}
