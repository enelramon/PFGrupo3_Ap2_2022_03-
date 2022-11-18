package com.ucne.empleosdoapp.data.remote.dto

data class EmpleoDto(
    val Id: Int,
    val NombreVacante: String,
    val NombreEmpresa: String,
    val Informacion: String,
    val Requisitos: String,
    val Modalidad: String,
    val Tipo: String,
    val Salario: Double,
    val PaginaWeb: String,
    val FechaPublicacion: Int,
    val Area: String
)