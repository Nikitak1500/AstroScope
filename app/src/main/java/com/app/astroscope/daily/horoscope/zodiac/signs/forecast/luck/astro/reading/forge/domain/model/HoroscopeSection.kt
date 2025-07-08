package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model

data class HoroscopeSection(
    val type: SectionType,
    val shortText: String,
    val fullText: String
)

enum class SectionType {
    LOVE, WORK, FINANCE, ENERGY
}
