package com.gmail.hostov47.translator_kmm.translate.domain.translate

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
enum class TranslateError {
    SERVICE_UNAVAILABLE,
    CLIENT_ERROR,
    SERVER_ERROR,
    UNKNOWN_ERROR
}

class TranslateException(val error: TranslateError): Exception("An error occurred when translating: $error")