package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.di

import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.data.datasource.HoroscopeLocalDataSource
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.data.repository.HoroscopeRepositoryImpl
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.repository.HoroscopeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideRepository(
        localDataSource: HoroscopeLocalDataSource
    ): HoroscopeRepository = HoroscopeRepositoryImpl(localDataSource)

    @Provides
    fun provideLocalDataSource(): HoroscopeLocalDataSource =
        HoroscopeLocalDataSource()
}
