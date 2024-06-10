package com.example.weatherforecast

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherconditions.R
class DetailedViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedviewscreen)

        val detailedInfo = findViewById<TextView>(R.id.detailed_info)
        val averageTemp = findViewById<TextView>(R.id.average_temp)

        val days = intent.getStringArrayListExtra("days") ?: arrayListOf()
        val minTemps = intent.getIntegerArrayListExtra("minTemps") ?: arrayListOf()
        val maxTemps = intent.getIntegerArrayListExtra("maxTemps") ?: arrayListOf()
        val conditions = intent.getStringArrayListExtra("conditions") ?: arrayListOf()

        val details = StringBuilder()
        var totalMinTemp = 0
        var totalMaxTemp = 0

        for (i in days.indices) {
            details.append("Day ${days[i]}: Min Temp: ${minTemps[i]}Â°C, Max Temp: ${maxTemps[i]}Â°C, Condition: ${conditions[i]}\n")
            totalMinTemp += minTemps[i]
            totalMaxTemp += maxTemps[i]
        }

        detailedInfo.text = details.toString()

        val avgMinTemp = if (days.isNotEmpty()) totalMinTemp /
                days.size else 0
        val avgMaxTemp = if (days.isNotEmpty()) totalMaxTemp / days.size else 0
        var avgMinTempÂ = ""
        var avgMaxTempÂ = ""
        averageTemp.text = "Average Min Temp: $avgMinTempÂ°C, Average Max Temp: $avgMaxTempÂ°C"
    }
}

