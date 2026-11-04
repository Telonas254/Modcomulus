package com.example.higgsemployeeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONObject

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_post)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    //Step1: Find the 5 edit texts by their id names.
        val editIdnumber : EditText = findViewById(R.id.id_number)
        val editUsername : EditText = findViewById(R.id.username)
        val editOthers : EditText = findViewById(R.id.others)
        val editSalary : EditText = findViewById(R.id.salary)
        val editDepartment : EditText = findViewById(R.id.department)

    //Step2: Find SubmitButton and assign it the listener.
        val submitButton:Button = findViewById(R.id.submit)
        submitButton.setOnClickListener {

    //Step3: Create a JSONObject, and put data from the editText.
            //Key(insomnia),Values from the editTexts as strings.
            val jsonData = JSONObject()
            jsonData.put( "id_number",editIdnumber.text.toString())
            jsonData.put( "username",editUsername.text.toString())
            jsonData.put( "others",editOthers.text.toString())
            jsonData.put( "salary",editSalary.text.toString())
            jsonData.put( "department",editDepartment.text.toString())

            val api = "http://192.168.9.81:5000/employee"

            val helperObject = ApiHelper(applicationContext)
            helperObject.post(api,jsonData)

            //ON THE MANIFEST,ALLOW INTERNET PERMISSION.
        }
        //SUBMIT LISTENER ENDS HERE

    }
    //ON-CREATE FUNCTION ENDS HERE.
}