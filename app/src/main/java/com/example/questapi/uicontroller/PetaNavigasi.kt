package com.example.questapi.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination =
        DestinasiHome.route, modifier = Modifier ){
        composable(DestinasiHome.route) {
            HomeScreen(navigateToItemEntry = { navController.navigate
                (DestinasiEntry.route) },
            )
        }
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = { navController.navigate
                (DestinasiHome.route) })
        }
    }
}