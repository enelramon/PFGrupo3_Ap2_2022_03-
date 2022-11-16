package com.ucne.empleosdoapp.ui.guardados

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun GuardadosListScreen(
    onClickSelected: () -> Unit
) {
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        backgroundColor = MaterialTheme.colors.background
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Prueba")
        }
    }
}