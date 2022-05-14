package com.example.googlecodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.example.googlecodelab.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
            private lateinit var diceImage: ImageView
            private lateinit var diceImage2: ImageView
            private lateinit var binding:ActivityMainBinding

            override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

                        diceImage =binding.ivDiceImage
                        diceImage2 = binding.ivDiceImage2
                        val btnRoll: Button = binding.btnRoll
                        btnRoll.setOnClickListener { rollDice() }

            }

            private fun rollDice() {
//                        diceImage2 = findViewById(R.id.iv)
                        val drawableResource =  when((1..6).random()){
                                 1 -> R.drawable.dice_1
                                 2 ->  R.drawable.dice_2
                                 3 -> R.drawable.dice_3
                                 4 -> R.drawable.dice_4
                                 5 -> R.drawable.dice_5
                                 6 -> R.drawable.dice_6
                                 else-> R.drawable.empty_dice

                        }
                        val drawableResource2 =  when((1..6).random()){
                                 1 -> R.drawable.dice_1
                                 2 ->  R.drawable.dice_2
                                 3 -> R.drawable.dice_3
                                 4 -> R.drawable.dice_4
                                 5 -> R.drawable.dice_5
                                 6 -> R.drawable.dice_6
                                 else-> R.drawable.empty_dice

                        }

                        diceImage.setImageResource(drawableResource)
                        diceImage2.setImageResource(drawableResource2)
            }

}