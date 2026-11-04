package com.example.higgsemployeeapp

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONArray

class GetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_get)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    //Step1. FIND PROGRESS BAR:VISIBLE.
        val progress:ProgressBar = findViewById(R.id.prog)
    //Step2. Create variable and store API URL as a string.
        val api="https://modcom.pythonanywhere.com/employees"
    //Step3. Create an object(instance) of ApiHelper Class(blueprint) and provide the context.
        val helper=ApiHelper(applicationContext)
        helper.get(api, object :  ApiHelper.CallBack {
            override fun onSuccess(result: String?) {
//                Toast.makeText(applicationContext, "$result", Toast.LENGTH_LONG).show()
    //Step4. Result variable contains data from the API -->string
                //Convert result to JSON array
                val empDataJSONArray = JSONArray(result.toString())

    //Step5. Loop through the JSONArray -->JSONObject
                (0 until empDataJSONArray.length()).forEach{
                    val employeeObject = empDataJSONArray.getJSONObject(it)
                    val tvEmpData : TextView = findViewById(R.id.employeeData)
                    tvEmpData.append("ID Number"+ employeeObject.get("id_number")+ "\n")
                    tvEmpData.append("Username"+ employeeObject.get("username")+ "\n")
                    tvEmpData.append("Other Names"+ employeeObject.get("others")+ "\n")
                    tvEmpData.append("Salary"+ employeeObject.get("salary")+ "\n")
                    tvEmpData.append("Department"+ employeeObject.get("department")+ "\n")
                    tvEmpData.append("\n\n")
                }// End forEach()-->All Data have been fetched

    //Step6. Hide the progress from the view.
                progress.visibility = View.GONE
            }

        })
    }
    //ON CREATE FUNCTION ENDS HERE.
}