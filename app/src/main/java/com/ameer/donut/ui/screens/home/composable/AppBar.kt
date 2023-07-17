package com.ameer.donut.ui.screens.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.donut.R
import com.ameer.donut.ui.screens.composable.CustomSmallButton
import com.ameer.donut.ui.theme.DonutTheme

@Composable
fun AppBar(
    onCLickSearch: () -> Unit,
) {

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {

            Text(
                text = stringResource(id = R.string.lets_gonuts),
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary,
            )
            Text(
                text = stringResource(id = R.string.order_your_favourite_donuts),
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onBackground.copy(.6F),
            )


        }
        Spacer(modifier = Modifier.weight(1F))
        CustomSmallButton(
            Icons.Default.Search,
            contentColor = MaterialTheme.colorScheme.onSecondary,
            background = MaterialTheme.colorScheme.secondary,
            onClick = onCLickSearch,
        )
    }

}

@Preview
@Composable
private fun AppBarPreview() {
    DonutTheme {
        AppBar() {}
    }
}