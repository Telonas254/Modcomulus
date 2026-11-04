package com.example.higgsemployeeapp

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.json.JSONArray

class GetmessagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_getmessages)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Step1. FIND PROGRESS BAR:VISIBLE.
        val progress: ProgressBar = findViewById(R.id.prog)

        //Step2. Create variable and store API URL as a string.
        val api="http://modcom.pythonanywhere.com/posts"

        //Step3. Create an object(instance) of ApiHelper Class(blueprint) and provide the context.
        val taskhelper=ApiHelper(applicationContext)
        taskhelper.get(api, object :  ApiHelper.CallBack {
            override fun onSuccess(result: String?) {
            //Toast.makeText(applicationContext, "$result", Toast.LENGTH_LONG).show()
        // Step4. Result variable contains data from the API -->string
                //Convert result to JSON array
                val messDataJSONArray = JSONArray(result.toString())

        //Step5. Loop through the JSONArray -->JSONObject
                (0 until messDataJSONArray.length()).forEach{
                    val messageObject = messDataJSONArray.getJSONObject(it)
                    val tvEmpData : TextView = findViewById(R.id.messagesData)
                    tvEmpData.append("Nickname"+ messageObject.get("nickname")+ "\n")
                    tvEmpData.append("Message"+ messageObject.get("postmess")+ "\n")
                    tvEmpData.append("\n\n")
                }// End forEach()-->All Data have been fetched

        //Step6. Hide the progress from the view.
                progress.visibility = View.GONE
            }

       })// TASK HELPER FUNCTION ENDS HERE.
    }
    //ON CREATE FUNCTION ENDS HERE.
}