package com.davidmerchan.androidmodules.navigation

import androidx.navigation.NavController
import com.davidmerchan.core.utils.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    navigate(event.route) {
        launchSingleTop = true
    }
}
