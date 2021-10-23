    package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*

        val rollButton: Button = findViewById(R.id.button3)

        rollButton.setOnClickListener {
              rollDice()
        }

         */

        // TODO: Re-write this with ViewBinding

        findViewById<Button?>(R.id.button3).setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // Create new Dice object with sides and roll it
        val dice = Dice(numSides = 6)

        findViewById<TextView?>(R.id.textView).text = dice.roll().toString()
    }
}