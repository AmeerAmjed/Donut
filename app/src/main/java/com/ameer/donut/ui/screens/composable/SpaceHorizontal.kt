package com.ameer.donut.ui.screens.composable

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ameer.donut.ui.theme.spacing


@Composable
fun SpacerHorizontal5() {
    Spacer(modifier = Modifier.width(MaterialTheme.spacing.space5))
}

@Composable
fun SpacerHorizontal20() {
    Spacer(modifier = Modifier.width(MaterialTheme.spacing.space20))
}

@Composable
fun SpacerHorizontal26() {
    Spacer(modifier = Modifier.width(MaterialTheme.spacing.space26))
}