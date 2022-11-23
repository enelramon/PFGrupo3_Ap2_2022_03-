package com.ucne.empleosdoapp.ui.categoria_list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import com.ucne.empleosdoapp.ui.theme.ColorPri

@Composable
fun CategoriaListScreen(
    onClickSelected: () -> Unit,
    onNavigateBack: () -> Unit,
    /*viewModel: CategoriaListViewModel = hiltViewModel()*/
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Tipo seleccionado", fontSize = 16.sp)
                    }
                },
                elevation = 2.dp,
                backgroundColor = Color.White
            )

            IconButton(
                onClick = onNavigateBack,
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(R.drawable.back),
                    contentDescription = null,
                    tint = ColorPri
                )
            }
        }
    ) {
        /*val uiState by viewModel.uiState.collectAsState()*/

        Column(modifier = Modifier
            .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(2.dp))
            CategoriaList(
                /*empleos = uiState.empleos,*/
                modifier = Modifier
                    .fillMaxSize(),
                onClickSelected
            )
        }
    }
}

@Composable
private fun CategoriaList(
    /*empleos: List<EmpleoDto>,*/
    modifier: Modifier = Modifier,
    onClickSelected: () -> Unit
) {
    LazyColumn(modifier = modifier) {
        /*items(empleos) { empleo ->

        }*/

        item {
            SelectedCard(/*empleo = empleo*/ onClickSelected)
        }
    }
}

@Composable
private fun SelectedCard(
    /*empleo: EmpleoDto*/
    onClickSelected: () -> Unit
) {
    IconButton(
        onClick = onClickSelected,
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .padding(5.dp, 0.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize(),
            elevation = 2.dp
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(130.dp),
                    backgroundColor = Color.Blue
                ) {}
                Spacer(modifier = Modifier.padding(3.dp, 0.dp))
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                ) {
                    Text(
                        text = "Consultor de Implementacion y producto",
                        fontWeight = FontWeight.Black,
                        textAlign = TextAlign.Left,
                        fontSize = 14.sp,
                        color = ColorPri
                    )
                    Text(
                        text = "WWT Company",
                        textAlign = TextAlign.Left,
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Remoto",
                        textAlign = TextAlign.Left,
                        fontSize = 12.sp
                    )
                    Text(
                        text = "Tiempo completo",
                        fontSize = 12.sp
                    )
                    Row(
                        Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column() {

                            Text(text = "Santiago - 21/11/2022", fontSize = 10.sp)
                        }
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                modifier = Modifier.size(30.dp),
                                painter = painterResource(R.drawable.guardado),
                                contentDescription = null,
                                tint = ColorPri
                            )
                        }
                    }
                }
            }
        }
    }
}