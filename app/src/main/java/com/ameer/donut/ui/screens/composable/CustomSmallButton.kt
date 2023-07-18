package com.ameer.donut.ui.screens.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ameer.donut.ui.theme.DonutTheme
import com.ameer.donut.ui.theme.spacing

@Composable
fun CustomSmallButton(
    imageVector: ImageVector? = null,
    text: String? = null,
    modifier: Modifier = Modifier,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    background: Color = MaterialTheme.colorScheme.primary,
    shape: Shape = RoundedCornerShape(30),
    elevation: Int = 0,
    sizeIcon: Int = 24,
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .size(MaterialTheme.spacing.sizeSmallButton)
            .height(MaterialTheme.spacing.sizeHeightPrimaryButton)
            .padding(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = background, contentColor = contentColor
        ),
        shape = shape,
        contentPadding = PaddingValues(0.dp),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = elevation.dp
        )
    ) {
        if (!text.isNullOrBlank()) {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium,
            )
        }

        if (imageVector != null)
            Icon(
                imageVector = imageVector,
                contentDescription = null,
                modifier = Modifier
                    .size(sizeIcon.dp)
                    .padding(0.dp)

            )

    }
}

@Preview
@Composable
private fun CustomButtonPreview() {
    DonutTheme {
        CustomSmallButton(Icons.Default.Search)
        {}
    }
}