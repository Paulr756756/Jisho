package com.johannliebert.jisho.feature_joshi.data.remote.dto

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<Any>
)