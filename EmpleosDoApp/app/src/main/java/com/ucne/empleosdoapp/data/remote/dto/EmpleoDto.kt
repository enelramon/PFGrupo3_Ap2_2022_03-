package com.ucne.empleosdoapp.data.remote.dto

data class EmpleoDto(
    val id: Int,
    val nombreVacante: String,
    val nombreEmpresa: String,
    val informacionVacante: String,
    val logoEmpresa: String,
    val requisitoVacante: String,
    val modalida: String,
    val tipo: String,
    val salario: Double,
    val paginaWeb: String,
    val ubicacion: String,
    val fechaPublicacion: String,
    val area: String
)