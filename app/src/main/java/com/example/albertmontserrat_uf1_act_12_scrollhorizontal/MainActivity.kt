package com.example.albertmontserrat_uf1_act_12_scrollhorizontal

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.HorizontalScrollView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Trobar el ToggleButton per la seva ID
        val toggleScroll: ToggleButton = findViewById(R.id.toggleScroll)

        // Trobar el HorizontalScrollView per la seva ID
        val horizontalScrollView: HorizontalScrollView = findViewById(R.id.horizontalScrollView)

        toggleScroll.setOnCheckedChangeListener { _: CompoundButton, isChecked: Boolean ->
            if (isChecked) {
                horizontalScrollView.isHorizontalScrollBarEnabled = true
            } else {
                horizontalScrollView.isHorizontalScrollBarEnabled = false
            }
        }
    }
}

