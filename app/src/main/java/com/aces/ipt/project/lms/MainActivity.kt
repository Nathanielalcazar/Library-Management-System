package com.aces.ipt.project.lms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.aces.ipt.project.lms.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        //This is used to hide the status bar and make
        //the splash screen as a full screen activity.
        window.setFlags(
         WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        //we used the postDelayed(Runnable,time) method
        //to send a message with a delayed time.
        //Normal Handler is decrecated, so we have to change the code little bit

        //Handler(). postDelayed({
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)// 3000 is the Delayed time in milliseconds.
    }
}