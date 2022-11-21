package com.ucne.empleosdoapp.ui.informacion

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.ui.theme.ColorPri
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
        topBar =  {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Información", fontSize = 16.sp)
                    }
                },
                elevation = 5.dp,
                backgroundColor = Color.White
            )
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {

            Spacer(modifier = Modifier.height(5.dp))
            CardTop()

            Spacer(modifier = Modifier.height(10.dp))
            TextoInfo()

            Spacer(modifier = Modifier.height(5.dp))

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.size(200.dp),
                    painter = painterResource(id = R.drawable.infocomputer),
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
private fun CardTop() {
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(84.dp)
        .padding(4.dp, 4.dp),
        elevation = 2.dp,
        shape = RoundedCornerShape(10.dp),
        backgroundColor = ColorPri
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondoinfo),
            modifier = Modifier.fillMaxSize(),
            contentDescription = null
        )
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.width(5.dp))
            Iconos(sizeIcon = 120.dp, idIcon = R.drawable.logo)
            Spacer(modifier = Modifier.width(20.dp))
            BotonValorar()
        }
    }
}

@Composable
private fun BotonValorar() {
    Button(
        onClick = {
                  /* TODO */
        },
        border = BorderStroke(1.dp, Color.White),
        shape = RoundedCornerShape(50),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
    ) {
        Iconos(sizeIcon = 15.dp, idIcon = R.drawable.googleplay)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "Valora nuestra App", color = Color.White)
    }
}

@Composable
private fun Iconos(sizeIcon: Dp, idIcon: Int) {
    Icon(
        modifier = Modifier.size(sizeIcon),
        painter = painterResource(idIcon),
        tint = Color.White,
        contentDescription = null
    )
}

@Composable
private fun TextoInfo(){
    Column(modifier = Modifier.padding(4.dp, 0.dp)) {
        Text(text = "¿Qué es Empleos Do?\n", fontWeight = FontWeight.Black)
        Text(text = "   Es una app que permite ver empleos relacionados al área de tecnología, disponibles en república dominicana.\n")
        Text(text = "   Accede a una gran cantidad de disponibilidad de empleos más recientes en república dominicana y aplicar a ellos de una forma fácil y sencilla.\n")
        Text(text = "   También conoces como es la forma de trabajar de estas empresas, ubicación, requisitos, sueldos.\n")
        Text(text = "   Encontraras todas las informaciones necesarias para entrar al mercado laboral. \n")
    }
}