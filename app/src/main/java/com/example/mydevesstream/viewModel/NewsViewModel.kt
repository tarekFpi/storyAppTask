package com.example.mydevesstream.viewModel

import NewsResponse
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mydevesstream.repository.NewsRepository
import com.example.mydevesstream.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {

    private val _news = MutableLiveData<Resource<NewsResponse>>()
    val news: LiveData<Resource<NewsResponse>> get() = _news


    init {
        loadNews()
    }

    fun loadNews() {
        viewModelScope.launch {
            _news.postValue(Resource.Loading())   // loading state emit

            try {
                val response = repository.getNewsFromAssets()
                _news.postValue(Resource.Success(response)) // success state emit
            } catch (e: Exception) {
                _news.postValue(Resource.Error("Failed to load news: ${e.message}")) // error state emit
            }
        }
    }
}
