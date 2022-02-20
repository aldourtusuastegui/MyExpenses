package com.acsoft.myexpenses.application.injection

import com.acsoft.myexpenses.repository.ExpenseRepository
import com.acsoft.myexpenses.repository.ExpenseRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class ActivityRetainedModule {

    @ExperimentalCoroutinesApi
    @Binds
    abstract fun dataSource(impl : ExpenseRepositoryImpl) : ExpenseRepository

}