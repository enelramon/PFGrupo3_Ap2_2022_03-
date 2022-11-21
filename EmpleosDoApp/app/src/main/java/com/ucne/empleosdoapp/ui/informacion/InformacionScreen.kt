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
import androidx.compose.ui.unit.sp
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
                elevation = 2.dp,
                backgroundColor = Color.White
            )
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {
            Spacer(modifier = Modifier.height(5.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(84.dp)
                .padding(4.dp, 4.dp), elevation = 2.dp, backgroundColor = Color(0xFF8E1DFF)) {
            
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = null,
                        tint = Color.White, modifier = Modifier
                            .size(121.dp, 51.dp) /* tamano de logo */
                    )
                    Spacer(modifier = Modifier.width(25.dp))
                    Button(onClick = { /*TODO*/ }) {
                        Icon(painter =painterResource(R.drawable.info) , contentDescription = null, tint = Color.White)
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "Valora nuestra App")
                    }
                }
               

            }
            Spacer(modifier = Modifier.height(5.dp))
            Column(modifier = Modifier.padding(4.dp, 0.dp)) {
                Text(
                    text = "¿Qué es Empleos Do?",
                    fontWeight = FontWeight.Black
                )
                Text(text = "Es una app que permite ver empleos relacionados al área de tecnología, disponibles en república dominicana.\n")
                Text(text = "Accede a una gran cantidad de disponibilidad de empleos más recientes en república dominicana y aplicar a ellos de una forma fácil y sencilla.\n")
                Text(text = "También conoces como es la forma de trabajar de estas empresas, ubicación, requisitos, sueldos.\n")
                Text(text = "Encontraras todas las informaciones necesarias para entrar al mercado laboral. \n")
            }

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