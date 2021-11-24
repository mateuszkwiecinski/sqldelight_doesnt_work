package com.firebase.doesntwork

import android.content.Context
import com.example.repro.Preference
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

fun main(context: Context) {
    val driver: SqlDriver = AndroidSqliteDriver(Database.Schema, context)
    val db = Database(driver = driver)
    db.preferencesQueries.insert(Preference(key = "key", value = "value"))
}
