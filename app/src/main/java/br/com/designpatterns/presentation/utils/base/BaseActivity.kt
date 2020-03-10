package br.com.designpatterns.presentation.utils.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer

abstract class BaseActivity : AppCompatActivity() {

    abstract val viewModel: BaseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subscribeUi()
    }

    open fun subscribeUi() {
        viewModel.goTo.observe(this, Observer(::onGoTo))
    }

    private fun onGoTo(navData: NavData?) {
        navData?.let {
            startActivity(it.navigate(this))
        }
    }
}