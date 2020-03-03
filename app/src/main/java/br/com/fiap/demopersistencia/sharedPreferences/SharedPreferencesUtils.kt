package br.com.fiap.demopersistencia.sharedPreferences

import android.content.Context
import kotlinx.android.synthetic.main.activity_menu.view.*

class SharedPreferencesUtils (context: Context) {

    val sharedPreferences = context
        .getSharedPreferences("MEU_APP", Context.MODE_PRIVATE)

    fun save(key: String, value: String) {
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun find(key: String): String? {
        return sharedPreferences.getString(key, null)
    }

    fun clear() {
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    fun delete(key: String) {
        val editor = sharedPreferences.edit()
        editor.remove(key)
        editor.apply()
    }

}