package com.ucne.empleosdoapp.ui.categoria

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ucne.empleosdoapp.R

@Composable
fun CategoriaScreen(
    onClickCategoriaList: () -> Unit,
    /*viewModel: CategoriaViewModel = hiltViewModel()*/
) {
    Scaffold(
        topBar =  {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Categoría", fontSize = 16.sp)
                    }

                },
                elevation = 2.dp,
                backgroundColor = Color.White
            )
        }
    ) {
       /* Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                modifier = Modifier.size(30.dp, 40.dp),
                elevation = 20.dp
            ) {
                
            }
        }


        */
        LazyVerticalGrid(
            GridCells.Adaptive(minSize = 110.dp),
            modifier = Modifier.padding(2.dp).fillMaxSize()
        ){
            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(160.dp)
                    .padding(4.dp,5.dp),
                    elevation = 5.dp
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.desarrollo),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "Desarrollo")
                    }
                }
            }

            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(160.dp)
                    .padding(4.dp,5.dp),
                    elevation = 5.dp,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.basededatos),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "Base de Datos")
                    }
                }
            }

            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(160.dp)
                    .padding(4.dp,5.dp),
                    elevation = 5.dp,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.seguridad),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "Seguridad")
                    }
                }
            }

            item {
                Card(modifier = Modifier
                    .fillMaxSize()
                    .height(160.dp)
                    .padding(4.dp,5.dp),
                    elevation = 5.dp,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center

                    ) {
                        Icon(
                            painter = painterResource(R.drawable.diseno),
                            contentDescription = null,
                            tint = Color(0xFF8E1DFF)
                        )
                        Text(text = "Diseño UI/UX")
                    }
                }
            }

        }

    }
}