package com.dam18.proyecto.masterdetailprueba

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.toast
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {

    //al abrir la nueva activity muestra un toast que lo indica ademas de un fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        toast("Nueva Activity")

        val valor =intent.getIntExtra("id",0)
        textNew.setText(valor.toString())

        //muestra el fragment
        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.frameLayout, Fragment.newInstance(), "Detalle")
                    .commit()
        }
    }
}
