package com.ucne.empleosdoapp.ui.categoria_selected

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.empleosdoapp.data.remote.repository.EmpleoRepository
import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoriaSelectedViewModel @Inject constructor(
    val repository: EmpleoRepository
) : ViewModel() {

    var id by mutableStateOf("")
    var nombreVacante by mutableStateOf("")
    var nombreEmpresa by mutableStateOf("")
    var informacion by mutableStateOf("")
    var requisitos by mutableStateOf("")
    var modalidad by mutableStateOf("")
    var tipo by mutableStateOf("")
    var salario by mutableStateOf("")
    var paginaWeb by mutableStateOf("")
    var fechaPublicacion by mutableStateOf("")
    var area by mutableStateOf("")

    fun post() {
        viewModelScope.launch {
            /*repository(
                EmpleoDto(

                )
            )*/
        }
    }
}