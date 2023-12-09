package com.mila.cyclecarebymila

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.google.android.material.tabs.TabLayout

class RescheduleSuccesActivity : AppCompatActivity() {

    private lateinit var giftSuccess: ImageView
    private lateinit var giftSuccess2: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reschedule_succes)
    }

    fun giftOnClick(view: View){
        Log.i("info", "gift telah di click")

        giftSuccess.animate().alpha(0f).setDuration(2000)
        giftSuccess2.animate().alpha(1f).setDuration(2000)

    }
}

private fun Any.setDuration(i: Int) {
    TODO("Not yet implemented")
}

private fun Any.alpha(of: Any): Any {
    TODO("Not yet implemented")
}

private fun Unit.animate(): Any {
    TODO("Not yet implemented")
}
