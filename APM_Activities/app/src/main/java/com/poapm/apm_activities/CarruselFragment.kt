package com.poapm.apm_activities

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout


class CarruselFragment : Fragment(R.layout.fragment_carrusel) {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private lateinit var carrusel: ConstraintLayout
    private lateinit var btnMrInfo: Button
    private lateinit var btnDerecha: ImageView
    private lateinit var btnIzquierda: ImageView
    private lateinit var imgPrincipal: ImageView


    private fun initView() {
        var contador : Int = 0
        carrusel = requireView().findViewById(R.id.clCarrusel)
        btnDerecha =  requireView().findViewById(R.id.imgSiguiente)
        btnIzquierda =  requireView().findViewById(R.id.imgAtras)
        imgPrincipal =  requireView().findViewById(R.id.imagesCarr)
        btnMrInfo =   requireView().findViewById(R.id.btnSelect)
        imgPrincipal.setImageResource(Image.images[contador].resource)

        btnDerecha.setOnClickListener{
            if(contador<=8){
                contador++
                imgPrincipal.setImageResource(Image.images[contador].resource)

            }else{
                contador=0
                imgPrincipal.setImageResource(Image.images[contador].resource)
            }
        }

        btnIzquierda.setOnClickListener{
            if (contador > 0) {
                contador--
                imgPrincipal.setImageResource(Image.images[contador].resource)
            } else {
                contador = 8
                imgPrincipal.setImageResource(Image.images[contador].resource)
            }
        }

        btnMrInfo.setOnClickListener{

            val infoFragment: Fragment = InfoFragment().apply {
                arguments = Bundle().apply {
                    putString("Contador", contador.toString())
                }
            }

            activity?.supportFragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, infoFragment)
                addToBackStack(null)
                commit()
            }
        }

    }





}