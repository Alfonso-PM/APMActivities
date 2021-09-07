package com.poapm.apm_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FullImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_image)

        initViews()

        val intent = intent
        val str = intent.getStringExtra("FullImage")
        var contador: Int = Integer.parseInt(str)

        showImg(contador)
    }

    private lateinit var myImagen: ImageView

    private fun initViews() {
        myImagen = findViewById(R.id.imgFull)
    }

    private fun showImg(conta : Int){
        myImagen.setImageResource(Image.images[conta].resource)
    }


}