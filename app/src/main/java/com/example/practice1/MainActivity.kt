package com.example.practice1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.practice1.R.*


class MainActivity : AppCompatActivity() {

    val cards: ArrayList<Int> = arrayListOf(
        drawable.card_blue,
        drawable.card_red,
        drawable.card_yellow,
        drawable.card_orange,
        drawable.card_green,
        drawable.card_black,
        drawable.card_pink
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.choose_topic)

        val rvTopics = findViewById<View>(id.rvTopics) as RecyclerView

        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        rvTopics.layoutManager = staggeredGridLayoutManager
        val adapter = Adapter(cards)
        rvTopics.adapter = adapter
    }
}