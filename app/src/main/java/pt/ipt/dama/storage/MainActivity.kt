package pt.ipt.dama.storage

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSave01: Button = findViewById(R.id.btnSave1)
        val btnLoad01: Button = findViewById(R.id.btnLoad1)

        val btnSave02: Button = findViewById(R.id.btnSave2)
        val btnLoad02: Button = findViewById(R.id.btnLoad2)

        val btnSave03: Button = findViewById(R.id.btnSave3)
        val btnLoad03: Button = findViewById(R.id.btnLoad3)

        val btnSave04: Button = findViewById(R.id.btnSave4)
        val btnLoad04: Button = findViewById(R.id.btnLoad4)

        val btnSave05: Button = findViewById(R.id.btnSave5)
        val btnLoad05: Button = findViewById(R.id.btnLoad5)

        /**
         * save data to SharedPreferences
         */
        btnSave01.setOnClickListener {
            val sharedPreferences = getPreferences(MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("Texto", "text saved in SharedPreferences")
            editor.commit()

            Toast.makeText(this,"Shared data saved",Toast.LENGTH_SHORT).show()
        }

        btnLoad01.setOnClickListener {
            val sharedPreferences = getPreferences(MODE_PRIVATE)
            val savedText=sharedPreferences.getString("Texto","There are no data")
            // show the text on screen
            Toast.makeText(this,"saved text: ${savedText}",Toast.LENGTH_LONG).show()
        }



    }
}