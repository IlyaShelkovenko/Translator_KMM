package com.gmail.hostov47.translator_kmm.translate.data.history

import com.gmail.hostov47.translator_kmm.translate.domain.history.HistoryItem
import database.HistoryEntity

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
fun HistoryEntity.toHistoryItem(): HistoryItem{
    return HistoryItem(
        id = id,
        fromLanguageCode = fromLanguageCode,
        fromText = fromText,
        toLanguageCode = toLanguageCode,
        toText = toText
    )
}