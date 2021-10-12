package com.example.locationtest

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.locationtest.databinding.MmLayoutBinding

class MMActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
//    private lateinit var binding: MmLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        binding = MmLayoutBinding.inflate(layoutInflater)
        setContentView(R.layout.demo_activity)
        var recyclerview: RecyclerView = findViewById(R.id.rv)
        var layoutManager: LinearLayoutManager = LinearLayoutManager(applicationContext)




//        setSupportActionBar(binding.toolbar)

//        val navController = findNavController(R.id.nav_host_fragment_content_mmactivity)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)

//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }

    fun initData(){
        var persons: ArrayList<Person> = ArrayList<Person>()
//        persons = ArrayList<Person>()
        var p = Person()
        p.age = "20"
        p.name = "Brian"
        persons.add(p)
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_mmactivity)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}