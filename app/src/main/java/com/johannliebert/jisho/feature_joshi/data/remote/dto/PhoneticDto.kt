package com.johannliebert.jisho.feature_joshi.data.remote.dto

data class PhoneticDto(
    val audio: String,
    val license: LicenseX,
    val sourceUrl: String,
    val text: String
)