package com.example.findevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toolbar
import android.widget.ViewFlipper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainFriki : AppCompatActivity() {
    var eventsFriki=ArrayList<EventFriki>()
    var eventsFrikiAdapter=EventFrikiAdapter(eventsFriki)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_friki)
        initView()
        loadsEventsFriki()
        var flipper=findViewById<ViewFlipper>(R.id.flipper)
        flipper.setInAnimation(applicationContext, android.R.anim.slide_in_left)
        flipper.setOutAnimation(applicationContext,android.R.anim. slide_out_right)

        val image1=ImageView(this)
        val image2=ImageView(this)
        val image3=ImageView(this)
        val link1="https://somoskudasai.com/wp-content/uploads/2019/11/EI7LlA8VUAAPFs4-1024x768.jpg"
        val link2="https://i.ytimg.com/vi/N81TlsMT2so/maxresdefault.jpg"
        val link3="https://tierragamer.com/wp-content/uploads/2022/03/que-es-cosplay-y-como-se-clasifica-portada-450x300.jpg"

        Picasso.get()
            .load(link1).into(image1)
        flipper.addView(image1)
        Picasso.get()
            .load(link2).into(image2)
        flipper.addView(image2)
        Picasso.get()
            .load(link3).into(image3)
        flipper.addView(image3)

        flipper.flipInterval=10000
        flipper.startFlipping()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_toolbar_friki, menu)

        return true
    }

    fun initView(){
        val rvEvent=findViewById<RecyclerView>(R.id.rvEventFriki)
        rvEvent.adapter=eventsFrikiAdapter
        rvEvent.layoutManager=LinearLayoutManager(this)
    }
    fun loadsEventsFriki(){
        eventsFriki.add(EventFriki("FrikiFestival","Feria dirigida a los amantes de la cultura oriental,Manga y anime.","https://i.ytimg.com/vi/b3u8fSnCFzY/maxresdefault.jpg"))
        eventsFriki.add(EventFriki("OtakuFest","Feria dirigida a los amantes de la cultura oriental,Manga y anime.","https://viveloensaltillo.com/wp-content/uploads/2020/01/otaku-fest-1080x855px-.png"))
    }
}