package com.johannliebert.jisho.feature_joshi.data.remote

import com.johannliebert.jisho.feature_joshi.data.remote.dto.WordInfoDto
import retrofit2.http.*

interface DictionaryAPI {
    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word:String
    ) : List<WordInfoDto>
}