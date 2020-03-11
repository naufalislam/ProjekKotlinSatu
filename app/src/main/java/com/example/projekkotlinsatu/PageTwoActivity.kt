package com.example.projekkotlinsatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_two.*

class PageTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_two)

        val getData = intent.getParcelableExtra<Identitas>("variable3")
        tvPageTwo.text="${getData.nama}\n"
            "${getData.umur}\n"
            "${getData.alamat}\n"
        getData.hobby

    }
}
