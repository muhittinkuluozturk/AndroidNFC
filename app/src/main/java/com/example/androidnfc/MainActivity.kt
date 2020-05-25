package com.example.androidnfc

import android.app.PendingIntent
import android.content.Intent
import android.content.IntentFilter
import android.nfc.NfcAdapter
import android.nfc.tech.NfcF
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_main)

        try {

            write_card_view.setOnClickListener {
                val intent = Intent(this, NfcWriteActivity::class.java)
                startActivity(intent)
            }

            read_card_view.setOnClickListener {
                val intent = Intent(this, NfcReadActivity::class.java)
                startActivity(intent)
            }

        }
        catch (ex: Exception)
        {
            Toast.makeText(applicationContext, ex.message, Toast.LENGTH_SHORT).show()
        }
    }
}
