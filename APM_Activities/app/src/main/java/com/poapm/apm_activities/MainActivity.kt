package com.poapm.apm_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.poapm.apm_activities.Image.Companion.images

class MainActivity : AppCompatActivity() {

    private lateinit var image: Image
    var contador : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private lateinit var btnDerecha: ImageView
    private lateinit var btnIzquierda: ImageView
    private lateinit var imgPrincipal: ImageView
    private lateinit var btnMrInfo: Button

    private fun initViews() {
        btnDerecha = findViewById(R.id.imgSiguiente)
        btnIzquierda = findViewById(R.id.imgAtras)
        imgPrincipal = findViewById(R.id.imagesCarr)
        btnMrInfo =  findViewById(R.id.btnSelect)
        imgPrincipal.setImageResource(images[contador].resource)

        Change()

    }

    private fun Minfon(){
        btnMrInfo.setOnClickListener{

        }
    }


    private fun Change() {
        btnDerecha.setOnClickListener{
                if(contador<=8){
                        contador++
                        imgPrincipal.setImageResource(images[contador].resource)
                    }else{
                            contador=0
                            imgPrincipal.setImageResource(images[contador].resource)
                    }
        }


        btnIzquierda.setOnClickListener{
            if(contador>0){
                contador--
                imgPrincipal.setImageResource(images[contador].resource)
            }else{
                    contador=8
                    imgPrincipal.setImageResource(images[contador].resource)
            }
        }


    }


    private fun Select(conta: Int){
            /*image.apply {
                this.id = conta
            }

            showImage()*/
    }
    private fun showImage(){
       /* imgPrincipal = findViewById(R.id.imagesCarr)
        imgPrincipal.setImageResource(image.source)*/
    }




}