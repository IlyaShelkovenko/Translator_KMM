package com.gmail.hostov47.translator_kmm.translate.data.local

import com.gmail.hostov47.translator_kmm.database.TranslateDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
actual class DatabaseDriverFactory {
    actual fun create(): SqlDriver {
        return NativeSqliteDriver(TranslateDatabase.Schema, "translate.db")
    }
}