package com.example.internsimple.data

import com.example.internsimple.network.ApiService
import com.example.internsimple.network.response.NetworkResponse

class CharacterRepository(private val apiService: ApiService): ICharacterRepository {
    override suspend fun getCharacters() =
         when(val response = apiService.getCharacters()) {
             is NetworkResponse.Success -> response.body
             is NetworkResponse.ApiError -> null
             is NetworkResponse.NetworkError -> null
             is NetworkResponse.UnknownError -> null
         }

    override suspend fun getCharacter(id: Int) =
        when(val response = apiService.getCharacter(id)) {
            is NetworkResponse.Success -> response.body
            is NetworkResponse.ApiError -> null
            is NetworkResponse.NetworkError -> null
            is NetworkResponse.UnknownError -> null
        }
}