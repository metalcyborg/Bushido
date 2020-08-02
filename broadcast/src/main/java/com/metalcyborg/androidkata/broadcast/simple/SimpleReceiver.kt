package com.metalcyborg.androidkata.broadcast.simple

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.metalcyborg.androidkata.broadcast.BroadcastActivity

class SimpleReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let { context ->
            intent?.let { intent ->
                Toast.makeText(context, intent.getStringExtra(BroadcastActivity.EXTRA), Toast.LENGTH_SHORT).show()
            }
        }
    }
}