package com.example.android.gdgfinder.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _navigateToSearch = MutableLiveData(false)
    val navigateToSearch: LiveData<Boolean>
        get() = _navigateToSearch

    fun onFabClicked() {
        viewModelScope.launch {
            _navigateToSearch.value = true
        }
    }

    fun onNavigatedToSearch() {
        _navigateToSearch.value = false
    }

}