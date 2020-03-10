package br.com.designpatterns.presentation.utils.base

import android.content.Context
import android.content.Intent

interface NavData {

    fun navigate(context: Context): Intent
}