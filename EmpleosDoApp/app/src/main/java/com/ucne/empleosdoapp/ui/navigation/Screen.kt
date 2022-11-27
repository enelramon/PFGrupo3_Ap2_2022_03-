package com.ucne.empleosdoapp.ui.navigation

sealed class Screen(val route: String) {
    object SplashScreen: Screen("Splash")
    object ConexionScreen: Screen("Conexion")
    object InicioMain: Screen("Inicio")
    object CategoriaScreen: Screen("Categoria")
    object CategoriaListScreen: Screen("CategoriaList")
    object CategoriaSelectedScreen: Screen("CategoriaSelected")
    object GuardadosListScreen: Screen("GuardadosList")
    object InformacionScreen: Screen("Informacion")
}