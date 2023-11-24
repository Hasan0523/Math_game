package com.said.math_game.util

import android.content.Context

class SharedPref private constructor(context: Context) {
    private val shared=context.getSharedPreferences( "app_shared",0)
    private  val edit = shared.edit()

    companion object {
        private var instance: SharedPref? =null
         fun getInstance(context: Context): SharedPref? {
            if (instance == null) instance = SharedPref(context)
            return instance !!
        }
    }
    fun getHighScore(level: Int){
        shared.getInt("hs$level", 0)
    }
    fun getRecord(level: Int): Int{
        return shared.getInt("record$level", 0)
    }
    fun getRecords(level: Int, score:Int){
        edit.putInt("record$level", score).apply()
    }
    fun setHighScore(level: Int, score:Int){
        edit.putInt("hs$level", score).apply()
    }

    fun getRecords(level: Int,score: Int): Any {
        edit.

    }
}