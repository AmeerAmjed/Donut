package com.ameer.donut.ui.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.ameer.donut.R
import com.ameer.donut.ui.screens.composable.CustomSmallButton
import com.ameer.donut.ui.screens.composable.SpacerHorizontal5
import com.ameer.donut.ui.screens.composable.SpacerVertical5
import com.ameer.donut.ui.screens.composable.SpacerVertical9
import com.ameer.donut.ui.screens.home.OfferUiState
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.spacing

@Composable
fun ItemOffer(state: OfferUiState) {

    Box {
        ConstraintLayout(
            modifier = Modifier
                .height(325.dp)
                .width(193.dp),
        ) {
            val (image) = createRefs()

            Card(
                modifier = Modifier.fillMaxHeight(),

                colors = CardDefaults.cardColors(
                    containerColor = state.background
                )
            ) {

                CustomSmallButton(
                    Icons.Default.FavoriteBorder,
                    background = MaterialTheme.colorScheme.surface,
                    contentColor = MaterialTheme.colorScheme.primary,
                    shape = CircleShape,
                    modifier = Modifier.padding(
                        MaterialTheme.spacing.space15
                    ),
                ) {}
                Spacer(modifier = Modifier.weight(1F))

                Text(
                    text = state.name,
                    style = MaterialTheme.typography.labelLarge,
                    modifier = Modifier.padding(
                        horizontal = MaterialTheme.spacing.space20
                    ),
                )
                SpacerVertical9()
                Text(
                    text = state.descriptor,
                    style = MaterialTheme.typography.labelSmall.copy(
                        color = MaterialTheme.typography.labelSmall.color.copy(.6F)
                    ),
                    modifier = Modifier.padding(
                        horizontal = MaterialTheme.spacing.space20
                    ),
                )
                SpacerVertical5()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            MaterialTheme.spacing.space15
                        ),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = state.discount,
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            textDecoration = TextDecoration.LineThrough,
                            color = MaterialTheme.typography.labelMedium.color.copy(.6F)
                        ),
                    )
                    SpacerHorizontal5()
                    Text(
                        text = state.price,
                        style = MaterialTheme.typography.titleLarge,
                    )

                }
            }

            Image(
                modifier = Modifier
                    .size(
                        150.dp
                    )
                    .offset(100.dp, y = 30.dp),
                painter = painterResource(id = state.imageDrawableRes),
                contentDescription = state.name,
            )

        }
    }

}


@Preview
@Composable
private fun ItemOfferPreview() {
    DonutTheme {
        ItemOffer(
            OfferUiState(
                name = "Strawberry Wheel",
                descriptor = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                background = Color(0xFFD7E4F6),
                imageDrawableRes = R.drawable.img_donut_strawberry_wheel,
                price = "$16",
                discount = "$20",
                isFavorite = false
            )
        )
    }
}