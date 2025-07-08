package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.SectionType
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.detail.HoroscopeDetailViewModel

@Composable
fun SectionDetailScreen(
    signId: String,
    sectionType: SectionType,
    viewModel: HoroscopeDetailViewModel = hiltViewModel()
) {
    val section = viewModel.horoscope
        ?.sections
        ?.firstOrNull { it.type == sectionType }

    section?.let {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = sectionType.name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = it.fullText)
        }
    }
}
