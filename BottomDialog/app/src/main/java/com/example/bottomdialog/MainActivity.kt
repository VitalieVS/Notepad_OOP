package com.example.bottomdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        show_dialog_button.setOnClickListener{
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.dialog_layout, null)
            dialog.setContentView(view)
            dialog.show()
        }
    }
}