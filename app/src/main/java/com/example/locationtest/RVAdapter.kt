package com.example.locationtest

import android.R
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class RVAdapter : RecyclerView.Adapter<RVAdapter.PersonViewHolder?>() {
    class PersonViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cv: CardView
        var personName: TextView
        var personAge: TextView
        var personPhoto: ImageView

        init {
            cv = itemView.findViewById(R.id.)
            val recycler_view = findViewById<RecyclerView>(R.id.)
            personName = itemView.findViewById(R.id.)
            personAge = itemView.findViewById(R.id.person_age)
            personPhoto = itemView.findViewById(R.id.person_photo) as ImageView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}