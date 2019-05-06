package com.pickle.basicshapescustomviews

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View
import androidx.annotation.Nullable

class MyCustomView @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null, defStyleAttr: Int = 0): View(context,attributeSet,defStyleAttr){



    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        var paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.color = Color.MAGENTA
        var rect = Rect()
       rect.left =0

         rect.right= width
        rect.top =0
        rect.bottom= height

        canvas?.drawRect(rect,paint)
    }


}