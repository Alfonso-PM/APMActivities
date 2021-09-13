package com.poapm.apm_activities

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class FullImageFragment : Fragment(R.layout.fragment_full_image) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        var contador: Int = 0


        val str = requireArguments().getString("Contador2")!!
        contador = Integer.parseInt(str)

        showImg(contador)

    }

    private lateinit var myImagen: ImageView

    private fun initViews() {
        myImagen = requireView().findViewById(R.id.imgFull)
    }

    private fun showImg(conta : Int){
        myImagen.setImageResource(Image.images[conta].resource)
    }


}