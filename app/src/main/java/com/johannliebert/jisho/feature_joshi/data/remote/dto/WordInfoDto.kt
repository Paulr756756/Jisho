package com.johannliebert.jisho.feature_joshi.data.remote.dto

import com.johannliebert.jisho.feature_joshi.domain.model.WordInfo

data class WordInfoDto(
    val license: License,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
){
    fun toWordInfo(): WordInfo {

        return WordInfo(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            sourceUrls = sourceUrls,
            word = word,

        )
    }
}
