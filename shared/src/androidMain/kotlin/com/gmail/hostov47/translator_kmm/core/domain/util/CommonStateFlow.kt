package com.gmail.hostov47.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.StateFlow

/**
* @author Shelkovenko Ilya on 27.05.2023
*/
actual class CommonStateFlow<T> actual constructor(
    private val flow: StateFlow<T>
) : StateFlow<T> by flow