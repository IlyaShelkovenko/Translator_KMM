package com.gmail.hostov47.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.Flow

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
expect class CommonFlow<T>(flow: Flow<T>): Flow<T>

fun <T> Flow<T>.toCommonFlow() = CommonFlow(this)