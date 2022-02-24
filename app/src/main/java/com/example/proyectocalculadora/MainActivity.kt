package com.example.proyectocalculadora

import android.content.ContentValues
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var res: Double = 0.0
    private var operacion: Int = 0
    private var decimalApretado: Boolean = false

    private var pantalla: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonCero: Button = findViewById<Button>(R.id.button_0)
        val botonUno: Button = findViewById<Button>(R.id.button_1)
        val botonDos: Button = findViewById<Button>(R.id.button_2)
        val botonTres: Button = findViewById<Button>(R.id.button_3)
        val botonCuatro: Button = findViewById<Button>(R.id.button_4)
        val botonCinco: Button = findViewById<Button>(R.id.button_5)
        val botonSeis: Button = findViewById<Button>(R.id.button_6)
        val botonSiete: Button = findViewById<Button>(R.id.button_7)
        val botonOcho: Button = findViewById<Button>(R.id.button_8)
        val botonNueve: Button = findViewById<Button>(R.id.button_9)

        val botonDecimal: Button = findViewById<Button>(R.id.button_decimal)

        val botonSuma: Button = findViewById<Button>(R.id.button_plus)
        val botonResta: Button = findViewById<Button>(R.id.button_minus)
        val botonMult: Button = findViewById<Button>(R.id.button_times)
        val botonDiv: Button = findViewById<Button>(R.id.button_divide)

        val botonBorrar: Button = findViewById<Button>(R.id.button_clear)
        val botonIgual: Button = findViewById<Button>(R.id.button_equal)

        pantalla = findViewById<TextView>(R.id.textView_resultado)
        pantalla?.freezesText = true

        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            botonCero.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonUno.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonDos.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonTres.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonCuatro.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonCinco.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonSeis.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonSiete.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonOcho.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonNueve.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonDecimal.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonSuma.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonResta.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonMult.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonDiv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonBorrar.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            botonIgual.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10F)
            pantalla?.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30F)
        }
//        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
//            pantalla?.freezesText = true
//        }

        botonCero.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}0"
            }
        })
        botonUno.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}1"
            }
        })
        botonDos.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}2"
            }
        })
        botonTres.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}3"
            }
        })
        botonCuatro.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}4"
            }
        })

        botonCinco.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}5"
            }
        })

        botonSeis.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}6"
            }
        })

        botonSiete.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}7"
            }
        })

        botonOcho.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}8"
            }
        })

        botonNueve.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (pantalla?.text=="0"){
                    pantalla?.text = ""
                }
                pantalla?.text = "${pantalla?.text}9"
            }
        })

        botonDecimal.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                if (!decimalApretado){
                    pantalla?.text = "${pantalla?.text}."
                    decimalApretado = true
                }
            }
        })

        botonSuma.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0 : View?) {
                num1 = pantalla?.text.toString().toDouble()
                operacion = 1
                pantalla?.text = "0"
                decimalApretado = false
            }
        })

        botonResta.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0 : View?) {
                num1 = pantalla?.text.toString().toDouble()
                operacion = 2
                pantalla?.text = "0"
                decimalApretado = false
            }
        })

        botonMult.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0 : View?) {
                num1 = pantalla?.text.toString().toDouble()
                operacion = 3
                pantalla?.text = "0"
                decimalApretado = false
            }
        })

        botonDiv.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0 : View?) {
                num1 = pantalla?.text.toString().toDouble()
                operacion = 4
                pantalla?.text = "0"
                decimalApretado = false
            }
        })

        botonBorrar.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0 : View?) {
                num1 = 0.0
                num2 = 0.0
                operacion = 0
                pantalla?.text = "0"
                decimalApretado = false
            }
        })

        botonIgual.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0 : View?) {
                if (operacion != 0){
                    num2 = pantalla?.text.toString().toDouble()
                    res = when (operacion){
                        1 -> num1 + num2
                        2 -> num1 - num2
                        3 -> num1 * num2
                        else -> num1 / num2
                    }

                    operacion = 0
                    pantalla?.setText(res.toString())
                    decimalApretado = false
                }

            }
        })
    }

    override fun onStart() {
        Log.d(ContentValues.TAG, "onStart")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(ContentValues.TAG, "onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.d(ContentValues.TAG, "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(ContentValues.TAG, "onPause")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Log.d(ContentValues.TAG, "onSaveInstanceState")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onStop() {
        Log.d(ContentValues.TAG, "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(ContentValues.TAG, "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(ContentValues.TAG, "onDestroy")
        super.onDestroy()
    }


}