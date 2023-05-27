package com.gmail.hostov47.translator_kmm.translate.data.local

import android.content.Context
import com.gmail.hostov47.translator_kmm.database.TranslateDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

/**
 * @author Shelkovenko Ilya on 27.05.2023
 */
actual class DatabaseDriverFactory(
    private val context: Context
){
    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(TranslateDatabase.Schema, context, "translate.db")
    }
}