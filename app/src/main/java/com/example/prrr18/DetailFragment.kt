package com.example.prrr18

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class DetailFragment : Fragment() {

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_detail, container, false)
        }
        // обновление текстового поля
        fun setSelectedItem(selectedItem: String?) {
            val view = view?.findViewById<TextView>(R.id.detailsText)
            view?.text = selectedItem
            val image = requireView().findViewById<ImageView>(R.id.imageView)
            val kt = R.drawable.kohka
            val kt1 = R.drawable.kohka1
            val kt2 = R.drawable.kohka2
            if (selectedItem == "Бенгальская кошка") {
                image.setImageResource(kt1)
                view?.text = "Бенгальская кошка — короткошерстная, от среднего до крупного размера, с изящным, но очень мускулистым телом"
            }
            if (selectedItem == "Абиссинская кошка") {
                image.setImageResource(kt2)
                view?.text = "Абиссинская порода — это элегантные кошки средних размеров с сильными грациозными телами и длинными стройными лапами"
            }
            if (selectedItem == "Манчкин") {
                image.setImageResource(kt)
                view?.text = "Манчкины — коротконогие кошки с длинным туловищем, напоминающие такс."
            }
        }

    }
