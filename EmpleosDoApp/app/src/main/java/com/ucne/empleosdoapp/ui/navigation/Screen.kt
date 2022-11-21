package com.ucne.empleosdoapp.ui.navigation

sealed class Screen(val route: String) {
    object HomeScreen: Screen("Home")
    object SplashScreen: Screen("Splash")
    object CategoriaScreen: Screen("Categoria")
    object CategoriaListScreen: Screen("CategoriaList")
    object CategoriaSelectedScreen: Screen("CategoriaSelected")
    object GuardadosListScreen: Screen("GuardadosList")
    object InformacionScreen: Screen("Informacion")
    object Menu: Screen("Menu")
    object ConexionScreen: Screen("ConexionScreen")

}