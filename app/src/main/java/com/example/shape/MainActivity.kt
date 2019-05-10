package com.example.shape

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var color: String
        btn_blue.setOnClickListener {
            color = "#3F51B5"
            getColor(color)
        }
        btn_green.setOnClickListener {
            color = "#419245"
            getColor(color)
        }
        btn_red.setOnClickListener {
            color = "#FF0000"
            getColor(color)
        }

    }

    fun getColor(color: String) {

        val backgroundDrawable =
            ContextCompat.getDrawable(this, R.drawable.shape)
        backgroundDrawable?.let {
            it.setTint(Color.parseColor(color))
            btn.background = it
        } ?: kotlin.run {
            btn.setBackgroundResource(R.drawable.shape)
        }

    }
}
