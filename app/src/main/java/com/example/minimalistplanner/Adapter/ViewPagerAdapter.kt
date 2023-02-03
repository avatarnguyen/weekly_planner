package com.example.minimalistplanner.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.allViews
import androidx.recyclerview.widget.RecyclerView
import com.example.minimalistplanner.R
import kotlin.random.Random

class ViewPagerAdapter() : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {

    inner class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mondayLayout: CardView = itemView.findViewById(R.id.card_monday)
        val tuesdayLayout: CardView = itemView.findViewById(R.id.card_tuesday)
        val wednesdayLayout: CardView = itemView.findViewById(R.id.card_wednesday)
        val thursdayLayout: CardView = itemView.findViewById(R.id.card_thursday)
        val fridayLayout: CardView = itemView.findViewById(R.id.card_friday)
        val saturdayLayout: CardView = itemView.findViewById(R.id.card_saturday)
        val sundayLayout: CardView = itemView.findViewById(R.id.card_sunday)

        val mondayList = itemView.findViewById<ListView>(R.id.list_monday)!!
        val tuesdayList = itemView.findViewById<ListView>(R.id.list_tuesday)!!
        val wednesdayList = itemView.findViewById<ListView>(R.id.list_wednesday)!!
        val thursdayList = itemView.findViewById<ListView>(R.id.list_thursday)!!
        val fridayList = itemView.findViewById<ListView>(R.id.list_friday)!!
        val saturdayList = itemView.findViewById<ListView>(R.id.list_saturday)!!
        val sundayList = itemView.findViewById<ListView>(R.id.list_sunday)!!

        val mondayDate = itemView.findViewById<TextView>(R.id.tv_date_monday)!!
        val tuesdayDate = itemView.findViewById<TextView>(R.id.tv_date_tuesday)!!
        val wednesdayDate = itemView.findViewById<TextView>(R.id.tv_date_wednesday)!!
        val thursdayDate = itemView.findViewById<TextView>(R.id.tv_date_thursday)!!
        val fridayDate = itemView.findViewById<TextView>(R.id.tv_date_friday)!!
        val saturdayDate = itemView.findViewById<TextView>(R.id.tv_date_saturday)!!
        val sundayDate = itemView.findViewById<TextView>(R.id.tv_date_sunday)!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.week_pager_item, parent,
            false
        )
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.mondayLayout.setBackgroundColor(
            holder.itemView.resources.getColor(
                randomColor
                    (), null
            )

        )

    }

    private fun randomColor(): Int {
        val colorList = ArrayList<Int>()
        colorList.add(R.color.NoteColor1)
        colorList.add(R.color.NoteColor2)
        colorList.add(R.color.NoteColor3)
        colorList.add(R.color.NoteColor4)
        colorList.add(R.color.NoteColor5)
        colorList.add(R.color.NoteColor6)

        val seed = System.currentTimeMillis().toInt()
        val randomIndex = Random(seed).nextInt(colorList.size)

        return colorList[randomIndex]
    }

    override fun getItemCount(): Int {
        return 3
    }
}