package com.example.mydevesstream.viewModel

// StoryViewModel.kt
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mydevesstream.model.storyResponse.Story
import com.example.mydevesstream.repository.StoryRepository
import com.example.mydevesstream.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StoryViewModel @Inject constructor(
    private val repository: StoryRepository
) : ViewModel() {


    private val _story = MutableLiveData<Resource<Story>>()
    val story: LiveData<Resource<Story>> get() = _story


    init {
        fetchStory()
    }


    fun fetchStory() {
        viewModelScope.launch {
            _story.postValue(Resource.Loading())   // loading state emit

            try {
                //uid is optional
                val response = repository.getStory()
                _story.postValue(Resource.Success(response)) // success state emit
            } catch (e: Exception) {
                _story.postValue(Resource.Error("Failed to load news: ${e.message}")) // error state emit
            }
        }
    }
}
