package com.gmail.hostov47.translator_kmm.translate.data.local

import com.squareup.sqldelight.db.SqlDriver

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
expect class DatabaseDriverFactory {
    fun create(): SqlDriver
}