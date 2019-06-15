package com.example.sunshine.listviewcodingblocks

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val movies = arrayOf("Iron Man1", "Captain America", "Thor", "Avengers", "Black Panther","Ant-Man","Spider-Man: Homecoming ","Iron Man 2 ","Iron Man 3","Doctor Strange ")
    val images = arrayOf(R.drawable.ironman, R.drawable.cap, R.drawable.thor, R.drawable.avenger, R.drawable.blackpanther,R.drawable.antman,R.drawable.spiderman,R.drawable.ironman2,R.drawable.ironman3,R.drawable.doctor)
    val yearOfRelase = arrayOf("2008", "2011", "2010", "2012", "2018","2015","2017","2010","2013","2016")
    val actors = arrayOf("RDJ", "Chris Evans", "Chris Hemsworth", "Tom Hiddleson", "Chadwick","Neil deGrasse Tyson ","Tom Holand","Tony Stark","Tony Stark","Benedict Cumberbatch")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list: ArrayList<Movies> = arrayListOf()
        for (i in movies.indices) {
            list.add(
                Movies(
                    movieName = movies[i],
                    actorName = actors[i],
                    imageName = images[i],
                    yearOfRelease = yearOfRelase[i]

                )
            )


        }

        Log.i("TAG",list.size.toString())
        val adapter = MoviesAdapter(list,this)
        listView.adapter = adapter
    }
}