package br.com.designpatterns.presentation.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import br.com.designpatterns.R
import br.com.designpatterns.databinding.ActivityMainBinding
import br.com.designpatterns.presentation.utils.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    override val viewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupUi()
    }

    private fun setupUi(){
        binding.button.setOnClickListener { viewModel.onBuilderClicked() }
    }
}
