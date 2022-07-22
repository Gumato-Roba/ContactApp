package dev.gumato.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.gumato.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun  getExtras(){
        var name = intent.extras?.getString("NAME")
        var address = intent.extras?.getString("ADDRESS")
        var Number = intent.extras?.getString("NUMBER")
        var Email = intent.extras?.getString("EMAIL")
        var image = binding.imgPerson

        Toast.makeText(this, name,Toast.LENGTH_LONG).show()
        Toast.makeText(this, Number,Toast.LENGTH_LONG).show()
        binding.tvNames.text = name
        binding.tvAddresses.text = address
        binding.tvEmails.text = Email
        binding.tvNumber.text = Number
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)
    }
}