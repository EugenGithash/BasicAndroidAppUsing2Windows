package com.example.kotlin2activitati

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_main.*

class ADouaActivitate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        val message = intent.getStringExtra("key")
        editText2.setText(message)

        button2.setOnClickListener {
            val textDeScris = editText2.text.toString()
            getIntent().putExtra("key2", textDeScris)
            setResult(RESULT_OK, getIntent())
            finish()
        }

    }
}