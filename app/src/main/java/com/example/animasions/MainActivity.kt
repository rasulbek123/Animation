package com.example.animasions

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.graphics.drawable.toDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        setContentView(layout)
        val layoutLP = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT)
        val layout1 = LinearLayout(this)
        layout1.layoutParams = layoutLP
        layout1.weightSum = 2f
        val buttonLP  = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT,1f)
        val buttonaBatman = Button(this)
        val buttonSpay  = Button(this)
        buttonaBatman.layoutParams = buttonLP
        buttonSpay.layoutParams = buttonLP
        buttonaBatman.text = "Batman"
        buttonSpay.text = "Spayderman"
        layout1.addView(buttonaBatman)
        layout1.addView(buttonSpay)
        layout.addView(layout1)
        val layout2 = LinearLayout(this)
        layout2.layoutParams = layoutLP
        layout2.weightSum = 2f
        val buttonHulk = Button(this)
        val buttonCapitan = Button(this)
        buttonHulk.layoutParams = buttonLP
        buttonCapitan.layoutParams = buttonLP
        buttonHulk.text = "Combp"
        buttonCapitan.text = "Trans"
        layout2.addView(buttonHulk)
        layout2.addView(buttonCapitan)
        layout.addView(layout2)
        val layout3 = LinearLayout(this)
        layout3.layoutParams = layoutLP
        val imageBatman = ImageView(this)

    }
}