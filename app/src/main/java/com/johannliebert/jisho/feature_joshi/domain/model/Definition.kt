package com.johannliebert.jisho.feature_joshi.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<Any>
)
