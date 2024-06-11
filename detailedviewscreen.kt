package com.example.weatherconditions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedviewscreen)

        val detailedInfoTextView: TextView = findViewById(R.id.detailed_info)
        val averageTempTextView: TextView = findViewById(R.id.average_temp)
        val backButton: Button = findViewById(R.id.btn_back_to_main)

        val days = intent.getStringArrayListExtra("days") ?: arrayListOf()
        val minTemps = intent.getIntegerArrayListExtra("minTemps") ?: arrayListOf()
        val maxTemps = intent.getIntegerArrayListExtra("maxTemps") ?: arrayListOf()
        val conditions = intent.getStringArrayListExtra("conditions") ?: arrayListOf()

        val detailsStringBuilder = StringBuilder()
        for (i in days.indices) {
            detailsStringBuilder.append("${days[i]}: Min Temp - ${minTemps[i]}, Max Temp - ${maxTemps[i]}, Condition - ${conditions[i]}\n")
        }
        detailedInfoTextView.text = detailsStringBuilder.toString()

        val averageTemp = if (minTemps.isNotEmpty() && maxTemps.isNotEmpty()) {
            val avgMinTemp = minTemps.sum() / minTemps.size
            val avgMaxTemp = maxTemps.sum() / maxTemps.size
            "Average Min Temp: $avgMinTemp, Average Max Temp: $avgMaxTemp"
        } else {
            "No temperature data available"
        }
        averageTempTextView.text = averageTemp

        backButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
