package com.ameer.donut.ui.screens.home.composable

import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameer.donut.R
import com.ameer.donut.ui.screens.home.OfferUiState
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.spacing

@Composable
fun Offers(
    state: List<OfferUiState>,
    onCLickOffer: () -> Unit,
) {
    Column {
        Text(

            modifier = Modifier.padding(
                horizontal = MaterialTheme.spacing.space40
            ), text = stringResource(id = R.string.today_offers)
        )
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = MaterialTheme.spacing.space54,
                vertical = MaterialTheme.spacing.space23,
            ),
            horizontalArrangement = spacedBy(70.dp),
        ) {

            items(
                count = state.size
            ) { index ->

                ItemOffer(
                    state = state[index],
                    onCLickOffer
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun OffersPreview() {
    DonutTheme {
        Offers(
            listOf(

                OfferUiState(
                    name = "Strawberry Wheel",
                    descriptor = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                    background = Color(0xFFD7E4F6),
                    imageDrawableRes = R.drawable.img_donut_strawberry_wheel,
                    price = "$16",
                    discount = "$20",
                    isFavorite = false
                ),
                OfferUiState(
                    name = "Chocolate Glaze",
                    descriptor = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                    background = Color(0xFFFFC7D0),
                    imageDrawableRes = R.drawable.img_donut_chocolate_glaze,
                    price = "$16",
                    discount = "$20",
                    isFavorite = false
                ),
            )
        ){}
    }

}