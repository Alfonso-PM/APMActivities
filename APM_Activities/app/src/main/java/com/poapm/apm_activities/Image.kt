package com.poapm.apm_activities

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize


@JsonClass(generateAdapter = true)
@Parcelize
class Image(var id: Int = 0,
            val info: Int,
            val resource: Int
): Parcelable {

    companion object {
        val images = arrayListOf(
            Image(1,R.string.text_foto1,R.drawable.ic_imageuno),
            Image(2,R.string.text_foto2,R.drawable.ic_imagedos),
            Image(3,R.string.text_foto3,R.drawable.ic_imagetres),
            Image(4,R.string.text_foto4,R.drawable.ic_imagecuatro),
            Image(5,R.string.text_foto5,R.drawable.ic_imagecinco),
            Image(6,R.string.text_foto6,R.drawable.imageseis),
            Image(7,R.string.text_foto7,R.drawable.imagesiete),
            Image(8,R.string.text_foto8,R.drawable.imageocho),
            Image(9,R.string.text_foto9,R.drawable.imagenueve),
            Image(10,R.string.text_foto10,R.drawable.imagediez)
        )
    }


    //fun validateImagen() = images.firstOrNull { (it.info == this.info && it.source == this.source)}


}