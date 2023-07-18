package com.ameer.donut.ui.screens.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.donut.R
import com.ameer.donut.ui.screens.home.DonutUiState
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.spacing


@Composable
fun Donuts(
    state: List<DonutUiState>
) {
    Column {
        Text(

            modifier = Modifier.padding(
                horizontal = MaterialTheme.spacing.space40
            ), text = stringResource(id = R.string.donuts)
        )
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = MaterialTheme.spacing.space40,
                vertical = MaterialTheme.spacing.space15,
            ),
            horizontalArrangement = Arrangement.spacedBy(
                MaterialTheme.spacing.space22
            ),
        ) {

            items(
                count = state.size
            ) { index ->

                ItemDonut(
                    state = state[index]
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DonutsPreview() {
    DonutTheme {
        Donuts(
            state = listOf(
                DonutUiState(
                    name = "Chocolate Cherry",
                    price = "\$22",
                    imageDrawableRes = R.drawable.img_dount_chocolate_cherry,
                ), DonutUiState(
                    name = "Strawberry Rain",
                    price = "\$22",
                    imageDrawableRes = R.drawable.img_dount_strawberry_rain,
                ), DonutUiState(
                    name = "Strawberry",
                    price = "\$22",
                    imageDrawableRes = R.drawable.img_dount_strawberry,
                )
            )
        )
    }
}
