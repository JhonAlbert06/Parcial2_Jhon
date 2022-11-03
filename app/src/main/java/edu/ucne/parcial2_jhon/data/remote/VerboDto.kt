package edu.ucne.parcial2_jhon.data.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class VerboDto(
    val Verbo: String,
    val Categoria: String,
    val Nivel: String,
    val Imagen: String
)
