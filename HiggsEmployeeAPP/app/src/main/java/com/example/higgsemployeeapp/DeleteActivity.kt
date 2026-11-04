package com.example.higgsemployeeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONObject

class DeleteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_delete)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Step1: Find the 1 edit text by its id names.
        val edIdNumber : EditText = findViewById(R.id.id_number)

        //Step2: Find DeleteButton and assign it the listener.
        val deleteButton : Button = findViewById(R.id.delete)
        deleteButton.setOnClickListener {
        //Step3: Create a JSONObject, and put data from the editText.
            //Key(insomnia),Values from the editTexts as strings.
            val empdelete = JSONObject()
            empdelete.put("id_number",edIdNumber.text.toString())


            val api = "https://modcom.pythonanywhere.com/employees"
            val helperObject = ApiHelper(applicationContext)
            helperObject.post(api,empdelete)
        }

    }
    // END ON CREATE FUNCTION.
}