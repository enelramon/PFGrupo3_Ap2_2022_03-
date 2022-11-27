package com.ucne.empleosdoapp.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.ui.theme.ColorPri
import com.ucne.empleosdoapp.ui.theme.EmpleosDoAppTheme

@Composable
fun SplashScreen() {
    EmpleosDoAppTheme {
        Inicio()
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
private fun Inicio() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        backgroundColor = ColorPri,
        bottomBar = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Encuentra el empleo ideal",
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 20.sp
                )
            }
        }
    ) {
        Logo()
    }
}

@Composable
private fun Logo() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(R.drawable.logo),
            contentDescription = null,
            modifier = Modifier.size(220.dp),
            tint = Color.White
        )
    }
}