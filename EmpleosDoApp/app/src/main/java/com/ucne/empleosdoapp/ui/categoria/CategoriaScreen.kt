package com.ucne.empleosdoapp.ui.categoria

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

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
                        Text(text = "Categoria")
                    }
                },
                elevation = 20.dp,
                backgroundColor = Color.White
            )
        }
    ) {
        Column(
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
    }
}