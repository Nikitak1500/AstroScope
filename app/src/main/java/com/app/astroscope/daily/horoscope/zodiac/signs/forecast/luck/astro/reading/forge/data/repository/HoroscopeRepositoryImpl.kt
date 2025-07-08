package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.data.repository

import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.data.datasource.HoroscopeLocalDataSource
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.repository.HoroscopeRepository
import jakarta.inject.Inject

class HoroscopeRepositoryImpl @Inject constructor(
    private val localDataSource: HoroscopeLocalDataSource
) : HoroscopeRepository {

    override fun getZodiacSigns() = localDataSource.getZodiacSigns()

    override fun getHoroscopeForSign(signId: Int) =
        localDataSource.getHoroscope(signId)
}
