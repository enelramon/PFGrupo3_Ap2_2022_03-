package com.ucne.empleosdoapp.ui.informacion

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.ui.theme.EmpleosDoAppTheme

@Composable
fun InformacionScreen(
    onNavigateBack: () -> Unit
) {
    EmpleosDoAppTheme {
        Inicio()
    }
}

@Composable
private fun Inicio() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Icon(
                painter = painterResource(R.drawable.logo),
                contentDescription = null,
                tint = Color(0xFF8E1DFF)
            )
            Spacer(modifier = Modifier.height(60.dp))

            Text(
                text = "¿Qué es Empleos do?",
                fontWeight = FontWeight.Black
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    EmpleosDoAppTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(60.dp))
                Icon(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = null,
                    tint = Color(0xFF8E1DFF)
                )
            }
        }
    }
}