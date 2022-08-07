package com.mortuzahossain.mobilenumbervalidator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mortuzahossain.validator.Validate.getOperatorName
import com.mortuzahossain.validator.Validate.isValidPhoneNumber
import com.mortuzahossain.validator.insertPhoneMask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val textView = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.button).setOnClickListener {
            val number = findViewById<EditText>(R.id.editTextPhone).text.toString()
            if (number.isValidPhoneNumber()){
                textView.text = "Valid Mobile Number"
            } else {
                textView.text = "Invalid Mobile Number"
            }
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            val number = findViewById<EditText>(R.id.editTextPhone).text.toString()
            textView.text = number.getOperatorName().name
        }

        findViewById<EditText>(R.id.editTextPhone).insertPhoneMask()

    }
}