package com.example.workwithmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView : TextView = findViewById(R.id.textView)
        when (item.itemId) {
            R.id.action1 -> {
                textView.text = "вы выбрали пункт 1"
                val ConstraintLayout : ConstraintLayout = findViewById(R.id.root_layout)
                ConstraintLayout.setBackgroundColor(resources.getColor(R.color.green))
                return true
            }
            R.id.action2 -> {
                textView.text = "вы выбрали пункт 2"
                val ConstraintLayout : ConstraintLayout = findViewById(R.id.root_layout)
                ConstraintLayout.setBackgroundColor(resources.getColor(R.color.purple))
                return true
            }
            R.id.action3 -> {
                textView.text = "вы выбрали пункт 3"
                val ConstraintLayout : ConstraintLayout = findViewById(R.id.root_layout)
                ConstraintLayout.setBackgroundColor(resources.getColor(R.color.pink))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}