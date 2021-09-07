package com.poapm.apm_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.widget.ImageView
import android.widget.TextView
import com.poapm.apm_activities.Image.Companion.images
import android.content.SharedPreferences
import android.content.Context
import com.squareup.moshi.Moshi

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        preferences = getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        myImgFavorite = getImage()
        initViews()


        val intent = intent
        val str = intent.getStringExtra("imgSelect")
        var contador: Int = Integer.parseInt(str)

        /*if(myImgFavorite.id != null) {  //LA APLICACIÓN ME TRUENA CON ESTE CODIGO Y NO ME GUARDA LA PREFERENCIA
            if (myImgFavorite.id.equals(image.id))
                star.setImageResource(R.drawable.ic_estrellaon)
            else
                star.setImageResource(R.drawable.ic_estrellaoff)
        }*/

        showImg(contador)
        ShowFull(contador)
    }



    private lateinit var myImagen: ImageView
    private lateinit var infotxt: TextView
    private lateinit var star: ImageView


    private var onof: Boolean = false
    private var myId: Int = 0
    private lateinit var image:Image
    private lateinit var myImgFavorite:Image
    private val PREFS = "MY_PREFERENCES"
    private val IMAGE_PREFS = "FAVORITE_IMAGE"
    private lateinit var preferences: SharedPreferences
    private val moshi = Moshi.Builder().build()

    private fun saveImage(image: Image) {
        preferences.edit().putString(IMAGE_PREFS, moshi.adapter(Image::class.java).toJson(image)).apply()
        star.setImageResource(R.drawable.ic_estrellaon)
    }


    private fun getImage() =
        preferences.getString(IMAGE_PREFS, null).let {
            return@let try{
                moshi.adapter(Image::class.java).fromJson(it)
            } catch (e: Exception){
                Image()
            }
        } ?: Image()


    private fun initViews() {

        myImagen = findViewById(R.id.imageSelec)
        infotxt = findViewById(R.id.txvInfo)
        star = findViewById(R.id.imgEstrellita)

        onof=btnstar(onof)
    }

    private fun showImg(conta : Int){
        myImagen.setImageResource(images[conta].resource)
        infotxt.setHint(images[conta].info)
    }

    private fun ShowFull(contador2 : Int){
        myImagen.setOnClickListener{

            val intent = Intent(this, FullImage::class.java).apply { putExtra("FullImage", contador2.toString()) }

            startActivity(intent)
        }
    }


    private fun btnstar(onof: Boolean): Boolean{
        var onofValue : Boolean = onof
        star.setOnClickListener {
            if (onofValue == false){
                onofValue = true
                star.setImageResource(R.drawable.ic_estrellaon)
            }
            else{
                if(onofValue==true){
                    onofValue=false
                    star.setImageResource(R.drawable.ic_estrellaoff)
                }
            }
        }

        return onofValue

        //saveImage()
    }


}