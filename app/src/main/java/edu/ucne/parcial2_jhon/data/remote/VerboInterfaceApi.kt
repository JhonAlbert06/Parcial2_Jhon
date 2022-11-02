package edu.ucne.parcial2_jhon.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface VerboInterfaceApi {

    @GET("/verbos")
    suspend fun GetVerbos(): Response<List<VerboDto>>
}