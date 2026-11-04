package com.example.higgsemployeeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONObject

class PostmessagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_postmessages)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Step1: Find the 2 edit texts by their id names.
        val editNickname : EditText = findViewById(R.id.nickname)
        val editMessage : EditText = findViewById(R.id.postmess)

        //Step2: Find MessagesButton and assign it the listener.
        val messageButton: Button = findViewById(R.id.message)
        messageButton.setOnClickListener {

        //Step3: Create a JSONObject, and put data from the editText.
            //Key(insomnia),Values from the editTexts as strings.
            val payload = JSONObject()
            payload.put( "nickname",editNickname.text.toString())
            payload.put( "postmess",editMessage.text.toString())


            val api = "https://modcom.pythonanywhere.com/posts"

            val helperObject = ApiHelper(applicationContext)
            helperObject.post(api,payload)

            //ON THE MANIFEST,ALLOW INTERNET PERMISSION.
        }
        //Messages LISTENER ENDS HERE
    }
    //ON CREATE-LISTENER ENDS HERE
}