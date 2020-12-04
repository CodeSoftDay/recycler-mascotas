package com.hardsoftday.mascotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mascotas = listOf<Mascotas>(
            Mascotas("Bruna", "Manuel Duarte", "2 años", "Labrador", "https://cdn.pixabay.com/photo/2017/11/09/21/41/cat-2934720__340.jpg"),
            Mascotas("Can", "Manuel ", "2 años", "Pitbul","https://cdn.pixabay.com/photo/2019/08/19/07/45/dog-4415649__340.jpg"),
            Mascotas("Tyson", "Duarte", "1 años", "FiruLais","https://cdn.pixabay.com/photo/2018/10/01/09/21/pets-3715733__340.jpg"),
            Mascotas("Canino", "Tyson", "4 años", "San Fernando","https://cdn.pixabay.com/photo/2017/03/14/14/49/cat-2143332__340.jpg"),

            Mascotas("Bruna", "Manuel Duarte", "2 años", "Labrador", "https://cdn.pixabay.com/photo/2017/11/09/21/41/cat-2934720__340.jpg"),
            Mascotas("Can", "Manuel ", "2 años", "Pitbul","https://cdn.pixabay.com/photo/2019/08/19/07/45/dog-4415649__340.jpg"),
            Mascotas("Tyson", "Duarte", "1 años", "FiruLais","https://cdn.pixabay.com/photo/2018/10/01/09/21/pets-3715733__340.jpg"),
            Mascotas("Canino", "Tyson", "4 años", "San Fernando","https://cdn.pixabay.com/photo/2017/03/14/14/49/cat-2143332__340.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerMascotas()

    }

    fun recyclerMascotas() {

        rvHomeMascotas.layoutManager = LinearLayoutManager(this)
        val adapter = MascotasAdapter(mascotas)
        rvHomeMascotas.adapter = adapter

    }

}