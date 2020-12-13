package com.example.virashop

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.virashop.model.User
import kotlinx.android.synthetic.main.activity_explicit_intent.*
import kotlinx.android.synthetic.main.activity_main.*

class ParcelActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcel)

        val user = intent.getParcelableExtra<User>(EXTRA_USER) as User
        

        btn_back.setOnClickListener {
            val backItem = Intent(this@ParcelActivity, MainActivity::class.java)
            startActivity(backItem)
        }


    }
}