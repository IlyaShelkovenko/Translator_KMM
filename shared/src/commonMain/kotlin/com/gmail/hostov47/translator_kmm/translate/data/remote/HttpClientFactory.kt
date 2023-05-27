package com.gmail.hostov47.translator_kmm.translate.data.remote

import io.ktor.client.HttpClient

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
expect class HttpClientFactory {
    fun create(): HttpClient
}