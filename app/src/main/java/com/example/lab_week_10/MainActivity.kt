package com.example.lab_week_10

import android.os.Bundle
<<<<<<< HEAD
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
=======
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
>>>>>>> 7f6ce830b8993aa37a2db28dbc661358c3dd9464
import androidx.lifecycle.ViewModelProvider
import com.example.lab_week_10.viewmodels.TotalViewModel

class MainActivity : AppCompatActivity() {

<<<<<<< HEAD
    private lateinit var viewModel: TotalViewModel
=======
    private val viewModel by lazy {
        ViewModelProvider(this)[TotalViewModel::class.java]
    }
>>>>>>> 7f6ce830b8993aa37a2db28dbc661358c3dd9464

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        viewModel = ViewModelProvider(this)[TotalViewModel::class.java]

        val textTotal = findViewById<TextView>(R.id.text_total)
        val buttonIncrement = findViewById<Button>(R.id.button_increment)

        viewModel.total.observe(this, Observer { total ->
            textTotal.text = getString(R.string.text_total, total)
        })

        buttonIncrement.setOnClickListener {
            viewModel.incrementTotal()
        }
    }
=======
        updateText(viewModel.total)

        findViewById<Button>(R.id.button_increment).setOnClickListener {
            updateText(viewModel.incrementTotal())
        }
    }

    private fun updateText(total: Int) {
        findViewById<TextView>(R.id.text_total).text =
            getString(R.string.text_total, total)
    }
>>>>>>> 7f6ce830b8993aa37a2db28dbc661358c3dd9464
}
