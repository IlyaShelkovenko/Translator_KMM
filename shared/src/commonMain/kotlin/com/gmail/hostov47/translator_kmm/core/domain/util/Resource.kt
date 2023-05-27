package com.gmail.hostov47.translator_kmm.core.domain.util

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
sealed class Resource<T>(val data: T?, val throwable: Throwable? = null) {
    class Success<T>(data: T): Resource<T>(data)
    class Error<T>(throwable: Throwable): Resource<T>(null, throwable)
}