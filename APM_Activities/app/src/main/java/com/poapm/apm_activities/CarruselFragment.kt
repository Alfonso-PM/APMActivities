package com.poapm.apm_activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.squareup.moshi.Moshi
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout


class CarruselFragment : Fragment(R.layout.fragment_carrusel) {




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preferences = activity?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)!!
        soundFav = getSong()
        initView()
    }

    private lateinit var carrusel: ConstraintLayout
    private lateinit var btnMrInfo: Button
    private lateinit var btnDerecha: ImageView
    private lateinit var btnIzquierda: ImageView
    private lateinit var imgPrincipal: ImageView
    private lateinit var imgSong: ImageView
    private lateinit var soundFav:Image


    private val PREFS = "PREFS"
    private val FAVORITE_SOUND = "FAVORITE_SOUND"
    private lateinit var preferences: SharedPreferences
    private val moshi = Moshi.Builder().build()


    private fun initView() {
        var contador : Int = 0
        carrusel = requireView().findViewById(R.id.clCarrusel)
        btnDerecha =  requireView().findViewById(R.id.imgSiguiente)
        btnIzquierda =  requireView().findViewById(R.id.imgAtras)
        imgPrincipal =  requireView().findViewById(R.id.imagesCarr)
        btnMrInfo =   requireView().findViewById(R.id.btnSelect)
        imgSong =  requireView().findViewById(R.id.favSong)
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


        imgSong.setOnClickListener {
            Image.images[contador].sound?.let { playSound(it) }
        }


    }


    private fun getSong() =
        preferences.getString("FAVORITE_SOUND", null)?.let {
            return@let try {
                moshi.adapter(Image::class.java).fromJson(it)
            } catch (e: Exception) {
                Image()
            }
        } ?: Image()

    private fun playSound(sou: Int) = MediaPlayer.create(requireContext(), sou).start()





}