package com.example.modeloviewviewmodel.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.modeloviewviewmodel.model.CounterModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel(){
    private val _counter = MutableStateFlow(CounterModel())

    val counter : StateFlow<CounterModel> = _counter.asStateFlow()
}