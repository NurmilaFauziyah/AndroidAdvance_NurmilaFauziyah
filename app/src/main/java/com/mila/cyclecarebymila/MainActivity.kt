package com.mila.cyclecarebymila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnImplicit: ImageButton = findViewById(R.id.btn_notif)
        btnImplicit.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_notif -> {
                val bundle = Bundle()
                val intent = Intent(this@MainActivity, NotifScheduleActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}