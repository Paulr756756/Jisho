package com.johannliebert.jisho.feature_joshi.domain.model

import com.johannliebert.jisho.feature_joshi.data.remote.dto.MeaningDto

data class WordInfo(
//    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String
)
