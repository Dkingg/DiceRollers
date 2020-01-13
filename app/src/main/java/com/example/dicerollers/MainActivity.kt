package com.example.dicerollers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

   lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice()}
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)


//        val countButtons: Button = findViewById(R.id.count_button)
  //      countButtons.setOnClickListener { countDiceUp() }

    //    val resetButtons: Button = findViewById(R.id.reset_button)
      //  resetButtons.setOnClickListener { resetUp() }


    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked",
          //      Toast.LENGTH_SHORT).show()


      //  val randomInt = Random().nextInt(6) + 1


        //val drawableResource = when (randomInt) {
          //  1 -> R.drawable.dice_1
            //2 -> R.drawable.dice_2
            //3 -> R.drawable.dice_3
            //4 -> R.drawable.dice_4
            //5 -> R.drawable.dice_5
            //else -> R.drawable.dice_6
       diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        }
        //val resultText: TextView = findViewById(R.id.result_text)

        //resultText.text = randomInt.toString()

       // diceImage.setImageResource(drawableResource)

    private fun getRandomDiceImage() : Int {
        val randomInt = Random().nextInt(6) + 1

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }


    }





//    private fun countDiceUp() {
  //      val resultText: TextView = findViewById(R.id.result_text)

        //If text is the default "Hello World!", set that text to 1
        //if (resultText.text == "Hello World!") {
          //  resultText.text = "1"
        //} else {
            // Otherwise increment of the number up to 6
            // The text value in resultText.text is an instance of the CharSequence class;
            // It needs to be converted to a String object before it can be connected to an int.
            //var  resultInt = resultText.text.toString().toInt()

           // if (resultInt < 6) {
              //  resultInt++
            //    resultText.text = resultInt.toString()
          //  }
        //    }
      //  }
        //val randomInts = Random().nextInt(6) + 1
        //val randomAdd = randomInts + 1
        //if (randomInts < 6) {
    //        resultText.text = randomAdd.toString()
        //}
        //else {

          //  resultText.text = 1.toString()
        //}

    //private fun resetUp() {
        //val resultText: TextView = findViewById(R.id.result_text)

      //  val resultInts = "0"

    //    resultText.text = resultInts

  //  }
//


