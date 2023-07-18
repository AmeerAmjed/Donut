package com.ameer.donut.ui.screens.welcome

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ameer.donut.ui.screens.navigation.DetailsRoute


private const val ROUTE = DetailsRoute.Welcome


fun NavController.navigateToWelcomeScreen() {
    navigate(ROUTE)
}

fun NavGraphBuilder.welcomeRoute(navController: NavController) {
    composable(ROUTE) { WelcomeScreen(navController) }
}
