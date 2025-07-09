package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.Horoscope
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.usecase.GetHoroscopeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(
    private val getHoroscopeUseCase: GetHoroscopeUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val signId = checkNotNull(savedStateHandle.get<String>("signId"))
    var horoscope by mutableStateOf<Horoscope?>(null)
        private set

    init {
        horoscope = getHoroscopeUseCase(signId.toInt())
    }
}
