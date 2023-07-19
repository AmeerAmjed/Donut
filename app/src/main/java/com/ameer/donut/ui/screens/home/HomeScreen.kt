package com.ameer.donut.ui.screens.home

//import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.ameer.donut.ui.screens.composable.SpacerVertical54
import com.ameer.donut.ui.screens.details.navigateToDetailsScreen
import com.ameer.donut.ui.screens.home.composable.AppBar
import com.ameer.donut.ui.screens.home.composable.Donuts
import com.ameer.donut.ui.screens.home.composable.Offers
import com.ameer.donut.ui.theme.spacing
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = HomeViewModel()
) {
    val state by viewModel.state.collectAsState()
    val systemUiController = rememberSystemUiController()

    HomeContent(
        state,
        homeEvent = viewModel,
        systemUiController = systemUiController,
        navToDetails = navController::navigateToDetailsScreen
    )

}

@Composable
private fun HomeContent(
    state: HomeUiState,
    homeEvent: HomeEvent,
    systemUiController: SystemUiController,
    navToDetails: () -> Unit,
) {
    Column(Modifier.fillMaxSize()) {
        AppBar(
            modifier = Modifier.padding(
                start = MaterialTheme.spacing.space40,
                end = MaterialTheme.spacing.space40,
                top = MaterialTheme.spacing.space40,
            ),
            onCLickSearch = homeEvent::onCLickSearch
        )
        SpacerVertical54()
        Offers(state.offers, navToDetails)
        Donuts(state.donuts)
    }

    systemUiController.setStatusBarColor(color = MaterialTheme.colorScheme.background)

}

@Preview
@Composable
private fun HomeScreenPreview() {
//    HomeContent({})
}
