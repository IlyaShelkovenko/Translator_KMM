package com.gmail.hostov47.translator_kmm.translate.domain.translate

import com.gmail.hostov47.translator_kmm.core.domain.language.Language

/**
 *
 * @author Shelkovenko Ilya on 27.05.2023
 */
interface TranslateClient {
    suspend fun translate(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language,
    ): String
}