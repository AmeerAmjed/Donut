package com.ameer.donut.ui.screens.main

import android.util.Log
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ameer.donut.ui.screens.navigation.Graph

private const val ROUTE = Graph.MAIN

fun NavController.navigateToMain() {
    Log.v("ameerxcvx","dasdasdasd")
    navigate(ROUTE)
}

@OptIn(ExperimentalMaterialApi::class)
fun NavGraphBuilder.mainRoute(navController: NavController) {

    composable(ROUTE) {
        MainScreen(
            navController = rememberNavController(),
            rootNavController = navController
        )
    }
}