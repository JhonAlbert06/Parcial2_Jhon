package edu.ucne.parcial2_jhon.data.remote

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class VerboRepositori @Inject constructor(
    private val api: VerboInterfaceApi
) {
    suspend fun getVerbos(): List<VerboDto> {
        return withContext(Dispatchers.IO){
            val resonse = api.GetVerbos()
            resonse.body()?: emptyList()
        }
    }
}