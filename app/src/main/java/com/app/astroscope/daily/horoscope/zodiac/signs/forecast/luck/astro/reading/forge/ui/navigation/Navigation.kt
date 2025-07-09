package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.ui.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
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

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AppNavGraph(navController: NavHostController) {
    AnimatedNavHost(navController, startDestination = Screen.Main.route) {
        composable(
            route = Screen.Main.route,

        ) {
            MainScreen { signId ->
                navController.navigate(Screen.Detail.createRoute(signId))
            }
        }


        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("signId") { type = NavType.StringType }),
            enterTransition = {
                expandIn(
                    expandFrom = Alignment.Center,
                    animationSpec = tween(400)
                )
            },
            popExitTransition = {
                shrinkOut(
                    shrinkTowards = Alignment.Center,
                    animationSpec = tween(400)
                )
            },
            exitTransition = {
                slideOutHorizontally(targetOffsetX = { -it }, animationSpec = tween(500))
            },
            popEnterTransition = {
                slideInHorizontally(initialOffsetX = { -it }, animationSpec = tween(500))
            },
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
            ),
            enterTransition = {
                slideInHorizontally(initialOffsetX = { it }, animationSpec = tween(500))
            },
            popExitTransition = {
                slideOutHorizontally(targetOffsetX = { it }, animationSpec = tween(500))
            }
        ) { backStackEntry ->
            val signId = backStackEntry.arguments?.getString("signId")!!
            val type = SectionType.valueOf(backStackEntry.arguments?.getString("sectionType")!!)
            SectionDetailScreen(signId, type) {
                navController.popBackStack()
            }
        }
    }
}
