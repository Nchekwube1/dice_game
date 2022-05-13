package com.example.googlecodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
            private lateinit var diceImage: ImageView

            override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)

                        val btnRoll: Button = findViewById(R.id.btn_roll)
                        btnRoll.setOnClickListener { rollDice() }
            }

            private fun rollDice() {
                        diceImage = findViewById(R.id.iv_diceImage)
                        val drawableResource =  when((1..6).random()){
                                 1 -> R.drawable.dice_1
                                 2 ->  R.drawable.dice_2
                                 3 -> R.drawable.dice_3
                                 4 -> R.drawable.dice_4
                                 5 -> R.drawable.dice_5
                                 6 -> R.drawable.dice_6
                                 else-> R.drawable.empty_dice

                        }

                        diceImage.setImageResource(drawableResource)
            }

}