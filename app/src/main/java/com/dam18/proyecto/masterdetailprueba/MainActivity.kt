package com.dam18.proyecto.masterdetailprueba

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

import android.os.Bundle


class  MainActivity : AppCompatActivity() {

    //tenemos una activity que realiza diferentes funciones si esta en landscape o portrait
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //si la activity principal esta en landscape muestra un toast y el fragment
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
            //si pulsamos el boton en landscape refresca el fragment
            if(txthorizontal != null){
                   supportFragmentManager
                        .beginTransaction()
                        .add(R.id.fragment, Fragment.newInstance(), "Detalle")
                        .commit()


                //si pulsamos el boton en portrait nos lleva a una nueva activity
            }else{
                startActivity(intentFor<NewActivity>("id" to 5).singleTop())
            }


        }


    }
}
