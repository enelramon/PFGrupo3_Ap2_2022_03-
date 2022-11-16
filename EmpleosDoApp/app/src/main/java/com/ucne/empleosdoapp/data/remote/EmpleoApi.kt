package com.ucne.empleosdoapp.data.remote

import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import retrofit2.http.*

interface EmpleoApi {
    @GET("/")
    suspend fun GetList(): List<EmpleoDto>
}