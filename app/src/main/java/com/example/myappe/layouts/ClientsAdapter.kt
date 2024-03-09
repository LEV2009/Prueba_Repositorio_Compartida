package com.example.myappe.layouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.compose.runtime.internal.composableLambdaInstance
import com.example.myappe.layouts.databinding.ClientAdapterBinding


    class ClientsAdapter{context: Context, clients: List<Client>) :
        ArrayAdapter<Client>(context, 0, clients) {
            private val clnts: MutableList<Client> = ArrayList(clients)

            override fun getCount() = clnts.size

            override fun getItem(pos: Int) = clnts[pos]

            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var binding: ClientAdapterBinding = if(convertView == null)
                ClientAdapterBinding.inflate(LayoutInflater.from(context), parent, false)
            else
                ClientAdapterBinding.bind(convertView)//use the binding to work with the UI elements
            binding.clientName.text = clnts[position].name
            binding.clientEmail.text = clnts[position].email
            binding.clientPhone.text = clnts[position].phone

            return binding.root
        }
    }

