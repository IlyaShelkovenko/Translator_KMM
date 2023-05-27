package com.gmail.hostov47.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.Flow

/**
* @author Shelkovenko Ilya on 27.05.2023
*/
actual class CommonFlow<T> actual constructor(
    private val flow: Flow<T>
) : Flow<T> by flow