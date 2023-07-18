package com.ameer.donut.ui.screens.details

import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.ameer.donut.R
import com.ameer.donut.ui.screens.composable.CustomButton
import com.ameer.donut.ui.screens.composable.CustomSmallButton
import com.ameer.donut.ui.screens.composable.SpacerHorizontal26
import com.ameer.donut.ui.screens.composable.SpacerVertical16
import com.ameer.donut.ui.screens.composable.SpacerVertical25
import com.ameer.donut.ui.screens.composable.SpacerVertical33
import com.ameer.donut.ui.screens.composable.SpacerVertical54
import com.ameer.donut.ui.screens.details.composable.Quantity
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.lightSecondary
import com.ameer.donut.ui.theme.spacing
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun DetailsScreen() {
    val state: DetailsViewModel = DetailsViewModel()
    val systemUiController = rememberSystemUiController()
    val view = LocalView.current
    DetailsContent(
        state = state.state.collectAsState().value,
        systemUiController = systemUiController,
        view = view,
    )
}

@Composable
fun DetailsContent(
    state: DetailsUiState,
    systemUiController: SystemUiController,
    view: View,
) {

    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ) {


        ConstraintLayout(modifier = Modifier.fillMaxSize()) {
            val (card, image, favorite, back) = createRefs()

            CustomSmallButton(
                imageVector = Icons.Default.KeyboardArrowLeft,
                background = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.primary,
                sizeIcon = 30,
                modifier = Modifier
                    .padding(MaterialTheme.spacing.space16)
                    .constrainAs(back) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                    },
            ) {}

            Image(
                painter = painterResource(id = state.imageDrawableRes),
                modifier = Modifier
                    .size(300.dp)
                    .fillMaxWidth()
                    .constrainAs(image) {
                        start.linkTo(parent.start)
                        bottom.linkTo(card.top)
                        end.linkTo(parent.end)
                    },
                contentDescription = "",
            )

            Card(
                modifier = Modifier.constrainAs(card) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                shape = RoundedCornerShape(50.dp, 50.dp, 0.dp, 0.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.background
                ),
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = MaterialTheme.spacing.space40,
                            vertical = MaterialTheme.spacing.space33
                        ),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = state.name,
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    SpacerVertical33()
                    Text(
                        text = stringResource(id = R.string.about_gonut),
                        style = MaterialTheme.typography.bodyLarge,
                    )
                    SpacerVertical16()
                    Text(
                        text = state.descriptor,
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.typography.labelMedium.color.copy(.6F)
                    )
                    SpacerVertical25()
                    Quantity(state)
                    SpacerVertical54()
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = state.price, style = MaterialTheme.typography.headlineMedium
                        )
                        SpacerHorizontal26()
                        CustomButton(labelIdStringRes = R.string.add_to_cart) {

                        }
                    }


                }

            }

            CustomSmallButton(
                Icons.Default.FavoriteBorder,
                background = MaterialTheme.colorScheme.background,
                contentColor = MaterialTheme.colorScheme.primary,
                elevation = 10,
                modifier = Modifier
                    .padding(MaterialTheme.spacing.space33)
                    .constrainAs(favorite) {
                        top.linkTo(card.top)
                        bottom.linkTo(card.top)
                        end.linkTo(parent.end)
                    },
            ) {}

        }

    }


    if (!view.isInEditMode) {
        SideEffect {
            systemUiController.setStatusBarColor(color = lightSecondary)
        }
    }

}


@Preview
@Composable
private fun DetailsPreview() {
    DonutTheme {
        DetailsScreen()
    }
}
