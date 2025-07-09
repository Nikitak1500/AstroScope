package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.SectionType
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.theme.BackgroundColor
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.theme.PrimaryColor
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.theme.SecondaryColor
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.theme.SurfaceColor
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.theme.onPrimaryColor
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.theme.onSurfaceColor
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.viewmodel.HoroscopeDetailViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HoroscopeDetailScreen(
    viewModel: HoroscopeDetailViewModel = hiltViewModel(),
    onSectionClick: (SectionType) -> Unit,
    onBackClick: () -> Unit
) {
    val horoscope = viewModel.horoscope ?: return

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {  },
                    colors = TopAppBarColors(
                        containerColor = BackgroundColor,
                        scrolledContainerColor = BackgroundColor,
                        navigationIconContentColor = onPrimaryColor,
                        titleContentColor = BackgroundColor,
                        actionIconContentColor = onPrimaryColor
                    ),
                    navigationIcon = {
                        IconButton(onClick = onBackClick) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Back",
                                tint = onPrimaryColor
                            )
                        }
                    }
                )
            }
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxSize()
                    .background(BackgroundColor)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = horoscope.sign.imageId),
                        contentDescription = horoscope.sign.name,
                        modifier = Modifier
                            .size(128.dp)
                    )
                    Text(
                        text = horoscope.sign.name,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = SecondaryColor
                    )
                    Text(
                        text = horoscope.sign.period,
                        fontSize = 24.sp,
                        color = onPrimaryColor
                    )

                    Spacer(
                        modifier = Modifier.height(16.dp)
                    )

                    horoscope.sections.forEach { section ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clickable { onSectionClick(section.type) },
                            colors = CardDefaults.cardColors(SurfaceColor)
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(16.dp)
                            ) {
                                Text(
                                    text = section.type.name,
                                    fontWeight = FontWeight.Bold,
                                    color = SecondaryColor
                                )
                                Text(
                                    text = section.shortText,
                                    color = onSurfaceColor
                                )
                            }
                        }
                    }
                }
            }
        }
    }



}
