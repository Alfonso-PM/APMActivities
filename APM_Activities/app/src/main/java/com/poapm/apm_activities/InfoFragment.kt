package com.poapm.apm_activities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent;
import android.widget.ImageView
import android.widget.TextView
import com.poapm.apm_activities.Image.Companion.images
import androidx.constraintlayout.widget.ConstraintLayout
import android.content.SharedPreferences
import android.content.Context
import com.squareup.moshi.Moshi
import android.media.MediaPlayer




class InfoFragment : Fragment(R.layout.fragment_info) {

    private lateinit var myImagen: ImageView
    private lateinit var clImageInfo: ConstraintLayout
    private lateinit var infotxt: TextView
    private lateinit var star: ImageView
    private lateinit var song: ImageView


    private var starBool : Boolean = false
    private var songBool : Boolean = false


    private var onof: Boolean = false
    private var myId: Int = 0
    private lateinit var image:Image
    private lateinit var sound:Image

    private val PREFS = "PREFS"
    private val FAVORITE_IMAGE = "FAVORITE_IMAGE"
    private val FAVORITE_SOUND = "FAVORITE_SOUND"
    private lateinit var preferences: SharedPreferences
    private val moshi = Moshi.Builder().build()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        var contador: Int = 0
        preferences = activity?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)!!
        image = getImage()
        sound = getSong()

        val str = requireArguments().getString("Contador")!!
        contador = Integer.parseInt(str)


        if(image.resource == images[contador].resource) {

            star.setImageResource(R.drawable.ic_estrellaon)
            starBool = true
        }
        else
        {
            star.setImageResource(R.drawable.ic_estrellaoff)
            starBool = false
        }

        if(sound.resource == images[contador].resource) {

            song.setImageResource(R.drawable.ic_songon)
            songBool = true
        }
        else
        {
            song.setImageResource(R.drawable.ic_songoff)
            songBool = true
        }


        ShowFull(contador)
        showImg(contador)
        images[contador].sound?.let { playSound(it) }

        btnstar(contador)
        btnsoundfav(contador)
    }



    private fun initView() {
        clImageInfo = requireView().findViewById(R.id.clTXInfo)

        myImagen = requireView().findViewById(R.id.imageSelec)
        infotxt = requireView().findViewById(R.id.txvInfo)
        star = requireView().findViewById(R.id.imgEstrellita)
        song = requireView().findViewById(R.id.imgSound)
    }

    private fun showImg(conta : Int){
        myImagen.setImageResource(images[conta].resource)
        infotxt.setHint(images[conta].info)

    }


    private fun playSound(sound: Int) = MediaPlayer.create(requireContext(), sound).start()

    private fun ShowFull(contador2 : Int){
        myImagen.setOnClickListener{

            val fullImageFragment: Fragment = FullImageFragment().apply {
                arguments = Bundle().apply {
                    putString("Contador2", contador2.toString())
                }
            }

            activity?.supportFragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, fullImageFragment)
                addToBackStack(null)
                commit()
            }
        }
    }

    private fun btnsoundfav(conta: Int) {
        song.setOnClickListener{
            saveSong(images[conta])
            song.setImageResource(R.drawable.ic_songon)
        }
    }

    private fun saveSong(sound: Image) {
        if (songBool){
            song.setImageResource(R.drawable.ic_songoff)
            preferences.edit().putString("FAVORITE_SOUND",moshi.adapter(Image::class.java).toJson(Image (0,0,0,0))).apply()
            songBool=false
        }
        else{
            song.setImageResource(R.drawable.ic_songon)
            preferences.edit().putString("FAVORITE_SOUND",moshi.adapter(Image::class.java).toJson(sound)).apply()
            songBool= true
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

    private fun btnstar(conta: Int){
        star.setOnClickListener{
            saveImage(images[conta])
            star.setImageResource(R.drawable.ic_estrellaon)
        }
    }


    private fun saveImage(image: Image) {

        if (starBool){
            star.setImageResource(R.drawable.ic_estrellaoff)
            preferences.edit().putString("FAVORITE_IMAGE",moshi.adapter(Image::class.java).toJson(Image (0,0,0,0))).apply()
            starBool=false
        }
        else{
            star.setImageResource(R.drawable.ic_estrellaon)
            preferences.edit().putString("FAVORITE_IMAGE",moshi.adapter(Image::class.java).toJson(image)).apply()
            starBool= true
        }

    }


    private fun getImage() =
        preferences.getString("FAVORITE_IMAGE", null)?.let {
            return@let try {
                moshi.adapter(Image::class.java).fromJson(it)
            } catch (e: Exception) {
                Image()
            }
        } ?: Image()
}