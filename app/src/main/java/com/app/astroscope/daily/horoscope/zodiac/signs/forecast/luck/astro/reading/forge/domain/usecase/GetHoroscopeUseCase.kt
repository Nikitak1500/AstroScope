package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.usecase

import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.Horoscope
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.repository.HoroscopeRepository
import jakarta.inject.Inject

class GetHoroscopeUseCase @Inject constructor(
    private val repository: HoroscopeRepository
) {
    operator fun invoke(signId: Int): Horoscope = repository.getHoroscopeForSign(signId)
}
