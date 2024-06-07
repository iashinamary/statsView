package ru.netology.mystatsview

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.netology.mystatsview.ui.theme.StatsView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            500F,
            500F,
            500F,
            500F,
        )

        view.animate()
            .rotation(360F)
            .scaleX(1.2F)
            .scaleY(1.2F)
            .setInterpolator(LinearInterpolator())
            .setStartDelay(500)
            .setDuration(500)
            .start()
    }
}