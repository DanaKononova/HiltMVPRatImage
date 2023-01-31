package com.example.hiltmvphelloworld.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hiltmvphelloworld.domain.Repository
import com.example.hiltmvphelloworld.domain.models.Info
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ImageViewModel @Inject constructor(
    private val repository: Repository
): ViewModel() {

    private val _liveData = MutableLiveData<Info>()
    val liveData: LiveData<Info> get() = _liveData

    fun getInfo() {
        val info = repository.getData()
        _liveData.value = info
    }
}