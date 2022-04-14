package com.johannliebert.jisho.feature_joshi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.johannliebert.jisho.feature_joshi.data.local.entity.WordInfoEntity
import com.johannliebert.jisho.feature_joshi.data.remote.dto.WordInfoDto


@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class WordInfoDatabase : RoomDatabase() {
    abstract val dao:WordInfoDao
}