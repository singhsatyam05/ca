package com.example.id

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var nameEt: EditText
    lateinit var regEt: EditText
    lateinit var titleEt: EditText
    lateinit var issueEt: EditText
    lateinit var returnEt: EditText
    lateinit var submitBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        nameEt = findViewById(R.id.name1)
        regEt = findViewById(R.id.register1)
        titleEt = findViewById(R.id.title1)
        issueEt = findViewById(R.id.issue1)
        returnEt = findViewById(R.id.return1)
        submitBtn = findViewById(R.id.button)

        submitBtn.setOnClickListener {

            val name = nameEt.text.toString()
            val reg = regEt.text.toString()
            val title = titleEt.text.toString()
            val issueDate = issueEt.text.toString()
            val returnDate = returnEt.text.toString()

            val message = """
                Name: $name
                Registration No: $reg
                Book Title: $title
                Issue Date: $issueDate
                Return Date: $returnDate
            """.trimIndent()

            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        }
    }
}
