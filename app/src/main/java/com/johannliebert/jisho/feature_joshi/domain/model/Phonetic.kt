package com.johannliebert.jisho.feature_joshi.domain.model

import com.johannliebert.jisho.feature_joshi.data.remote.dto.LicenseX

data class Phonetic(
    val audio: String,
//    val license: LicenseX,
    val sourceUrl: String,
    val text: String
)
