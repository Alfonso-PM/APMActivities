package com.poapm.apm_activities

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize


@JsonClass(generateAdapter = true)
@Parcelize
class Image(var id: Int = 0,
            val info: Int = 0,
            val resource: Int = 0,
            val sound: Int = 0
): Parcelable {

    companion object {
        val images = arrayListOf(
            Image(0, R.string.text_foto1, R.drawable.ic_imageuno, R.raw.dinouno),
            Image(1, R.string.text_foto2, R.drawable.ic_imagedos, R.raw.dinodos),
            Image(2, R.string.text_foto3, R.drawable.ic_imagetres, R.raw.dinotres),
            Image(3, R.string.text_foto4, R.drawable.ic_imagecuatro, R.raw.dinocuatro),
            Image(4, R.string.text_foto5, R.drawable.ic_imagecinco, R.raw.dinocinco),
            Image(5, R.string.text_foto6, R.drawable.imageseis, R.raw.dinoseis),
            Image(6, R.string.text_foto7, R.drawable.imagesiete, R.raw.dinosiete),
            Image(7, R.string.text_foto8, R.drawable.imageocho, R.raw.dinoocho),
            Image(8, R.string.text_foto9, R.drawable.imagenueve, R.raw.dinonueve),
            Image(9, R.string.text_foto10, R.drawable.imagediez, R.raw.dinodiez)
        )
    }
}