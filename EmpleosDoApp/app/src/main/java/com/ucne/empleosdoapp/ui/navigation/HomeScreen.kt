package com.ucne.empleosdoapp.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ucne.empleosdoapp.ui.categoria.CategoriaScreen
import com.ucne.empleosdoapp.ui.categoria_list.CategoriaListScreen
import com.ucne.empleosdoapp.ui.categoria_selected.CategoriaSelectedScreen
import com.ucne.empleosdoapp.ui.guardados.GuardadosListScreen
import com.ucne.empleosdoapp.ui.informacion.InformacionScreen
import com.ucne.empleosdoapp.ui.theme.EmpleosDoAppTheme

val ColorPri = Color(0xFF8E1DFF)
val ColorSec = Color(0xFFB56BFF)

@Composable
fun HomeScreen() {
    EmpleosDoAppTheme {
        val navController = rememberNavController()

        val items = listOf(
            Screen.CategoriaScreen,
            Screen.GuardadosListScreen,
            Screen.InformacionScreen
        )

        Scaffold (
            modifier = Modifier.fillMaxSize(),
            backgroundColor = MaterialTheme.colors.background,
            bottomBar = {
                BarraNavegacion(items, navController)
            }
        ) {
            Menu(navController = navController)
        }
    }
}

@Composable
fun Menu(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.CategoriaScreen.route
    ) {

        composable(Screen.CategoriaScreen.route){
            CategoriaScreen(
                onClickCategoriaList = { navController.navigate(Screen.CategoriaListScreen.route) }
            )
        }

        composable(Screen.CategoriaListScreen.route){
            CategoriaListScreen(
                onClickSelected = { navController.navigate(Screen.CategoriaSelectedScreen.route) },
                onNavigateBack = { navController.navigateUp() }
            )
        }

        composable(Screen.CategoriaSelectedScreen.route){
            CategoriaSelectedScreen({ navController.navigateUp() })
        }

        composable(Screen.GuardadosListScreen.route){
            GuardadosListScreen(
                onClickSelected = { navController.navigate(Screen.CategoriaSelectedScreen.route) }
            )
        }

        composable(Screen.InformacionScreen.route){
            InformacionScreen({ navController.navigateUp() })
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BarraNavegacion(
    items: List<Screen>,
    navController: NavController
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val nombres = listOf("Home", "Guardados", "Info")
    val icons = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.Info)

    NavigationBar(
        containerColor = ColorPri,
        contentColor = ColorSec,
        tonalElevation = 10.dp
    ) {
        items.forEachIndexed { index, screen ->
            NavigationBarItem(
                icon = { Icon(icons[index], contentDescription = nombres[index], tint = Color.White) },
                label = {Text(nombres[index], color = Color.White)},
                selected = currentDestination?.route == screen.route,
                onClick = {
                    navController.navigate(screen.route)
                }
            )
        }
    }
}