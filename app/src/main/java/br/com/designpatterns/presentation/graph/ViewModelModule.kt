package br.com.designpatterns.presentation.graph

import br.com.designpatterns.presentation.builder.BuilderViewModel
import br.com.designpatterns.presentation.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { MainViewModel() }
    viewModel { BuilderViewModel() }
}