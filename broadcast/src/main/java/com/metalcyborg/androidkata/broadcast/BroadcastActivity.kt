package com.metalcyborg.androidkata.broadcast

import android.content.BroadcastReceiver
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_broadcast.*

class BroadcastActivity : AppCompatActivity() {

    lateinit var receiver: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)
        setSupportActionBar(findViewById(R.id.toolbar))

        fab.setOnClickListener {
            sendBroadcast(
                Intent(BROADCAST_ACTION).apply {
                    putExtra(EXTRA, EXTRA)
                    `package` = "com.metalcyborg.androidkata"
                }
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    companion object {
        const val BROADCAST_ACTION = "com.metalcyborg.androidkata.broadcast"
        const val EXTRA = "Broadcast"
    }
}