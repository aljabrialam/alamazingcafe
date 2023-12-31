package com.alamazing.jetpackcompose

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alamazing.jetpackcompose.navigation.Actions
import com.alamazing.jetpackcompose.navigation.Destination
import com.alamazing.jetpackcompose.ui.DashboardScreen
import com.alamazing.jetpackcompose.ui.LoginScreen

@Composable
fun ComposeApp() {
    val navController = rememberNavController()

    val actions = remember(navController) { Actions(navController) }
    MaterialTheme {
        NavHost(navController = navController, startDestination = Destination.Login) {

            composable(Destination.Login) {
                LoginScreen(actions.openDashboard)
            }

            composable(Destination.DashBoard) {
                DashboardScreen()
            }
        }
    }
}