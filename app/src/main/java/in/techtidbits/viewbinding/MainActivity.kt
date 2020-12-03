package `in`.techtidbits.viewbinding

import `in`.techtidbits.viewbinding.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnInfo.setOnClickListener{
            binding.txtInfo.text = "Button Clicked"
            Toast.makeText(this@MainActivity, "Button Pressed", Toast.LENGTH_SHORT ).show()}
    }
}