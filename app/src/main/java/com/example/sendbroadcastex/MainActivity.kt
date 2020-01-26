package com.example.sendbroadcastex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1.setOnClickListener {


            var i = Intent("action1")
            i.putExtra("name","receiver1")

            //SendOrderedBroadcastEx app's 'receiver1' going to be triggered in this app by this sendBroadcast(i) call
            //permission also needed to trigger 'receiver1'
            sendBroadcast(i)
        }
    }
}
