package br.com.fiap.demopersistencia.sharedPreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.demopersistencia.R
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val sharedPreferencesUtils = SharedPreferencesUtils(this)

        btSave.setOnClickListener {
            sharedPreferencesUtils.save("nome", etName.text.toString())
            etName.setText("")
        }

        btDelete.setOnClickListener {
            sharedPreferencesUtils.delete("nome")
            etName.setText("")
        }

        btRecover.setOnClickListener {
            etName.setText(sharedPreferencesUtils.find("nome"))
        }
    }
}
