package br.com.designpatterns.presentation.main

import br.com.designpatterns.presentation.builder.BuilderNavData
import br.com.designpatterns.presentation.utils.base.BaseViewModel

class MainViewModel : BaseViewModel() {

    fun onBuilderClicked() {
        goTo(BuilderNavData())
    }
}