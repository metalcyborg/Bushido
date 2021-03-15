package com.metalcyborg.androidkata.images.drawable

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
import kotlin.math.min

class RedCircleDrawable: Drawable() {

    private val redPaint = Paint().apply {
        setARGB(255, 255, 0, 0)
    }

    override fun draw(canvas: Canvas) {
        val width = bounds.width()
        val height = bounds.height()
        val radius = min(width, height).toFloat() / 2

        canvas.drawCircle(width.toFloat() / 2, height.toFloat() / 2, radius, redPaint)
    }

    override fun setAlpha(alpha: Int) {
        redPaint.alpha = alpha
    }

    override fun getOpacity() = PixelFormat.TRANSLUCENT

    override fun setColorFilter(colorFilter: ColorFilter?) {
        redPaint.colorFilter = colorFilter
    }
}