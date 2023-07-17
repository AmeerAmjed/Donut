package com.ameer.donut.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.donut.ui.screens.home.composable.AppBar
import com.ameer.donut.ui.theme.spacing

@Composable
fun HomeScreen() {
    HomeContent() {}
}

@Composable
private fun HomeContent(
    onCLickSearch: () -> Unit,

    ) {
    Column(
        Modifier.padding(MaterialTheme.spacing.space40)
    ) {
        AppBar(
            onCLickSearch = onCLickSearch
        )
    }

}

@Preview
@Composable
private fun HomeScreenPreview() {
    HomeContent({})
}
