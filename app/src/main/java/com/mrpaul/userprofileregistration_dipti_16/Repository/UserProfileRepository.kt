package com.mrpaul.userprofileregistration_dipti_16.Repository

import androidx.lifecycle.LiveData
import com.mrpaul.userprofileregistration_dipti_16.Dao.UserProfileDao
import com.mrpaul.userprofileregistration_dipti_16.Model.UserProfile

class UserProfileRepository(private val userProfileDao: UserProfileDao) {
    fun getUserProfiles(): LiveData<List<UserProfile>> {
        return userProfileDao.getAllUserProfiles()
    }

    suspend fun insert(userProfile: UserProfile) {
        userProfileDao.insert(userProfile)
    }

    suspend fun update(userProfile: UserProfile) {
        userProfileDao.update(userProfile)
    }

    suspend fun delete(userProfile: UserProfile) {
        userProfileDao.delete(userProfile)
    }
}