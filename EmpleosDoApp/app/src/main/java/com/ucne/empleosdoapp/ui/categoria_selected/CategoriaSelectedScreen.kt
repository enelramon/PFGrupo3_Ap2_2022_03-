package com.ucne.empleosdoapp.ui.categoria_selected

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import com.ucne.empleosdoapp.ui.categoria_list.CategoriaListViewModel
import com.ucne.empleosdoapp.ui.theme.ColorPri
import java.lang.Double.toString

@Composable
fun CategoriaSelectedScreen(
    id: Int = 0,
    viewModel: CategoriaSelectedViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    remember {
        viewModel.getById(id)
        0
    }

    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "Seleccionado", fontSize = 16.sp)
                    }
                },
                elevation = 5.dp,
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
        Column {
            Spacer(modifier = Modifier.height(5.dp))
            Banner(uiState.empleo)
            Spacer(modifier = Modifier.height(10.dp))
            VacanteTitulo(uiState.empleo)
            Spacer(modifier = Modifier.height(10.dp))
            ExtraInfo(uiState.empleo)
            Spacer(modifier = Modifier.height(10.dp))
            DescripcionRequisito(uiState.empleo)
            Botones()
        }
    }
}

@Composable
private fun Banner(empleo: EmpleoDto) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(4.dp, 0.dp),
                elevation = 2.dp,
                shape = RoundedCornerShape(20.dp),
                backgroundColor = Color(0xFF8E1DFF)
            ) {

            }
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier.size(90.dp),
                border = BorderStroke(3.dp, Color.White),
                shape = RoundedCornerShape(35.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(empleo.logoEmpresa)
                        .crossfade(true)
                        .build(),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
private fun VacanteTitulo(empleo: EmpleoDto) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = empleo.nombreVacante,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            color = ColorPri
        )
    }
}

@Composable
private fun ExtraInfo(empleo: EmpleoDto) {

    val iconos = listOf(
        R.drawable.location,
        R.drawable.calendar,
        R.drawable.briefcase,
        R.drawable.clock,
        R.drawable.money
    )

    val textos = listOf(
        empleo.ubicacion,
        empleo.fechaPublicacion,
        empleo.tipo,
        empleo.modalida,
        toString(empleo.salario)
    )

    LazyVerticalGrid(
        GridCells.Adaptive(minSize = 110.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        itemsIndexed(iconos) { index, icono ->
            InfoCard(idIcon = icono, text = textos[index])
        }
    }
}

@Composable
private fun InfoCard(idIcon: Int, text: String) {
    Card(
        modifier = Modifier
            .width(110.dp)
            .height(70.dp)
            .padding(5.dp),
        elevation = 2.dp
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(idIcon),
                contentDescription = null,
                tint = ColorPri
            )
            Spacer(modifier = Modifier.padding(3.dp))
            Text(text = text, fontWeight = FontWeight.Bold, fontSize = 10.sp, textAlign = TextAlign.Center)
        }
    }
}

@Composable
private fun DescripcionRequisito(empleo: EmpleoDto) {
    Column(
        modifier = Modifier.padding(4.dp, 0.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(text = "Descripción del puesto:", fontWeight = FontWeight.Black, fontSize = 14.sp)
        Text(text = "   " + empleo.informacionVacante + "\n", fontSize = 12.sp)
        Text(text = "Requisitos:", fontWeight = FontWeight.Black, fontSize = 14.sp)
        Text(text = "   " + empleo.requisitoVacante + "\n", fontSize = 12.sp)
    }
}

@Composable
private fun Botones() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(2.dp, 0.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(195.dp)
                .padding(2.dp, 0.dp),
            border = BorderStroke(2.dp, ColorPri),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
        ) {
            Text(text = "Guardar", color = ColorPri)
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(195.dp)
                .padding(2.dp, 0.dp)
        ) {
            Text(text = "Solicitar")
        }
    }
}