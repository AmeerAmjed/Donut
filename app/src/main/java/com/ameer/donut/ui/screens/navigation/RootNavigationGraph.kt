package com.ameer.donut.ui.screens.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ameer.donut.ui.screens.main.mainRoute


@Composable
fun RootNavigationGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Graph.DETAILS,
        route = Graph.ROOT
    ) {
        mainRoute(navController)
        detailsNavigationGraph(navController)
    }
}

object Graph {
    const val ROOT = "root"
    const val MAIN = "main"
    const val DETAILS = "details_graph"
}