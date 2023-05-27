package com.gmail.hostov47.translator_kmm.core.domain.util

import kotlinx.coroutines.flow.MutableStateFlow

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
class IOSMutableStateFlow<T>(
    initialValue: T
): CommonMutableStateFlow<T>(MutableStateFlow(initialValue))