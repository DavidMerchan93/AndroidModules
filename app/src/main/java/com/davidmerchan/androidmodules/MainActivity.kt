package com.davidmerchan.androidmodules

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.davidmerchan.androidmodules.navigation.navigate
import com.davidmerchan.androidmodules.ui.theme.AndroidModulesTheme
import com.davidmerchan.core.navigation.Route
import com.davidmerchan.onbording_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidModulesTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Route.WELCOME) {
                    composable(Route.WELCOME) {
                        WelcomeScreen(
                            onNavigate = navController::navigate,
                        )
                    }
                    composable(Route.AGE) {
                    }
                    composable(Route.GENDER) {
                    }
                    composable(Route.HEIGHT) {
                    }
                    composable(Route.WEIGHT) {
                    }
                    composable(Route.NUTRIENT_GOAL) {
                    }
                    composable(Route.ACTIVITY) {
                    }
                    composable(Route.GOAL) {
                    }
                    composable(Route.TRACKER_OVERVIEW) {
                    }
                }
            }
        }
    }
}
