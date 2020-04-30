package com.example.kotlintwocalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity() {

     private lateinit var one: EditText
     private lateinit var two: EditText
     private lateinit var result: TextView

     private lateinit var four: EditText
     private lateinit var five: EditText
     private lateinit var result2: TextView

     private lateinit var num1: EditText
     private lateinit var num2: EditText
     private lateinit var result3: TextView

     private lateinit var num3: EditText
     private lateinit var num4: EditText
     private lateinit var result4: TextView






     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         one = findViewById(R.id.one)

         two = findViewById(R.id.two)


         result = findViewById(R.id.result)

         four = findViewById(R.id.four)

         five = findViewById(R.id.five)

         result2 = findViewById(R.id.result2)

         num1 = findViewById(R.id.num1)

         num2 = findViewById(R.id.num2)

         result3 = findViewById(R.id.result3)

         num3 = findViewById(R.id.num3)

         num4 = findViewById(R.id.num4)

         result4 = findViewById(R.id.result4)


         equally.setOnClickListener{
             val res: Int = one.text.toString().toInt() + two.text.toString().toInt()
             result.text = res.toString()

             equally2.setOnClickListener {
                 val res: Int = four.text.toString().toInt() * five.text.toString().toInt()
                 result2.text = res.toString()

                 equally3.setOnClickListener {
                     val res: Int = num1.text.toString().toInt() - num2.text.toString().toInt()
                     result3.text = res.toString()

                     equally4.setOnClickListener {
                         val res: Int = num3.text.toString().toInt() / num4.text.toString().toInt()
                         result4.text = res.toString()
                     }
                 }

             }



         }



         }




         //            tvResult.text = ""
         //            tvExpression.append(string)
         //        } else {
         //            tvExpression.append(tvResult.text)
         //            tvExpression.append(string)
         //            tvResult.text = ""
     }




     //
     //        //Numbers
     //        tvOne.setOnClickListener { appendOnExpresstion("1", true) }
     //        tvTwo.setOnClickListener { appendOnExpresstion("2", true) }
     //        tvThree.setOnClickListener { appendOnExpresstion("3", true) }
     //        tvFour.setOnClickListener { appendOnExpresstion("4", true) }
     //        tvFive.setOnClickListener { appendOnExpresstion("5", true) }
     //        tvSix.setOnClickListener { appendOnExpresstion("6", true) }
     //        tvSeven.setOnClickListener { appendOnExpresstion("7", true) }
     //        tvEight.setOnClickListener { appendOnExpresstion("8", true) }
     //        tvNine.setOnClickListener { appendOnExpresstion("9", true) }
     //        tvZero.setOnClickListener { appendOnExpresstion("0", true) }
     //        tvDot.setOnClickListener { appendOnExpresstion(".", true) }
     //
     //        //Operators
     //        tvPlus.setOnClickListener { appendOnExpresstion("+", false) }
     //        tvMinus.setOnClickListener { appendOnExpresstion("-", false) }
     //        tvMul.setOnClickListener { appendOnExpresstion("*", false) }
     //        tvDivide.setOnClickListener { appendOnExpresstion("/", false) }
     //        tvOpen.setOnClickListener { appendOnExpresstion("(", false) }
     //        tvClose.setOnClickListener { appendOnExpresstion(")", false) }
     //
     //        tvClear.setOnClickListener {
     //            tvExpression.text = ""
     //            tvResult.text = ""
     //        }
     //
     //        tvBack.setOnClickListener {
     //            val string = tvExpression.text.toString()
     //            if(string.isNotEmpty()){
     //                tvExpression.text = string.substring(0,string.length-1)
     //            }
     //            tvResult.text = ""
     //        }
     //
     //        tvEquals.setOnClickListener {
     //            try {
     //
     //                val expression = ExpressionBuilder(tvExpression.text.toString()).build()
     //                val result = expression.evaluate()
     //                val longResult = result.toLong()
     //                if(result == longResult.toDouble())
     //                    tvResult.text = longResult.toString()
     //                else
     //                    tvResult.text = result.toString()
     //
     //            }catch (e:Exception){
     //                Log.d("Exception"," message : " + e.message )
     //            }
     //        }
     //
     //    }
     //
     //    fun appendOnExpresstion(string: String, canClear: Boolean) {
     //
     //        if(tvResult.text.isNotEmpty()){
     //            tvExpression.text = ""
     //        }
     //
     //        if (canClear) {
     //            tvResult.text = ""
     //            tvExpression.append(string)
     //        } else {
     //            tvExpression.append(tvResult.text)
     //            tvExpression.append(string)
     //            tvResult.text = ""
