package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.repository

import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.Horoscope
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.ZodiacSign

interface HoroscopeRepository {
    fun getZodiacSigns(): List<ZodiacSign>
    fun getHoroscopeForSign(signId: Int): Horoscope
}
