package com.example.core

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesManager(context: Context) {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(Constants.PREFS_NAME, Context.MODE_PRIVATE)

    fun saveUserName(userName: String) {
        sharedPreferences.edit().putString(Constants.USER_NAME, userName).apply()
    }

    fun getUserName(): String? {
        return sharedPreferences.getString(Constants.USER_NAME, null)
    }

    fun removeUserName() {
        sharedPreferences.edit().remove(Constants.USER_NAME).apply()
    }

    fun containsUserName(): Boolean {
        return sharedPreferences.contains(Constants.USER_NAME)
    }
}