package com.gmail.hostov47.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
expect class CommonMutableStateFlow<T>(flow: MutableStateFlow<T>) : MutableStateFlow<T>

fun <T> MutableStateFlow<T>.toCommonMutableStateFlow() = CommonMutableStateFlow(this)