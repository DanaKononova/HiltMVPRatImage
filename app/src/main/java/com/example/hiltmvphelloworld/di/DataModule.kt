package com.example.hiltmvphelloworld.di

import com.example.hiltmvphelloworld.data.RepositoryImpl
import com.example.hiltmvphelloworld.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun getRepository(impl: RepositoryImpl): Repository
}