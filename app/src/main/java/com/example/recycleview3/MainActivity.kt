package com.example.recycleview3

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.uconna,
            R.drawable.adeer,
            R.drawable.f,
            R.drawable.e,
            R.drawable.c,
            R.drawable.b,
            R.drawable.catm,
            R.drawable.d,
            R.drawable.a
        )
        heading = arrayOf("Pigeon Disguises themself as a UConn Student, Successfully Blends in With Campus Crowd",
            "Deer Invades Local Grocery Store, Can't Decide Between Organic and Non-Organic Produce",
            "Raccoon Pretends to be UConn Basketball Player, Proves to be a Better Dribbler than the Actual Team",
            "Herd of Goats Takes Over Local Park, Stamford Officials Declare it a 'Goat Sanctuary",
            "Stamford Resident Claims Cat Stole His Identity and Opened Credit Card in His Name",
            "Citywide Manhunt for Cat That Broke into Local Pizza Shop and Ate All the Cheese",
            "Local Cat Turns Out to Be Mastermind Behind String of Bank Robberies",
            "Stamford Mayoral Race Heats Up as Pigeon Announces Candidacy, Vows to Clean Up the City...and the Sidewalks",
            "New Study Reveals: Pigeons at UConn Stamford Are More Productive Than Most Students"
        )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }
    private fun getUserdata() {
        for(i in imageId.indices) {
            val news = News(imageId[i],heading[i])
            newArrayList.add(news)

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)

    }
}