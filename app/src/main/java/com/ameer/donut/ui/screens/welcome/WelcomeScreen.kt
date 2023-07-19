package com.ameer.donut.ui.screens.welcome

import android.app.Activity
import android.view.Window
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import com.ameer.donut.R
import com.ameer.donut.ui.screens.composable.CustomButton
import com.ameer.donut.ui.screens.composable.CustomImage
import com.ameer.donut.ui.screens.composable.SpacerVertical19
import com.ameer.donut.ui.screens.composable.SpacerVertical60
import com.ameer.donut.ui.screens.main.navigateToMain
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.spacing
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun WelcomeScreen(navController: NavController) {
    val systemUiController = rememberSystemUiController()
    val view = LocalView.current
    val window = (view.context as Activity).window


    WelcomeContent(
        systemUiController = systemUiController,
        window = window,
        onClickGetStart = navController::navigateToMain
    )
}

@Composable
private fun WelcomeContent(
    systemUiController: SystemUiController,
    window: Window,
    onClickGetStart: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary)
    ) {
        CustomImage(
            modifier = Modifier.background(Color.Blue)

        )

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter),
            painter = painterResource(id = R.drawable.background_welcome),
            contentScale = ContentScale.FillWidth,
            contentDescription = ""
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = MaterialTheme.spacing.space40,
                    end = MaterialTheme.spacing.space40,
                    bottom = MaterialTheme.spacing.space40
                ), horizontalAlignment = Alignment.Start,
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
                background = MaterialTheme.colorScheme.surface,
                colorLabel = MaterialTheme.colorScheme.onSurface
            ) {

            }
        }

    }

    WindowCompat.setDecorFitsSystemWindows(window, false)
    systemUiController.setStatusBarColor(color = Color.Transparent)
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    DonutTheme {
//        WelcomeContent(rememberSystemUiController(),)
    }
}