package com.saddam.challengebinar7.di

import com.saddam.challengebinar7.ui.home.HomeViewModel
import com.saddam.challengebinar7.ui.login.LoginViewModel
import com.saddam.challengebinar7.ui.profile.ProfileViewModel
import com.saddam.challengebinar7.ui.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { LoginViewModel(get(), get()) }
    viewModel { RegisterViewModel(get()) }
    viewModel { HomeViewModel(get(), get()) }
    viewModel { ProfileViewModel(get(), get()) }
}