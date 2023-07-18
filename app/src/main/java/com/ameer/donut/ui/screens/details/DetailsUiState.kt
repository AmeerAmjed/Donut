package com.ameer.donut.ui.screens.details

import androidx.annotation.DrawableRes
import com.ameer.donut.R
import com.ameer.donut.ui.screens.base.BaseUiState

data class DetailsUiState(
    val name: String = "Strawberry Wheel",
    val descriptor: String = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
    @DrawableRes val imageDrawableRes: Int = R.drawable.img_dount_details,
    val price: String = "$16",
    val quantity: Int = 1,
    val isFavorite: Boolean = false,
) : BaseUiState