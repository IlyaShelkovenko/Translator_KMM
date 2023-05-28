package com.gmail.hostov47.translator_kmm.translate.domain.translate

import com.gmail.hostov47.translator_kmm.core.domain.language.Language
import com.gmail.hostov47.translator_kmm.core.domain.util.Resource
import com.gmail.hostov47.translator_kmm.translate.domain.history.HistoryDataSource
import com.gmail.hostov47.translator_kmm.translate.domain.history.HistoryItem

/**
 * @author Shelkovenko Ilya on 28.05.2023
 */
class Translate(
    private val client: TranslateClient,
    private val historyDataSource: HistoryDataSource
) {
    suspend fun execute(
        fromLanguage: Language,
        fromText: String,
        toLanguage: Language
    ): Resource<String> {
        return try {
           val translatedText = client.translate(
               fromLanguage = fromLanguage,
               fromText = fromText,
               toLanguage = toLanguage
           )
            historyDataSource.insertHistoryItem(
                HistoryItem(
                    id = null,
                    fromLanguageCode = fromLanguage.langCode,
                    fromText = fromText,
                    toLanguageCode = toLanguage.langCode,
                    toText = translatedText
                )
            )
            return Resource.Success(translatedText)
        } catch (ex: TranslateException){
            ex.printStackTrace()
            Resource.Error(ex)
        }
    }
}