package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.SectionType
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.detail.HoroscopeDetailScreen
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.main.MainScreen
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.screen.section.SectionDetailScreen

sealed class Screen(val route: String) {
    object Main : Screen("main")
    object Detail : Screen("detail/{signId}") {
        fun createRoute(signId: String) = "detail/$signId"
    }
    object Section : Screen("section/{signId}/{sectionType}") {
        fun createRoute(signId: String, type: SectionType) =
            "section/$signId/${type.name}"
    }
}

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = Screen.Main.route) {
        composable(Screen.Main.route) {
            MainScreen { signId ->
                navController.navigate(Screen.Detail.createRoute(signId))
            }
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("signId") { type = NavType.StringType })
        ) {
            HoroscopeDetailScreen(
                onSectionClick = { sectionType ->
                    val signId = it.arguments?.getString("signId")!!
                    navController.navigate(Screen.Section.createRoute(signId, sectionType))
                },
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
        composable(
            route = Screen.Section.route,
            arguments = listOf(
                navArgument("signId") { type = NavType.StringType },
                navArgument("sectionType") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val signId = backStackEntry.arguments?.getString("signId")!!
            val type = SectionType.valueOf(backStackEntry.arguments?.getString("sectionType")!!)
            SectionDetailScreen(signId, type) {
                navController.popBackStack()
            }
        }
    }
}
