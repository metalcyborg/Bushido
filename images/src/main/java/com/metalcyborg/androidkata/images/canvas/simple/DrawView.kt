package com.metalcyborg.androidkata.images.canvas.simple

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class DrawView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) :
    View(context, attrs, defStyleAttr) {


    private val paint = Paint()
    private val rect = Rect(100, 500, 200, 600)

    override fun onDraw(canvas: Canvas?) {
        if (canvas != null) {
            canvas.drawARGB(128, 128, 128, 255)

            paint.apply {
                color = Color.MAGENTA
                strokeWidth = 10f
                textSize = 30f
            }

            val sizeMessage = "width = $width, height = $height"
            canvas.drawText(sizeMessage, 100f, 100f, paint)

            paint.style = Paint.Style.FILL
            canvas.drawRect(rect, paint)

            paint.style = Paint.Style.STROKE
            rect.offset(200, 0)
            canvas.drawRect(rect, paint)

            paint.style = Paint.Style.FILL_AND_STROKE
            rect.offset(200, 0)
            canvas.drawRect(rect, paint)

            canvas.drawPoints(floatArrayOf(100f, 700f, 150f, 700f), paint)

            canvas.drawLines(floatArrayOf(100f, 800f, 150f, 850f, 200f, 800f, 250f, 850f), paint)

            canvas.drawArc(RectF(100f, 950f, 300f, 1050f), 90f, 270f, true, paint)
        }
    }
}