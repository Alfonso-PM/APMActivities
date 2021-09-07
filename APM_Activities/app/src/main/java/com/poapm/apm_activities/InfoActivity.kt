package com.poapm.apm_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.widget.ImageView
import android.widget.TextView
import com.poapm.apm_activities.Image.Companion.images

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        initViews()

        val intent = intent
        val str = intent.getStringExtra("imgSelect")
        var contador: Int = Integer.parseInt(str)

        showImg(contador)
    }

    private lateinit var myImagen: ImageView
    private lateinit var infotxt: TextView

    private fun initViews() {

        myImagen = findViewById(R.id.imageSelec)
        infotxt = findViewById(R.id.txvInfo)

    }

    private fun showImg(conta : Int){
        myImagen.setImageResource(images[conta].resource)
        infotxt.setHint(images[conta].info)
    }
}