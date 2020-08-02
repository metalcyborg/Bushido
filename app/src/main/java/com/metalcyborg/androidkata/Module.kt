package com.metalcyborg.androidkata

import android.app.Activity
import android.content.Context
import android.content.Intent
import kotlin.reflect.KClass

class Module(val name: String, private val activity: KClass<out Activity>) {

    fun startActivity(context: Context) {
        context.startActivity(Intent(context, activity.java))
    }
}