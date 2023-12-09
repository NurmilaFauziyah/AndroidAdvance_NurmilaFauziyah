package com.mila.cyclecarebymila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RescheduleActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var et_rescheduleDate: EditText
    private lateinit var et_rescheduleLocation: EditText
    private lateinit var et_rescheduleNotes: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reschedule)

        et_rescheduleDate = findViewById(R.id.et_rescheduleDate)
        et_rescheduleLocation = findViewById(R.id.et_rescheduleLocation)
        et_rescheduleNotes = findViewById(R.id.et_rescheduleNotes)

        val bundle = intent.extras
        if (bundle != null) {
            et_rescheduleDate.setText(bundle.getString("date"))
            et_rescheduleLocation.setText(bundle.getString("location"))
            et_rescheduleNotes.setText(bundle.getString("notes"))
        }

        val btnReschedule: Button = findViewById(R.id.btn_create)
        btnReschedule.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.tv_rectangleNotifSchedule1 -> {
                val bundle = Bundle()
                val intent = Intent(this@RescheduleActivity, RescheduleSuccesActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}