package com.ameer.donut.ui.screens.home

//import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.ameer.donut.ui.screens.composable.SpacerVertical54
import com.ameer.donut.ui.screens.home.composable.AppBar
import com.ameer.donut.ui.screens.home.composable.Donuts
import com.ameer.donut.ui.screens.home.composable.Offers
import com.ameer.donut.ui.theme.spacing

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = HomeViewModel()
) {
    val state by viewModel.state.collectAsState()
    HomeContent(
        state,
        homeEvent = viewModel,
    )
}

@Composable
private fun HomeContent(
    state: HomeUiState,
    homeEvent: HomeEvent,
) {
    Column(

    ) {
        AppBar(
            modifier = Modifier.padding(
                start = MaterialTheme.spacing.space40,
                end = MaterialTheme.spacing.space40,
                top = MaterialTheme.spacing.space40,
            ),
            onCLickSearch = homeEvent::onCLickSearch
        )
        SpacerVertical54()
        Offers(state.offers)
        Donuts(state.donuts)
    }

}

@Preview
@Composable
private fun HomeScreenPreview() {
//    HomeContent({})
}
