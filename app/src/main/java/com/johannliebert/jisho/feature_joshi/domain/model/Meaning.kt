package com.johannliebert.jisho.feature_joshi.domain.model

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech : String
)
