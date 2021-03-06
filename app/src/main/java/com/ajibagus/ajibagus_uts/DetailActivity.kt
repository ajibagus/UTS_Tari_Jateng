package com.ajibagus.ajibagus_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Tarian"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.endel))
        textViewNamaDetail.text = intent.getStringExtra("nama")
        textViewAsalDetail.text = intent.getStringExtra("asal")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}