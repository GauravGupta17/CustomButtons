package com.example.designtoolkit001

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_button)


        btOval.setOnClickListener {
            val intent = Intent(this,NextActivity::class.java)
            startActivity(intent)

        }



    }


}