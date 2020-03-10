package br.com.designpatterns.presentation.builder

import android.content.Context
import android.content.Intent
import br.com.designpatterns.presentation.utils.base.NavData

class BuilderNavData : NavData {
    override fun navigate(context: Context): Intent {
        return BuilderActivity.createIntent(context)
    }
}