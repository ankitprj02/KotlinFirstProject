package `in`.ankitprj.kotlinfirstproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    lateinit var  textView: TextView
    lateinit var openWebButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView)
        openWebButton = findViewById(R.id.openWebButton)

        // Receive data from the intent
        val receiveData = intent.getStringExtra("name")

        // using the received data as needed
        textView.setText("Your name is: $receiveData")

        openWebButton.setOnClickListener {
            val implicitIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.google.co.in/")
            )
            startActivity(implicitIntent)
        }

    }
}