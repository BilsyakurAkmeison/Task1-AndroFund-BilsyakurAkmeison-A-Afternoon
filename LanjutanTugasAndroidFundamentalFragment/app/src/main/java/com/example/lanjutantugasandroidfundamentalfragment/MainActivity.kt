package com.example.lanjutantugasandroidfundamentalfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnImplicit: Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)

        val btnFragment: Button = findViewById(R.id.btn_fragment)
        btnFragment.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_implicit -> {
                val message = "Hallo tes"
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                startActivity(intent)
            }
            R.id.btn_fragment -> {
                val intent = Intent(this@MainActivity, FragmentActivity::class.java)
                startActivity(intent)
            }
        }
    }
}