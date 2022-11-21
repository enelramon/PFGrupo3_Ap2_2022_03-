package com.ucne.empleosdoapp.data.remote.repository

import com.ucne.empleosdoapp.data.remote.EmpleoApi
import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import javax.inject.Inject

class EmpleoRepository @Inject constructor(
    private val empleo : EmpleoApi
) {
    suspend fun getListEmpleos(): List<EmpleoDto> {
        try {
            val api = empleo.GetList()
            return api
        } catch (e: Exception) {
            throw e
        }
    }
}