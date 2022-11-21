package com.ucne.empleosdoapp.ui.guardados

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ucne.empleosdoapp.R

@Composable
fun GuardadosListScreen(
    onClickSelected: () -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Seleccionado", fontSize = 16.sp) }, modifier = Modifier.shadow(8.dp))
            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp),) {
                Icon(
                    painter = painterResource(R.drawable.back),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        },
    ){
    Column() {
        Spacer(modifier = Modifier.height(5.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(contentAlignment = Alignment.Center){
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .height(84.dp)
                    .padding(4.dp, 4.dp), elevation = 2.dp, backgroundColor = Color(0xFF8E1DFF)) {
                }


                Card(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp),
                    elevation = 2.dp,
                    backgroundColor = Color.Blue,


                    ) {

                }
            }

        }

        Column(
            modifier = Modifier
                .padding(4.dp, 0.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            Text(
                text = "Consultor de Implementacion y producto",
                fontWeight = FontWeight.Black, textAlign = TextAlign.Center
            )

        }


        LazyVerticalGrid(
            GridCells.Adaptive(minSize = 110.dp),
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth()
        ){
            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(65.dp)
                    .padding(4.dp, 5.dp),
                    elevation = 2.dp
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.info),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "Santiago")
                    }
                }
            }

            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(65.dp)
                    .padding(4.dp, 5.dp),
                    elevation = 2.dp,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.info),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "21/11/2022")
                    }
                }
            }

            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(65.dp)
                    .padding(4.dp, 5.dp),
                    elevation = 2.dp,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.info),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "Remoto")
                    }
                }
            }

            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(65.dp)
                    .padding(4.dp, 5.dp),
                    elevation = 2.dp,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center

                    ) {
                        Icon(
                            painter = painterResource(R.drawable.info),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "Tiempo completo")
                    }
                }
            }
            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(65.dp)
                    .padding(4.dp, 5.dp),
                    elevation = 2.dp,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center

                    ) {
                        Icon(
                            painter = painterResource(R.drawable.info),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "20,000 DOP")
                    }
                }
            }
        }
            Spacer(modifier = Modifier.height(5.dp))


            Column(
                modifier = Modifier.padding(4.dp, 0.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Descripcion del puesto",
                    fontWeight = FontWeight.Black
                )
                Text(text = "Es una app que permite ver empleos relacionados al área de tecnología, disponibles en república dominicana.\n")
                Text(
                    text = "Requisitos",
                    fontWeight = FontWeight.Black
                )
                Text(text = "Es una app que permite ver empleos relacionados al área de tecnología, disponibles en república dominicana.\n")

            }

        LazyVerticalGrid(
            GridCells.Adaptive(minSize = 170.dp),
            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth()
                .align(Alignment.End)
        ){
            item {
                Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Guardar")
                }
            }
            item {
                Button(onClick = { /*TODO*/ },modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Solicitar")
                }
            }


        }
        
        

        }
    }
}


/*
@Composable
fun GuardadosListScreen(
    onClickSelected: () -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text("Desarrollo/Guardados", fontSize = 16.sp) }, modifier = Modifier.shadow(8.dp))
            Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp),) {
                Text(text = "Back")
            }

        },
    ){
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top

        ) {

            item {
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .height(116.dp)
                    .padding(4.dp, 0.dp), elevation = 2.dp) {
                    Row() {
                        Card(modifier = Modifier
                            .fillMaxHeight()
                            .width(116.dp)) {
                            Icon(
                                painter = painterResource(R.drawable.logo),
                                contentDescription = null,
                                tint = Color.Blue, modifier = Modifier
                                    .size(121.dp, 51.dp) /* tamano de logo */
                            )
                        }

                        Spacer(modifier = Modifier.width(5.dp))
                        Column(modifier = Modifier.padding(5.dp)) {
                            Text(text = "Consultor de Implementacion y producto")
                            Text(text = "WWT Company")
                            Text(text = "Presencial")

                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                Column() {
                                    Text(text = "Tiempo completo")
                                    Text(text = "Santiago - 21/11/2022")
                                }
                                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp),) {

                                    Icon(
                                        painter = painterResource(R.drawable.guardado),
                                        contentDescription = null,
                                        tint = Color.White
                                    )
                                }

                            }

                        }
                    }
                }
            }

            /**/

            item {
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .height(116.dp)
                    .padding(4.dp, 0.dp), elevation = 2.dp) {
                    Row() {
                        Card(modifier = Modifier
                            .fillMaxHeight()
                            .width(116.dp)) {
                            Icon(
                                painter = painterResource(R.drawable.logo),
                                contentDescription = null,
                                tint = Color.Blue, modifier = Modifier
                                    .size(121.dp, 51.dp) /* tamano de logo */
                            )
                        }

                        Spacer(modifier = Modifier.width(5.dp))
                        Column(modifier = Modifier.padding(5.dp)) {
                            Text(text = "Consultor de Implementacion y producto")
                            Text(text = "WWT Company")
                            Text(text = "Presencial")

                            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                                Column() {
                                    Text(text = "Tiempo completo")
                                    Text(text = "Santiago - 21/11/2022")
                                }
                                Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp),) {

                                    Icon(
                                        painter = painterResource(R.drawable.guardado),
                                        contentDescription = null,
                                        tint = Color.White
                                    )
                                }

                            }

                        }
                    }
                }
            }


        }
    }
}
 */