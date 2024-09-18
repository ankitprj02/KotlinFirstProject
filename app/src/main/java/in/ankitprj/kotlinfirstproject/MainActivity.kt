package `in`.ankitprj.kotlinfirstproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Intents: used to navigate from one component to another

        // Types of Intents:
        // 1- Explicit: they explicitly specify the target components
        // 2- Implicit

        myButton = findViewById(R.id.goToNextBtn)
        myButton.setOnClickListener {
            // Create an Explicit Intent
            val explicitIntent = Intent(this, SecondActivity::class.java)

            explicitIntent.putExtra("name","Ankit Prajapati")
            startActivity(explicitIntent)
        }

    }


}