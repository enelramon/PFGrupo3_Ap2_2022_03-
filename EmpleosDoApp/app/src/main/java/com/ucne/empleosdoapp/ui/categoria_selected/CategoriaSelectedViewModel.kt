package com.ucne.empleosdoapp.ui.categoria_selected

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.empleosdoapp.data.remote.repository.EmpleoRepository
import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import com.ucne.empleosdoapp.ui.categoria_list.CategoriaListUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class EmpleoUiState(
    val empleo: EmpleoDto = EmpleoDto(
        0,
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        0.0,
        "",
        "",
        "",
        "",
    )
)

@HiltViewModel
class CategoriaSelectedViewModel @Inject constructor(
    val repository: EmpleoRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(EmpleoUiState())
    val uiState: StateFlow<EmpleoUiState> = _uiState.asStateFlow()

    fun getById(id: Int) {
        viewModelScope.launch {
            _uiState.update {
                it.copy(empleo = repository.getEmpleo(id))
            }

        }
    }
}