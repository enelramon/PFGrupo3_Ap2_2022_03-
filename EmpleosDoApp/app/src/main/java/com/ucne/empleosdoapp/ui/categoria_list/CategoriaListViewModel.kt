package com.ucne.empleosdoapp.ui.categoria_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import com.ucne.empleosdoapp.data.remote.repository.EmpleoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class CategoriaListUiState(
    val empleos: List<EmpleoDto> = emptyList()
)

@HiltViewModel
class CategoriaListViewModel @Inject constructor(
    val repository: EmpleoRepository
): ViewModel() {

    private val _uiState = MutableStateFlow(CategoriaListUiState())
    val uiState: StateFlow<CategoriaListUiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.update {
                it.copy(empleos = repository.getListEmpleos())
            }
        }
    }
}