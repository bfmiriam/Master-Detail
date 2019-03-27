package com.dam18.proyecto.masterdetailprueba

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

import android.os.Bundle


class                MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (txthorizontal != null) {
            toast("Horizontal")

            if (savedInstanceState == null) {
                supportFragmentManager
                        .beginTransaction()
                        .add(R.id.fragment, Fragment.newInstance(), "Detalle")
                        .commit()
            }
        }


        NuevaActivity.setOnClickListener {
            if(txthorizontal != null){
                   supportFragmentManager
                        .beginTransaction()
                        .add(R.id.fragment, Fragment.newInstance(), "Detalle")
                        .commit()

            }else{
                startActivity(intentFor<NewActivity>("id" to 5).singleTop())
            }


        }


    }
}
