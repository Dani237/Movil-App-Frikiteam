package com.example.findevents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventAdapter(var events: ArrayList<Event>): RecyclerView.Adapter<EventPrototype>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventPrototype {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.prototype_event, parent, false)
        return EventPrototype(view)
    }

    override fun onBindViewHolder(holder: EventPrototype, position: Int) {
        holder.bind(events.get(position))
    }

    override fun getItemCount(): Int {
        return events.size
    }
}

class EventPrototype(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvEventName = itemView.findViewById<TextView>(R.id.tvEventName)
    val tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)

    fun bind(event : Event) {
        tvEventName.text = event.name
        tvDescription.text = event.description
    }
}
