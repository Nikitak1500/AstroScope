package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.navigation.AppNavGraph
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.theme.AstroScopeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AstroScopeTheme {
                val navController = rememberNavController()
                AppNavGraph(navController = navController)
            }
        }
    }
}