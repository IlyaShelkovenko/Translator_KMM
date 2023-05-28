package com.gmail.hostov47.translator_kmm.core.presentation

import com.gmail.hostov47.translator_kmm.core.domain.language.Language

/**
 * @author Shelkovenko Ilya on 28.05.2023
 */
expect class UiLanguage {
    val language: Language

    companion object {
        fun byCode(langCode: String): UiLanguage
        val allLanguages: List<UiLanguage>
    }
}