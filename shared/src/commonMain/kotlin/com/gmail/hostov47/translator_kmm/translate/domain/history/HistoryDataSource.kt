package com.gmail.hostov47.translator_kmm.translate.domain.history

import com.gmail.hostov47.translator_kmm.core.domain.util.CommonFlow

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
interface HistoryDataSource {
    fun getHistory(): CommonFlow<List<HistoryItem>>
    suspend fun insertHistoryItem(item: HistoryItem)
}