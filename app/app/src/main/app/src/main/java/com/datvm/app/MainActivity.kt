package com.datvm.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val layout = LinearLayout(this)
    layout.orientation = LinearLayout.VERTICAL
    layout.gravity = Gravity.CENTER
    layout.setPadding(32, 32, 32, 32)
    layout.setBackgroundColor(Color.rgb(18, 24, 38))

    val title = TextView(this)
    title.text = "DatVM"
    title.textSize = 32f
    title.setTextColor(Color.WHITE)
    title.gravity = Gravity.CENTER

    val description = TextView(this)
    description.text = "Android Virtual Space"
    description.textSize = 16f
    description.setTextColor(Color.LTGRAY)
    description.gravity = Gravity.CENTER

    val button = Button(this)
    button.text = "Bắt đầu"
    button.setOnClickListener {
        description.text =
            "DatVM đang ở chế độ thử nghiệm. Máy ảo chưa được khởi chạy."
    }

    layout.addView(title)
    layout.addView(description)
    layout.addView(
        button,
        LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
    )

    setContentView(layout)
}

}
