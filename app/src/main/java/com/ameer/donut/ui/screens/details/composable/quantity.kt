package com.ameer.donut.ui.screens.details.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.ameer.donut.R
import com.ameer.donut.ui.screens.composable.CustomSmallButton
import com.ameer.donut.ui.screens.composable.SpacerHorizontal20
import com.ameer.donut.ui.screens.composable.SpacerVertical19
import com.ameer.donut.ui.screens.composable.SpacerVertical25
import com.ameer.donut.ui.screens.details.DetailsUiState

@Composable
fun Quantity(state: DetailsUiState) {
    Column {
        Text(
            text = stringResource(id = R.string.quantity),
            style = MaterialTheme.typography.bodyLarge,
        )
        SpacerVertical19()
        Row {
            CustomSmallButton(
                text = "-",
                background = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onSurface,
                elevation = 4
            ) {}
            SpacerHorizontal20()
            CustomSmallButton(
                text = state.quantity.toString(),
                background = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.onSurface,
                elevation = 4
            ) {}
            SpacerHorizontal20()
            CustomSmallButton(
                text = "+",
                background = MaterialTheme.colorScheme.onSurface,
                elevation = 4
            ) {}
        }
    }
}