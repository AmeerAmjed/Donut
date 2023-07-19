package com.ameer.donut.ui.screens.composable.buttom_navigation_bar

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ComposableNavigationIcon(
    item: BottomNavItem,
    color: Color,
) {

    Icon(
        painter = painterResource(id = item.idIconRes),
        contentDescription = "",
        modifier = Modifier.size(28.dp),
        tint = color
    )

}