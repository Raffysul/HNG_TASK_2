package com.example.hngtask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.method.MovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val linkView = findViewById<TextView>(R.id.web_link)
            linkView.setMovementMethod(LinkMovementMethod.getInstance())

        var EditText = findViewById(R.id.EditText) as EditText
        var button = findViewById(R.id.button) as Button

        button.setOnClickListener {
            val username = EditText.text;
            Toast.makeText(this@MainActivity, username, Toast.LENGTH_LONG).show()

        }
    }

}