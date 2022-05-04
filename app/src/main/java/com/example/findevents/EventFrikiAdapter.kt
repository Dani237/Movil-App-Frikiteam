package com.example.findevents

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class EventFrikiAdapter(var eventsFriki:ArrayList<EventFriki>): RecyclerView.Adapter<EventFrikiPrototype>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventFrikiPrototype {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.prototype_event_friki,parent,false)
        return EventFrikiPrototype(view)
    }

    override fun onBindViewHolder(holder: EventFrikiPrototype, position: Int) {
        holder.bind(eventsFriki.get(position))
    }

    override fun getItemCount(): Int {
        return eventsFriki.size
    }

}

class EventFrikiPrototype(itemView:View): RecyclerView.ViewHolder(itemView) {
    val tvTitle=itemView.findViewById<TextView>(R.id.tvNameEventFriki)
    val tvInfo=itemView.findViewById<TextView>(R.id.tvInformation)
    val ivLogo=itemView.findViewById<ImageView>(R.id.ivLogo)
    fun bind(eventFriki:EventFriki){
        tvTitle.text=eventFriki.nameEvent
        tvInfo.text=eventFriki.information
        Picasso.get()
            .load(eventFriki.image).into(ivLogo)
    }
}
