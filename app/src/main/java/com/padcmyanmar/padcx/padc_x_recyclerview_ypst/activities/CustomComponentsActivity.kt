package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.R

class CustomComponentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_components)
    }

    companion object{
        fun newIntent(context: Context): Intent{
            return Intent(context, CustomComponentsActivity::class.java)
        }
    }
}