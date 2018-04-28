package com.kamerlin.leon.drawerlayoutwithlistview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {


    val listView by lazy { findViewById<ListView>(R.id.listView) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayOf("ListView DrawerLayout", "NavigationView DrawerLayout"))

        listView.setOnItemClickListener { parent, view, position, id ->
            when(position) {
                0 -> startActivity(Intent(this, ListviewDrawerlayoutActivity::class.java))
                1 -> startActivity(Intent(this, NavigationViewDrawerLayoutActivity::class.java))
            }
        }

    }

}
