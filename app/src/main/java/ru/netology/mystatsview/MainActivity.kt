package ru.netology.mystatsview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.netology.mystatsview.ui.theme.StatsView

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<StatsView>(R.id.stats).data = listOf(
            500F,
            500F,
            500F,
            500F,
        )
    }

}