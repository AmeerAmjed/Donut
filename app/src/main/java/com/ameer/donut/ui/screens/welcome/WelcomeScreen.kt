package com.ameer.donut.ui.screens.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.ameer.donut.R
import com.ameer.donut.ui.screens.composable.CustomButton
import com.ameer.donut.ui.screens.composable.CustomImage
import com.ameer.donut.ui.screens.composable.SpacerVertical19
import com.ameer.donut.ui.screens.composable.SpacerVertical60
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.spacing

@Composable
fun WelcomeScreen(navController: NavController) {
    WelcomeContent()
}

@Composable
private fun WelcomeContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        CustomImage(
            modifier = Modifier.background(Color.Blue)

        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = MaterialTheme.spacing.space40,
                    end = MaterialTheme.spacing.space40,
                    bottom = MaterialTheme.spacing.space40
                ),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = stringResource(id = R.string.title_welcome),
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.primary
            )
            SpacerVertical19()
            Text(
                text = stringResource(id = R.string.description_welcome),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.primary
            )
            SpacerVertical60()
            CustomButton(
                labelIdStringRes = R.string.get_started,
                background = MaterialTheme.colorScheme.secondary,
                colorLabel = MaterialTheme.colorScheme.onSecondary
            ) {

            }
        }

    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    DonutTheme {
        WelcomeContent()
    }
}