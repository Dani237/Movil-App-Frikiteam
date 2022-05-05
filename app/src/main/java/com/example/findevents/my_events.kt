package com.example.findevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class my_events : AppCompatActivity() {
    var events = ArrayList<Event>()

    //Creando el Adapter
    var eventAdapter = EventAdapter(events)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_events)

        loadEvents()
        initView()
    }

    private fun initView() {
        val rvEvent = findViewById<RecyclerView>(R.id.rvEvent)

        rvEvent.adapter = eventAdapter
        rvEvent.layoutManager = LinearLayoutManager(this)
    }

    private fun loadEvents() {
        events.add(Event("OTAKU", "Evento relacionado al mundo del manga, se presentarán productos exclusivos"))
        events.add(Event("Friki Festival", "Feria dirigida a los amantes de la cultura oriental,Manga y anime."))
    }
}

//Add the option for search an event