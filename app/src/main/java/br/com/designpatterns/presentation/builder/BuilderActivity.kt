package br.com.designpatterns.presentation.builder

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import br.com.designpatterns.R
import br.com.designpatterns.databinding.ActivityBuilderBinding
import br.com.designpatterns.presentation.utils.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

class BuilderActivity : BaseActivity() {

    override val viewModel: BuilderViewModel by viewModel()
    private lateinit var binding: ActivityBuilderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_builder)
        setupUi()
    }

    private fun setupUi() {

    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, BuilderActivity::class.java)
        }
    }
}