    package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDice()
        /*

        val rollButton: Button = findViewById(R.id.button3)

        rollButton.setOnClickListener {
              rollDice()
        }

         */

        // TODO: Re-write this with ViewBinding

        findViewById<Button?>(R.id.button).setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // Create new Dice object with sides and roll it
        val dice = Dice(numSides = 6)

        // Try to refactor this code


        // Determine which drawable resource should be used based on dice roll result
        val imageResource = when (dice.roll()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }

        findViewById<ImageView?>(R.id.imageView).setImageResource(imageResource)
    }
}