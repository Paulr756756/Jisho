package com.johannliebert.jisho.feature_joshi.data.remote.dto

import com.johannliebert.jisho.feature_joshi.domain.model.Meaning

data class MeaningDto(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
){
    fun toMeaning(): Meaning {

        return Meaning(
            definitions= definitions.map { it.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}