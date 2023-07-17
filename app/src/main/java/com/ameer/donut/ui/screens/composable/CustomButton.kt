package com.ameer.donut.ui.screens.composable

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ameer.donut.R
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.spacing

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    @StringRes labelIdStringRes: Int,
    colorLabel: Color = MaterialTheme.colorScheme.onPrimary,
    background: Color = MaterialTheme.colorScheme.primary,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(MaterialTheme.spacing.sizeHeightPrimaryButton),
        colors = ButtonDefaults.buttonColors(
            containerColor = background,
            contentColor = colorLabel
        )
    ) {
        Text(
            text = stringResource(id = labelIdStringRes),
            style = MaterialTheme.typography.bodyMedium,
            color = colorLabel
        )

    }
}

@Preview
@Composable
private fun CustomButtonPreview() {
    DonutTheme {
        CustomButton(labelIdStringRes = R.string.get_started)
        {}
    }
}