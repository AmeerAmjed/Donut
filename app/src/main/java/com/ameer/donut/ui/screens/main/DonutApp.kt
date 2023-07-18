package com.ameer.donut.ui.screens.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.screens.navigation.RootNavigationGraph


@Composable
fun DonutApp() {
    DonutTheme {
        val navController = rememberNavController()

        RootNavigationGraph(navController)
    }
}

