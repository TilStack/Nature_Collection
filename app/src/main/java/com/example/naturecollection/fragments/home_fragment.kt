package com.example.naturecollection.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.naturecollection.Adapter.PlantItemDecoration
import com.example.naturecollection.Adapter.plant_Adapter
import com.example.naturecollection.R

class home_fragment: Fragment(){

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val view= inflater?.inflate(R.layout.fragment_home,container,false)

        //recuperation du premier recycle view
        val horizontalRecycleView=view.findViewById<RecyclerView>(R.id.horizontal_recylcleView)
        horizontalRecycleView.adapter= plant_Adapter(R.layout.item_horizontal_plant)

        //recuperation du second recycle view
        val verticalRecyclerView=view.findViewById<RecyclerView>(R.id.vertical_recycleView)
        verticalRecyclerView.adapter= plant_Adapter(R.layout.item_vertical_plant)
        verticalRecyclerView.addItemDecoration(PlantItemDecoration())

        return view
    }
}