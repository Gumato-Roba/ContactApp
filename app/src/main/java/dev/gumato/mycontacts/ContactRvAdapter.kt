package dev.gumato.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.gumato.mycontacts.databinding.ContactsListItemBinding

class ContactRvAdapter(var contactsList: List<Contact>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactsListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
            return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
       var currentContact = contactsList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvPhoneNumber.text = currentContact.phoneNumber
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.ivContact)

        val  context = holder.itemView.context
        holder.binding.ivContact.setOnClickListener {
          Toast
              .makeText(context, "you have clicked the image", Toast.LENGTH_SHORT)
              .show()
        }
        holder.binding.cvContacts.setOnClickListener {
            val intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            intent.putExtra("PHONENUMBER",currentContact.phoneNumber)
            intent.putExtra("EMAIL",currentContact.email)
            intent.putExtra("IMAGE",currentContact.image)
            context.startActivity(intent)
            holder.binding.ivContact.setOnClickListener{
                Toast.makeText(context, "You have clicked on my face",Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    override fun getItemCount(): Int {
    return contactsList.size
    }
}
class  ContactViewHolder(val binding: ContactsListItemBinding):
    RecyclerView.ViewHolder(binding.root)
