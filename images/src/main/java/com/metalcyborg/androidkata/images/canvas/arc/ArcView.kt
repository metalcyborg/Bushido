package com.metalcyborg.androidkata.images.canvas.arc

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class ArcView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var firstPoint: Pair<Float, Float>? = null
    private var secondPoint: Pair<Float, Float>? = null
    private var thirdPoint: Pair<Float, Float>? = null

    private val path = Path()
    private val paint = Paint().apply {
        color = Color.RED
        strokeWidth = 10f
        style = Paint.Style.STROKE
        isAntiAlias = true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event == null) return false

        when (event.action) {
            MotionEvent.ACTION_DOWN -> onActionDown(event)
            MotionEvent.ACTION_UP -> onActionUp(event)
            MotionEvent.ACTION_MOVE -> onActionMove(event)
        }

        return true
    }

    override fun onDraw(canvas: Canvas?) {
        path.reset()
        if (firstPoint != null) {
            path.addCircle(firstPoint!!.first, firstPoint!!.second, 10f, Path.Direction.CW)
            if (secondPoint != null) {
                path.addCircle(
                    secondPoint!!.first,
                    secondPoint!!.second,
                    10f,
                    Path.Direction.CW
                )

                if (thirdPoint != null) {
                    path.moveTo(firstPoint!!.first, firstPoint!!.second)
                    path.quadTo(
                        thirdPoint!!.first,
                        thirdPoint!!.second,
                        secondPoint!!.first,
                        secondPoint!!.second
                    )
                }
            }
        }

        canvas?.drawPath(path, paint)
    }

    private fun onActionDown(event: MotionEvent) {
        if (firstPoint != null && secondPoint != null && thirdPoint != null) {
            firstPoint = null
            secondPoint = null
            thirdPoint = null
            invalidate()
        }
    }

    private fun onActionUp(event: MotionEvent) {
        when {
            firstPoint == null -> firstPoint = Pair(event.x, event.y)
            secondPoint == null -> secondPoint = Pair(event.x, event.y)
            else -> thirdPoint = Pair(event.x, event.y)
        }
        invalidate()
    }

    private fun onActionMove(event: MotionEvent) {
        if (firstPoint != null && secondPoint != null) {
            thirdPoint = Pair(event.x, event.y)
            invalidate()
        }
    }
}