package uz.gita.mindgameapp.db

import android.content.Context
import android.content.SharedPreferences

class MyBase private constructor() {

    companion object {
        private lateinit var myBase: MyBase

        private val SHARED_PREF = "shared_pref"
        private val COIN = "coin"

        private lateinit var pref: SharedPreferences
        private lateinit var editor: SharedPreferences.Editor

        fun getInstance(context: Context): MyBase {
            pref = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE)
            editor = pref.edit()

            if (!(::myBase.isInitialized))
                myBase = MyBase()
            return myBase
        }
    }

    var coin: Int
        get() = pref.getInt(COIN, 50)
        set(value) = editor.putInt(COIN, value).apply()
}