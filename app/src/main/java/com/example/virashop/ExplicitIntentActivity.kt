package com.example.virashop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent.*
import kotlinx.android.synthetic.main.activity_explicit_intent.btn_back
import kotlinx.android.synthetic.main.activity_parcel.*

class ExplicitIntentActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_EMAIL = "extra_email"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)



        btn_back.setOnClickListener {
            val backItem = Intent(this@ExplicitIntentActivity, MainActivity::class.java)
            startActivity(backItem)
        }


    }
}