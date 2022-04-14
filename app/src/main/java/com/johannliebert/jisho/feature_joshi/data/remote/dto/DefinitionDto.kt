package com.johannliebert.jisho.feature_joshi.data.remote.dto

import com.johannliebert.jisho.feature_joshi.domain.model.Definition

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<Any>
){
    //mapper for DefinitonDto; will return a definition without dto
    fun toDefinition(): Definition {
        return Definition(
            antonyms = antonyms,
            definition = definition,
            synonyms =  synonyms,
        )
    }
}