package com.sumeyra.alertdialogkotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welkom",Toast.LENGTH_LONG).show()
    }


    // if we want to show message for user we have three method for it.
    // 1-> Toast Message
    // 2-> Alert Dialog
    // 3-> SnackBar

    // Context
    // Activity Context -> this
    // Application Context -> activityContext

    fun save(view : View){
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure ? ")
        alert.setPositiveButton("Yes", object: DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity, "Saved!", Toast.LENGTH_LONG).show()
            }

        })
        alert.setNegativeButton("No", object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity,"Not Saved!",Toast.LENGTH_LONG).show()
            }

        })
        alert.show()

    }


    }
