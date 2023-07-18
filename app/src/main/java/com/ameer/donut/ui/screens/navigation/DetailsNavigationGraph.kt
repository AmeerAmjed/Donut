package com.ameer.donut.ui.screens.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigation
import com.ameer.donut.ui.screens.details.detailsRoute
import com.ameer.donut.ui.screens.welcome.welcomeRoute


fun NavGraphBuilder.detailsNavigationGraph(navController: NavHostController) {
    navigation(
        startDestination = DetailsRoute.Welcome,
        route = Graph.DETAILS,
    ) {
        detailsRoute(navController)
        welcomeRoute(navController)
    }
}

object DetailsRoute {
    const val details = "details"
    const val Welcome = "Welcome"
}
