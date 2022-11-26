package com.ucne.empleosdoapp.data.remote

import com.ucne.empleosdoapp.data.remote.dto.EmpleoDto
import retrofit2.http.*

interface EmpleoApi {
    @GET("Empleoscontrollers")
    suspend fun GetList(): List<EmpleoDto>

    @GET("Empleoscontrollers/{id}")
    suspend fun GetEmpleo(@Path("id") id: Int): EmpleoDto
}