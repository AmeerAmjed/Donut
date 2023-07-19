package com.ameer.donut.ui.screens.main

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

private const val ROUTE = "Main"

fun NavController.navigateToMain() {
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