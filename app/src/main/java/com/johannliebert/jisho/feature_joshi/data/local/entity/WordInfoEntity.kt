package com.johannliebert.jisho.feature_joshi.data.local.entity

import com.johannliebert.jisho.feature_joshi.domain.model.*

data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val sourceUrl : List<String>,
    val meanings: List<Meaning>,
    val id: Int? = null
){
    fun toWordInfo() : WordInfo {
        return WordInfo(
            meanings = meanings,
            phonetic = phonetic,
            word = word,
            sourceUrls = sourceUrl
        )
    }
}
