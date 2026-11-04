package com.example.higgsrecyclerfoodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior

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
    // Step1: Find the recycler view and provide the layout manager(LINEAR,GRID)
        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        val linearLayoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = linearLayoutManager

        // Step1: Call the recycler Adapter and provide data to the recycler view

        val recyclerAdapter = RecyclerAdapter(applicationContext)
        recyclerView.adapter = recyclerAdapter

    //  FIND THE BOTTOM SHEET(IN THE FRAME LAYOUT) AND  APPLY THE BOTTOM SHEET BEHAVIOUR.

        val bottomsheet:FrameLayout = findViewById(R.id.bottomsheet)
        BottomSheetBehavior.from(bottomsheet).apply {
            peekHeight = 300
            this.state = BottomSheetBehavior.STATE_COLLAPSED

        }// BOTTOM SHEET BEHAVIOUR ENDS HERE.

        val orderButton:Button = findViewById(R.id.order)
        orderButton.setOnClickListener {
        val orderIntent = Intent( applicationContext,OrderNowActivity::class.java )
        startActivity(orderIntent)
        }
    }
    // ON CREATE FUNCTION ENDS HERE.
}

