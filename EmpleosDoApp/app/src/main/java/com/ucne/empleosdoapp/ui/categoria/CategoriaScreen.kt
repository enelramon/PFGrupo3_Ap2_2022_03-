package com.ucne.empleosdoapp.ui.categoria

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ucne.empleosdoapp.R
import com.ucne.empleosdoapp.ui.theme.ColorPri

@Composable
fun CategoriaScreen(
    onClickCategoriaList: () -> Unit
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
                elevation = 5.dp,
                backgroundColor = Color.White
            )
        }
    ) {
        MenuCard(onClickCategoriaList)
    }
}

@Composable
private fun MenuCard(
    onClickCategoriaList: () -> Unit
) {
    val opcionesIcon = listOf(
        R.drawable.desarrollo,
        R.drawable.basededatos,
        R.drawable.seguridad,
        R.drawable.diseno
    )

    val opcionesTexto = listOf(
        "Desarrollo",
        "Base de Datos",
        "Seguridad",
        "Diseño UI/UX"
    )

    LazyVerticalGrid(
        GridCells.Adaptive(minSize = 110.dp),
        modifier = Modifier
            .padding(2.dp)
            .fillMaxSize()
    ){
        itemsIndexed(opcionesIcon) { index, opcion ->
            CardCategoria(idIcon = opcion, text = opcionesTexto[index], onClickCategoriaList)
        }
    }
}

@Composable
private fun CardCategoria(
    idIcon: Int, 
    text: String,
    onClickCategoriaList: () -> Unit
) {

    IconButton(
        onClick = onClickCategoriaList,
        modifier = Modifier
            .fillMaxSize()
            .height(160.dp)
            .padding(5.dp),
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .height(160.dp),
            elevation = 2.dp,
            shape = RoundedCornerShape(10)
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

                Spacer(modifier = Modifier.padding(5.dp))
                Text(text = text)
            }
        }
    }
}