package com.ameer.donut.ui.screens.main


import com.ameer.donut.R
import com.ameer.donut.ui.screens.composable.buttom_navigation_bar.BottomNavItem
import com.ameer.tickets_mobile.ui.navigation.MainRoute

data class MainUiState(
    var itemsBottomBar: List<BottomNavItem> = listOf(
        BottomNavItem(
            route = MainRoute.Home,
            idIconRes = R.drawable.ic_home,
        ),
        BottomNavItem(
            route = MainRoute.Favorite,
            idIconRes = R.drawable.ic_favorite,
        ),
        BottomNavItem(
            route = MainRoute.Notification,
            idIconRes = R.drawable.ic_notification,
            badge = 5,
        ),
        BottomNavItem(
            route = MainRoute.Buy,
            idIconRes = R.drawable.ic_buy,
            badge = 5,
        ),
        BottomNavItem(
            route = MainRoute.Profile,
            idIconRes = R.drawable.ic_profile,
        ),
    )
)
