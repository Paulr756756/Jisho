package com.johannliebert.jisho.feature_joshi.data.remote.dto

import com.johannliebert.jisho.feature_joshi.domain.model.Phonetic

data class PhoneticDto(
    val audio: String,
    val license: LicenseX,
    val sourceUrl: String,
    val text: String
){
    fun toPhonetic() : Phonetic{

        return Phonetic(
            audio = audio,
            text = text,
            sourceUrl = sourceUrl
        )
    }
}