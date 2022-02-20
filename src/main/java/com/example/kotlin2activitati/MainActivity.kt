package com.example.kotlin2activitati

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.* //extension kt

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, ADouaActivitate::class.java)

        Send.setOnClickListener{
            val message = editText.text.toString()
            intent.putExtra("key", message)
            startActivityForResult(intent, 1)
        }
    }

     override fun onActivityResult(requestCode : Int, resultCode : Int, data : Intent?)
    {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == requestCode){
            if(resultCode == Activity.RESULT_OK)
            {
                val textPreluat = data?.getStringExtra("key2")
                editText.setText(textPreluat)
            }
        }
    }
}