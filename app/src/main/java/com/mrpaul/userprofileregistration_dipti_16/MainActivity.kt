package com.mrpaul.userprofileregistration_dipti_16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var listButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        listButton = findViewById(R.id.profileListBtn)

        listButton.setOnClickListener {
            // Start LoadingActivity instead of ProfileListActivity
            val intent = Intent(this, ProfileListActivity::class.java)
            intent.putExtra("TARGET_ACTIVITY", "com.mrpaul.userprofileregistration_DIPTI_16.ProfileListActivity")
            startActivity(intent)
            finish() // Finish MainActivity so the user can't return to it
        }
    }
}