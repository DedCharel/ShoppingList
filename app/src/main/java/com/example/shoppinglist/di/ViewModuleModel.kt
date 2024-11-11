package com.example.shoppinglist.di

import androidx.lifecycle.ViewModel
import com.example.shoppinglist.presentation.MainViewModel
import com.example.shoppinglist.presentation.ShopItemViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModuleModel {

    @Binds
    @IntoMap
    @ViewModuleKey(MainViewModel::class)
    fun bindMainViewModule(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModuleKey(ShopItemViewModel::class)
    fun bindShopItemViewModule(viewModel: ShopItemViewModel): ViewModel
}