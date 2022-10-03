package com.example.customdialog

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.customdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val customDialog: AlertDialog.Builder = AlertDialog.Builder(this)

        customDialog.setMessage(resources.getString(R.string.custom_message))

        customDialog.setPositiveButton("Start Now") { _, _ ->
            displayShortToast("Clicked on start now")
        }

        customDialog.setNegativeButton("Cancel") { _, _ ->
            displayShortToast("Clicked on cancel")
        }

        customDialog.create().show()
    }

    private fun displayShortToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

}