package com.example.demomvvm.ui.viewmodel


import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TestViewmodel @Inject constructor() : ViewModel() {

    private val _data = MutableStateFlow<String>(" vipl")
    val data: StateFlow<String> = _data


}