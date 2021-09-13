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




class InfoFragment : Fragment(R.layout.fragment_info) {

    private lateinit var myImagen: ImageView
    private lateinit var clImageInfo: ConstraintLayout
    private lateinit var infotxt: TextView
    private lateinit var star: ImageView





    private var onof: Boolean = false
    private var myId: Int = 0
    private lateinit var image:Image
    private lateinit var myImgFavorite:Image
    private val PREFS = "PREFS"
    private val FAVORITE_IMAGE = "FAVORITE_IMAGE"
    private lateinit var preferences: SharedPreferences
    private val moshi = Moshi.Builder().build()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        var contador: Int = 0
        preferences = activity?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)!!
        image = getImage()

        val str = requireArguments().getString("Contador")!!
        contador = Integer.parseInt(str)


        if(image.resource == images[contador].resource) {

            star.setImageResource(R.drawable.ic_estrellaon)
        }
        else
        {
            star.setImageResource(R.drawable.ic_estrellaoff)
        }


        ShowFull(contador)
        showImg(contador)

        btnstar(contador)
    }

    private fun initView() {
        clImageInfo = requireView().findViewById(R.id.clTXInfo)

        myImagen = requireView().findViewById(R.id.imageSelec)
        infotxt = requireView().findViewById(R.id.txvInfo)
        star = requireView().findViewById(R.id.imgEstrellita)
        //ivAddSound = requireView().findViewById(R.id.ivAddSound)

    }

    private fun showImg(conta : Int){
        myImagen.setImageResource(images[conta].resource)
        infotxt.setHint(images[conta].info)
    }

    private fun ShowFull(contador2 : Int){
        myImagen.setOnClickListener{

            val fullImageFragment: Fragment = FullImageFragment().apply {
                arguments = Bundle().apply {
                    putString("FullImage", contador2.toString())
                }
            }

            activity?.supportFragmentManager?.beginTransaction()?.apply {
                replace(R.id.container, FullImageFragment())
                addToBackStack(null)
                commit()
            }
        }
    }


    private fun btnstar(conta: Int){

        var starValue= false

        star.setOnClickListener{
            saveImage(images[conta])
            star.setImageResource(R.drawable.ic_estrellaon)
        }
    }


    private fun saveImage(image: Image) {
        preferences.edit().putString("FAVORITE_IMAGE",moshi.adapter(Image::class.java).toJson(image)).apply()

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