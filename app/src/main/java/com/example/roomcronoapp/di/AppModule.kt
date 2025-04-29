package com.example.roomcronoapp.di

import android.content.Context
import androidx.room.Room
import com.example.roomcronoapp.room.CronosDataBase
import com.example.roomcronoapp.room.CronosDataBaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun providesCronosDao(cronosDataBase: CronosDataBase): CronosDataBaseDao {
        return cronosDataBase.cronosDao()
    }

    @Singleton
    @Provides
    fun providesCronosDatabase(@ApplicationContext context: Context): CronosDataBase {
        return Room.databaseBuilder(
            context,
            CronosDataBase::class.java, "Cronos_db"
        ).fallbackToDestructiveMigration()
            .build()
    }

}