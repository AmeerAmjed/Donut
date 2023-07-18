package com.ameer.donut.ui.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ameer.donut.ui.screens.composable.SpacerHorizontal5
import com.ameer.donut.ui.screens.home.DonutUiState
import com.ameer.donut.ui.theme.spacing

@Composable
fun ItemDonut(
    state: DonutUiState
) {

    Box(
        Modifier
            .height(180.dp),
    ) {

        Card(
            Modifier
                .align(Alignment.BottomCenter)
                .width(138.dp)
                .height(111.dp)
                .shadow(
                    elevation = 390.dp,
                    spotColor = Color(0x1A000000),
                    ambientColor = Color(0x1A000000)
                ),
            shape = RoundedCornerShape(20.dp, 20.dp, 10.dp, 10.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.background
            ),

            ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = MaterialTheme.spacing.space9,
                        vertical = MaterialTheme.spacing.space20
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom,
            ) {
                Text(
                    text = state.name,
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.typography.labelMedium.color.copy(.6F),
                    ),
                )
                SpacerHorizontal5()
                Text(
                    text = state.price,
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.primary,
                    ),

                    )
            }
        }
        Image(
            modifier = Modifier
                .size(130.dp)
                .align(Alignment.TopCenter),
            painter = painterResource(id = state.imageDrawableRes),
            contentDescription = state.name,
        )


    }
}