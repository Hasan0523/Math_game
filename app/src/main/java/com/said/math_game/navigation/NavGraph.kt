package com.said.math_game.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.said.math_game.ui.HomeScreen
import com.said.math_game.ui.SplashScreen

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Splash.route)
    {
        composable(route = Screens.Splash.route){
            SplashScreen()
        }
        composable(route = Screens.Home.route) {
            HomeScreen()
        }
    }
}