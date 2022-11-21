package com.ucne.empleosdoapp.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.layout.LazyLayout
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.ui.categoria.CategoriaScreen
import com.ucne.empleosdoapp.ui.theme.ColorPri
import com.ucne.empleosdoapp.ui.theme.EmpleosDoAppTheme
import okhttp3.internal.wait

@Composable
fun ConexionScreen() {
    EmpleosDoAppTheme {
        Inicio()
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
private fun Inicio() {
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
            /*Button(
                onClick = {
                          navController.navigate(Screen.InicioMain.route)
                },
                shape = RoundedCornerShape(20)
            ) {
                Text(text = "Intentar nuevamente", color = Color.White)
            }*/
        }
    }
}