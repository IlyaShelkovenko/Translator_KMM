package com.gmail.hostov47.translator_kmm.translate.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
actual class HttpClientFactory {
    actual fun create(): HttpClient {
        return HttpClient(Android){
            install(ContentNegotiation){
                json()
            }
        }
    }
}