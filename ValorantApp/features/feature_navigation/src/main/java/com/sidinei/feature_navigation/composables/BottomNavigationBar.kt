package com.sidinei.feature_navigation.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.sidinei.feature_navigation.routes.Routes
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        Routes.Home,
        Routes.AgentsList,
        Routes.MapsList
    )

    NavigationBar {
        val currentRoute = currentRoute(navController)
        items.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(Icons.Default.Home, contentDescription = null) }, // Substitua pelo ícone apropriado
                label = { Text(screen.route) },
                selected = currentRoute == screen,
                onClick = {
                    navController.navigate(screen.route) {
                        // Evita criar uma nova pilha de navegação ao clicar no item atualmente selecionado
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Composable
fun currentRoute(navController: NavHostController): NavDestination? {
    val navBackStackEntry = navController.currentBackStackEntryAsState().value
    return navBackStackEntry?.destination
}