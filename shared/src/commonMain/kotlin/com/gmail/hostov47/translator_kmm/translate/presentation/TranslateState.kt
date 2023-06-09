package com.gmail.hostov47.translator_kmm.translate.presentation

import com.gmail.hostov47.translator_kmm.core.presentation.UiLanguage
import com.gmail.hostov47.translator_kmm.translate.domain.translate.TranslateError

/**
 * @author Shelkovenko Ilya on 28.05.2023
 */
data class TranslateState(
    val fromText: String = "",
    val toText: String? = null,
    val isTranslating: Boolean = false,
    val fromLanguage: UiLanguage = UiLanguage.byCode("ru"),
    val toLanguage: UiLanguage = UiLanguage.byCode("en"),
    val isChoosingFromLanguage: Boolean = false,
    val isChoosingToLanguage: Boolean = false,
    val error: TranslateError? = null,
    val history: List<UiHistoryItem> = emptyList()
)