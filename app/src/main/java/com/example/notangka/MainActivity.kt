package com.example.notangka

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.net.URI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById(R.id.button)

        btn.setOnClickListener(View.OnClickListener {
           Toast.makeText(applicationContext, "Opening Telegram Bot", Toast.LENGTH_LONG).show()
            goToUrl("https://t.me/Lucy_OCR_bot")
        })
    }

    fun goToUrl(url: String){
        val uri: Uri = Uri.parse(url)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }
}