package com.example.projekkotlinsatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_one.*

class PageOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_one)

        val getDataSatu =  intent.getStringExtra("variable1")
        val getDataDua =  intent.getIntExtra("variable2", 2)

        tvPageOne.text="$getDataSatu $getDataDua"
    }
}
