package com.gmail.hostov47.translator_kmm.di

import com.gmail.hostov47.translator_kmm.database.TranslateDatabase
import com.gmail.hostov47.translator_kmm.translate.data.history.SqlDelightHistoryDataSource
import com.gmail.hostov47.translator_kmm.translate.data.local.DatabaseDriverFactory
import com.gmail.hostov47.translator_kmm.translate.data.remote.HttpClientFactory
import com.gmail.hostov47.translator_kmm.translate.data.translate.KtorTranslateClient
import com.gmail.hostov47.translator_kmm.translate.domain.history.HistoryDataSource
import com.gmail.hostov47.translator_kmm.translate.domain.translate.Translate
import com.gmail.hostov47.translator_kmm.translate.domain.translate.TranslateClient

/**
 * @author Shelkovenko Ilya on 04.06.2023
 */
class AppModule {
    val historyDataSource: HistoryDataSource by lazy {
        SqlDelightHistoryDataSource(
            TranslateDatabase(
                DatabaseDriverFactory().create()
            )
        )
    }

    private val translateClient: TranslateClient by lazy {
        KtorTranslateClient(
            HttpClientFactory().create()
        )
    }

    val translateUseCase: Translate by lazy {
        Translate(client = translateClient, historyDataSource = historyDataSource)
    }
}