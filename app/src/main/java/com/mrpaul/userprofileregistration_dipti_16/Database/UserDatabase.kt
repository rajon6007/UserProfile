package com.mrpaul.userprofileregistration_dipti_16.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mrpaul.userprofileregistration_dipti_16.Dao.UserProfileDao
import com.mrpaul.userprofileregistration_dipti_16.Model.UserProfile

@Database(entities = [UserProfile::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null

        fun getDatabase(context: Context): UserDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}