package dev.gumato.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.gumato.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contact = Contact("Gumato","gumatorobba@gmail.com","0758003848","616 Korongo Road","https://media.istockphoto.com/photos/beautiful-portrait-of-an-african-girl-in-sunglasses-in-the-shape-of-picture-id1366224227?b=1&k=20&m=1366224227&s=170667a&w=0&h=owJtBFEvQF6xOqT-WYumxIa400-VC4Rmy5fm_oD1BR4=")
        var contact1 = Contact("Sallo","sallorobba@gmail.com","0798765446","Ndege Road","https://media.istockphoto.com/photos/beautiful-smiling-girl-with-curly-hairstyle-picture-id1335037582?b=1&k=20&m=1335037582&s=170667a&w=0&h=11QdaoY2BMZSv5U07xcAGJVr63TeJKsT5PpZEuVyIm8=")
        var contact2 = Contact("Sarah","sararobba@gmail.com","0734567889","Chalbi Road","https://media.istockphoto.com/photos/shot-of-a-young-businesswoman-against-a-studio-background-picture-id1336311181?b=1&k=20&m=1336311181&s=170667a&w=0&h=oDntHZQeLQ8T9DuxQTGmSvjO38PfB2GDmKmdrdN6xmI=")
        var contact3 = Contact("Sora","sorarobba@gmail.com","0745985957","WestlandsRoad","https://media.istockphoto.com/photos/portrait-of-stylish-young-african-man-posing-looking-away-wearing-a-picture-id1336082303?b=1&k=20&m=1336082303&s=170667a&w=0&h=9eKGl0wYJnceMyBANz8hhMO6rMf8ktAP2xYHOMuXX88=")
        var contact4 = Contact("Rufo","ruforobba@gmail.com","0755544332","Daramu Dimaa Road","https://media.istockphoto.com/photos/portrait-of-young-afro-woman-with-bright-makeup-picture-id1331637318?b=1&k=20&m=1331637318&s=170667a&w=0&h=0i4Viz3mAqNm9Pz1b6tnUKqpp6zHQb_OvPFsnHSOUh4=")
        var contact5 = Contact("Jane","janerobba@gmail.com","0789766546","Road","https://media.istockphoto.com/photos/beautiful-afro-woman-with-perfect-makeup-outdoors-picture-id1377355010?b=1&k=20&m=1377355010&s=170667a&w=0&h=CVPyqhb_lNn_-vb77-j3WgxQP0U4sWP9cRt_ItQgAQk=")
        var contact6 = Contact("Faith","faithrobba@gmail.com","0743567434","Daramu Dimaa Road","https://media.istockphoto.com/photos/pretty-young-afro-woman-picture-id1371807196?b=1&k=20&m=1371807196&s=170667a&w=0&h=Szxu2vt6_YHWuEm8LT2SteISt7zbBVzUpt-G7LXi4i0=")
        var contactList = listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6)

        var contactsAdapter = ContactRvAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter
    }
}