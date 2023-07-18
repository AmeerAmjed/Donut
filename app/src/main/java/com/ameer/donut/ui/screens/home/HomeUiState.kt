package com.ameer.donut.ui.screens.home

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.ameer.donut.R
import com.ameer.donut.ui.screens.base.BaseUiState

data class HomeUiState(
    val offers: List<OfferUiState> = listOf(

        OfferUiState(
            name = "Strawberry Wheel",
            descriptor = "These Baked Strawberry Donuts are filled with fresh strawberries...",
            background = Color(0xFFD7E4F6),
            imageDrawableRes = R.drawable.img_donut_strawberry_wheel,
            price = "$16",
            discount = "$20",
            isFavorite = false
        ),
        OfferUiState(
            name = "Chocolate Glaze",
            descriptor = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
            background = Color(0xFFFFC7D0),
            imageDrawableRes = R.drawable.img_donut_chocolate_glaze,
            price = "$16",
            discount = "$20",
            isFavorite = false
        ),
    ),

    val donuts: List<DonutUiState> = listOf(
        DonutUiState(
            name = "Chocolate Cherry",
            price = "\$22",
            imageDrawableRes = R.drawable.img_dount_chocolate_cherry,
        ), DonutUiState(
            name = "Strawberry Rain",
            price = "\$22",
            imageDrawableRes = R.drawable.img_dount_strawberry_rain,
        ), DonutUiState(
            name = "Strawberry",
            price = "\$22",
            imageDrawableRes = R.drawable.img_dount_strawberry,
        )
    )

) : BaseUiState

data class OfferUiState(
    val name: String,
    val descriptor: String,
    val background: Color,
    @DrawableRes val imageDrawableRes: Int,
    val price: String,
    val discount: String,
    val isFavorite: Boolean,
)

data class DonutUiState(
    val name: String,
    val price: String,
    @DrawableRes val imageDrawableRes: Int,
)