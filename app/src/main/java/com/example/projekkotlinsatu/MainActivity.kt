package com.example.projekkotlinsatu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.provider.MediaStore
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPage1.setOnClickListener {
            val toPageOne = Intent(this,PageOneActivity::class.java)
            toPageOne.putExtra("variable1","Kita belajar Inten")
            toPageOne.putExtra("variable2",273373)
            startActivity(toPageOne)
        }

        btnPage2.setOnClickListener {
            val identitas = Identitas("Pale",20,"Tegal","Ngoding")
            val toPageTwo=Intent(this,PageTwoActivity::class.java)
            toPageTwo.putExtra("variabe3",identitas)
            startActivity(toPageTwo)
        }

        btnPage3.setOnClickListener {
            val  samplePhone = "08189282629"
            val toPageThre = Intent(Intent.ACTION_DIAL, Uri.parse("tel$samplePhone"))
            startActivity(toPageThre)

            val toPageCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(toPageCamera)
        }


    }
}

@Parcelize
data class Identitas (
    val nama:String,
    val umur:Int,
    val alamat:String,
    val hobby:String
): Parcelable

