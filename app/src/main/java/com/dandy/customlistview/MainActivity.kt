package com.dandy.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listView:ListView
    var list=mutableListOf<Model>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById<ListView>(R.id.listView)
//        list= mutableListOf<Model>()

        list.add(Model("Electric Truck","An electric truck is an oddity in a good way", R.drawable.toyotahiluxev))
        list.add(Model("Electric Coupe","Electric coupes are fairly more common", R.drawable.nioe3))
        list.add(Model("Electric Carrier","These can be convenient as well as impressively eco-friendly", R.drawable.toyotabev08))
        list.add(Model("Electric Sports Car","Not the most common sight but arguably the most impressive", R.drawable.toyotabev19))
        list.add(Model("Electric Hatchback","A nice, eco-friendly addition to one of the most common classes of city cars", R.drawable.kiaev6))


        listView.adapter=MyAdapter(this, R.layout.row, list)

        listView.setOnItemClickListener { adapterView, view, i







                                          , l ->

            if (i==0){
                Toast.makeText(this@MainActivity, "An electric truck!", Toast.LENGTH_SHORT).show()
            }

            if (i==1){
                Toast.makeText(this@MainActivity, "An electric coupe!", Toast.LENGTH_SHORT).show()
            }

            if (i==2){
                Toast.makeText(this@MainActivity, "An electric carrier!", Toast.LENGTH_SHORT).show()
            }

            if (i==3){
                Toast.makeText(this@MainActivity, "An electric sports car!", Toast.LENGTH_SHORT).show()
            }

            if (i==4){
                Toast.makeText(this@MainActivity, "An electric hatchback!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}