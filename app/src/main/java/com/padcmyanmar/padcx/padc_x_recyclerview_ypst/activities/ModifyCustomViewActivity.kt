package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padcmyanmar.padcx.padc_x_recyclerview_ypst.R
import kotlinx.android.synthetic.main.activity_modify_custom_view.*

class ModifyCustomViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify_custom_view)

        onTapBtnNav()
    }

    private fun onTapBtnNav() {
        btnNavigate.setOnClickListener {
            startActivity(CustomComponentsActivity.newIntent(this))
        }
    }

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ModifyCustomViewActivity::class.java)
        }
    }
}