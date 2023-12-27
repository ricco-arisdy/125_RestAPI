package com.example.restapi.repository

import com.example.restapi.model.Kontak
import com.example.restapi.network.KontakService

interface KontakRepository {
    /** Fetches list of kontak from kontakAPI */
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository{
    /** Fetches list of kontak from kontakAPI */
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}