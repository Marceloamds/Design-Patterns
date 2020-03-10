package br.com.designpatterns

import android.app.Application
import br.com.designpatterns.presentation.graph.viewModelModule
import org.koin.core.context.startKoin

class DesignPatternApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(viewModelModule))
        }
    }
}