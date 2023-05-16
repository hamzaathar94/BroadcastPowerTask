package com.example.broadcastpowertask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_POWER_CONNECTED -> {
                // Handle power connected event
                Toast.makeText(context, "Power connected", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_POWER_DISCONNECTED -> {
                // Handle power disconnected event
                Toast.makeText(context, "Power disconnected", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
