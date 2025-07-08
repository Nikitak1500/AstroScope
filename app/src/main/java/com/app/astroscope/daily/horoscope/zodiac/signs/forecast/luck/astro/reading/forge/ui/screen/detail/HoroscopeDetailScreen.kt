package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.SectionType

@Composable
fun HoroscopeDetailScreen(
    viewModel: HoroscopeDetailViewModel = hiltViewModel(),
    onSectionClick: (SectionType) -> Unit
) {
    val horoscope = viewModel.horoscope ?: return

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = horoscope.sign.name, fontSize = 24.sp)
        Text(text = horoscope.sign.period, fontSize = 16.sp)

        Spacer(modifier = Modifier.height(16.dp))

        horoscope.sections.forEach { section ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable { onSectionClick(section.type) }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = section.type.name, fontWeight = FontWeight.Bold)
                    Text(text = section.shortText)
                }
            }
        }
    }
}
