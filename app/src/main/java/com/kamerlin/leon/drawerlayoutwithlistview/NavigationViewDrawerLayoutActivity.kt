package com.kamerlin.leon.drawerlayoutwithlistview


import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem

class NavigationViewDrawerLayoutActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener{
    val toolbar by lazy { findViewById<Toolbar>(R.id.toolbar) }
    val drawerLayout by lazy { findViewById<DrawerLayout>(R.id.drawer_layout) }
    val navigationView by lazy { findViewById<NavigationView>(R.id.nav_view) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_view_drawer_layout)

        setSupportActionBar(toolbar)



        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        val m = navigationView.menu
        val topChannelMenu = m.addSubMenu("Top Channels")
        topChannelMenu.add("Foo")
        topChannelMenu.add("Bar")
        topChannelMenu.add("Baz")

        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }




    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }


        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

}
