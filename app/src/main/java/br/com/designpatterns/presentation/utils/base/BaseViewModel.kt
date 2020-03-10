package br.com.designpatterns.presentation.utils.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {

    val goTo: LiveData<NavData> get() = _goTo
    private val _goTo by lazy { MutableLiveData<NavData>() }

    fun goTo(navData: NavData) {
        _goTo.postValue(navData)
    }
}