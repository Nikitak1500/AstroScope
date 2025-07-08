package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.ZodiacSign

@Composable
fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
    onZodiacSelected: (String) -> Unit
) {
    val zodiacList = viewModel.zodiacList

    LazyColumn {
        items(zodiacList) { sign: ZodiacSign  ->
            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .clickable { onZodiacSelected(sign.id.toString()) }
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(text = sign.name, fontSize = 18.sp)
                }
            }
        }
    }
}
