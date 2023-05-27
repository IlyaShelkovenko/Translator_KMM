package com.gmail.hostov47.translator_kmm.translate.data.translate

import kotlinx.serialization.SerialName

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
@kotlinx.serialization.Serializable
data class TranslateDto(
    @SerialName("q") val textToTranslate: String,
    @SerialName("source") val sourceLanguageCode: String,
    @SerialName("target") val targetLanguageCode: String
)