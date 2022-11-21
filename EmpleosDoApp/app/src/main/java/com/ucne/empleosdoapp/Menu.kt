package com.ucne.empleosdoapp

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.ucne.empleosdoapp.ui.navigation.ConexionScreen
import com.ucne.empleosdoapp.ui.navigation.HomeScreen
import com.ucne.empleosdoapp.ui.theme.EmpleosDoAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Menu(onClick: () -> Unit) : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EmpleosDoAppTheme {

            }
        }
    }
}
