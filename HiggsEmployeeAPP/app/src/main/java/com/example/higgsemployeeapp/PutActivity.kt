package com.example.higgsemployeeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONObject

class PutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_put)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Step1: Find the 2 edit texts by their id names.
        val edIdNumber :EditText = findViewById(R.id.id_number)
        val edSalary : EditText = findViewById(R.id.salary)


        //Step2: Find SubmitButton and assign it the listener.
        val updateButton : Button = findViewById(R.id.update)
        updateButton.setOnClickListener {

        //Step3: Create a JSONObject, and put data from the editText.
            //Key(insomnia),Values from the editTexts as strings.
            val payload = JSONObject()
            payload.put("id_number",edIdNumber.text.toString())
            payload.put("salary",edSalary.text.toString())


            val api = "https://modcom.pythonanywhere.com/employees"
            val helperObject = ApiHelper(applicationContext)
            helperObject.post(api,payload)
        }




    }
    //END ON CREATE FUNCTION.
}
