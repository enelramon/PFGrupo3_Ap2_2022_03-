package com.ucne.empleosdoapp.ui.navigation

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.ui.theme.ColorPri
import com.ucne.empleosdoapp.ui.theme.EmpleosDoAppTheme

@Composable
fun ConexionScreen(onClick: () -> Unit) {
    EmpleosDoAppTheme {
        Inicio(onClick)
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
private fun Inicio(onClick: () -> Unit) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.conexion),
                contentDescription = null,
                modifier = Modifier.size(150.dp),
                tint = ColorPri
            )
            Text(text = "¡¡Ooops!!", fontSize = 30.sp, fontWeight = FontWeight.Black, color = ColorPri)
            Spacer(modifier = Modifier.padding(5.dp))
            Text(text = "No hay internet, comprueba tu conexión.")
            Spacer(modifier = Modifier.padding(15.dp))
            val context = LocalContext.current
            val navController = rememberNavController()
            Button(
                onClick =onClick,
                shape = RoundedCornerShape(20),
            ) {
                Text(text = "Intentar nuevamente", color = Color.White)
            }
        }
    }
}




