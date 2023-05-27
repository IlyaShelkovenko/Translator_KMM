package com.gmail.hostov47.translator_kmm.translate.domain.history

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
data class HistoryItem(
    val id: Long?,
    val fromLanguageCode: String,
    val fromText: String,
    val toLanguageCode: String,
    val toText: String,
)