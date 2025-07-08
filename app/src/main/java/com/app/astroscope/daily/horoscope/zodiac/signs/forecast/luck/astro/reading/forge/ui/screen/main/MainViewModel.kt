package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.ZodiacSign
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.usecase.GetZodiacListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getZodiacListUseCase: GetZodiacListUseCase
) : ViewModel() {
    var zodiacList by mutableStateOf(emptyList<ZodiacSign>())
        private set

    init {
        zodiacList = getZodiacListUseCase()
    }
}
