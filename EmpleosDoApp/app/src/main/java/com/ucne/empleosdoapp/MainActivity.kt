package com.ucne.empleosdoapp

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucne.empleosdoapp.ui.navigation.ConexionScreen
import com.ucne.empleosdoapp.ui.navigation.HomeScreen
import com.ucne.empleosdoapp.ui.navigation.Screen
import com.ucne.empleosdoapp.ui.theme.EmpleosDoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmpleosDoAppTheme {val context = LocalContext.current
                val navController = rememberNavController()
                if (compruebaConexion(context)) {
                    NavHost(
                        navController = navController,
                        startDestination = Screen.HomeScreen.route
                    ) {
                        composable(Screen.HomeScreen.route) {
                            HomeScreen(

                                onClick = { navController.navigate(Screen.HomeScreen.route) },




                                )
                        }
                        composable(Screen.HomeScreen.route) {
                            HomeScreen({ navController.navigateUp() })
                        }


                    }
                }else{
                    NavHost(
                        navController = navController,
                        startDestination = Screen.ConexionScreen.route
                    ) {
                        composable(Screen.ConexionScreen.route) {
                            ConexionScreen(

                                onClick = { navController.navigate(Screen.HomeScreen.route) },




                            )
                        }
                        composable(Screen.HomeScreen.route) {
                            HomeScreen({ navController.navigateUp() })
                        }


                    }
                }
            }
        }
    }
}
fun compruebaConexion(context: Context): Boolean {
    var connected = false
    val connec = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    // Recupera todas las redes (tanto móviles como wifi)
    val redes = connec.allNetworkInfo
    for (i in redes.indices) {
        // Si alguna red tiene conexión, se devuelve true
        if (redes[i].state == NetworkInfo.State.CONNECTED) {
            connected = true
        }
    }
    return connected
}