package com.example.higgsemployeeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val postButton:Button = findViewById(R.id.post)
        postButton.setOnClickListener {
            val postIntent = Intent( applicationContext,PostActivity::class.java )
            startActivity(postIntent)
        }
        //END POST LISTENER

        val getButton:Button = findViewById(R.id.get)
        getButton.setOnClickListener {
            val getIntent = Intent( applicationContext,GetActivity::class.java )
            startActivity(getIntent)
        }
        //END GET LISTENER

        val putButton:Button = findViewById(R.id.put)
        putButton.setOnClickListener {
            val putIntent = Intent( applicationContext,PutActivity::class.java )
            startActivity(putIntent)
        }
        //END PUT LISTENER

        val deleteButton:Button = findViewById(R.id.delete)
        deleteButton.setOnClickListener {
            val deleteIntent = Intent( applicationContext,DeleteActivity::class.java )
            startActivity(deleteIntent)
        }
        //END DELETE LISTENER

        val messagesButton:Button = findViewById(R.id.messages)
        messagesButton.setOnClickListener {
            val messagesIntent = Intent( applicationContext,PostmessagesActivity::class.java )
            startActivity(messagesIntent)
        }
        //END Messsages LISTENER


        val getmessButton:Button = findViewById(R.id.getmess)
        getmessButton.setOnClickListener {
            val messIntent = Intent( applicationContext,GetmessagesActivity::class.java )
            startActivity(messIntent)
        }
        //END Messsages LISTENER
    }
    //ON CREATE FUNCTION ENDS HERE
}















