package com.gmail.hostov47.translator_kmm.translate.presentation

import com.gmail.hostov47.translator_kmm.core.presentation.UiLanguage

/**
 * @author Shelkovenko Ilya on 28.05.2023
 */
data class UiHistoryItem(
    val id: Long,
    val fromText: String,
    val toText: String,
    val fromLanguage: UiLanguage,
    val toLanguage: UiLanguage
)
