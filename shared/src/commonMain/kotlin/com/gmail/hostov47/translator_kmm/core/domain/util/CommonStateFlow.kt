package com.gmail.hostov47.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.StateFlow

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
expect class CommonStateFlow<T>(flow: StateFlow<T>) : StateFlow<T>

fun <T> StateFlow<T>.toCommonStateFlow() = CommonStateFlow(this)