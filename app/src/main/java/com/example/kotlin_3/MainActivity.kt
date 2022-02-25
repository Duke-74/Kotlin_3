package com.example.kotlin_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val NCREATE = "Activity CREATED"
        val toast = Toast.makeText(this, NCREATE, Toast.LENGTH_SHORT).show()
        //toast.
    }

    override fun onStart() {
        super.onStart()
        val NSTART = "Activity STARTED"
        val toast = Toast.makeText(this, NSTART, Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        val NRESUME = "Activity RESUME"
        val toast = Toast.makeText(this, NRESUME, Toast.LENGTH_SHORT).show()

    }

    override fun onPause() {
        super.onPause()
        val NPAUSE = "Activity PAUSED"
        val toast = Toast.makeText(this, NPAUSE, Toast.LENGTH_SHORT).show()

    }

    override fun onStop() {
        super.onStop()
        val NSTOP = "Activity STOPED"
        val toast = Toast.makeText(this, NSTOP, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        val NRESTART = "Activity RESTARTED"
        val toast = Toast.makeText(this, NRESTART, Toast.LENGTH_SHORT).show()

    }

    override fun onDestroy() {
        super.onDestroy()
        val NDESTROY = "Activity DESTROYED"
        val toast = Toast.makeText(this, NDESTROY, Toast.LENGTH_SHORT).show()

    }
}