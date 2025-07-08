package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.usecase

import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.ZodiacSign
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.repository.HoroscopeRepository
import jakarta.inject.Inject

class GetZodiacListUseCase @Inject constructor(
    private val repository: HoroscopeRepository
) {
    operator fun invoke(): List<ZodiacSign> = repository.getZodiacSigns()
}
