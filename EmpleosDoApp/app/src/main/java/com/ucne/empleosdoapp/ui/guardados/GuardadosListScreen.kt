package com.ucne.empleosdoapp.ui.guardados

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ucne.empleosdoapp.R

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