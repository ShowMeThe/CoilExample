package com.show.coilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.RoundedCornersTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://pic1.zhimg.com/v2-4bba972a094eb1bdc8cbbc55e2bd4ddf_1440w.jpg?source=172ae18b"

        btn.setOnClickListener {
            iv1.load(url){
                transformations(RoundedCornersTransformation(15f))
            }

            iv2.load(url){
                transformations(RoundedCornersTransformation(15f))
            }

        }

    }
}