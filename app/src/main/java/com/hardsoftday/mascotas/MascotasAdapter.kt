package com.hardsoftday.mascotas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_mascotas.view.*

class MascotasAdapter (val mascotas:List<Mascotas>):RecyclerView.Adapter<MascotasAdapter.MascotasHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MascotasHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MascotasHolder(layoutInflater.inflate(R.layout.item_mascotas, parent, false))
    }

    override fun getItemCount(): Int {
        return mascotas.size
    }

    override fun onBindViewHolder(holder: MascotasHolder, position: Int) {
        holder.render(mascotas[position])
    }

    class MascotasHolder(val view:View):RecyclerView.ViewHolder(view) {

        fun render(mascotas: Mascotas) {
            view.tvName.text = mascotas.name
            view.tvGenero.text = mascotas.Raza
            view.tvOwner.text = mascotas.owner
            view.tvAge.text = mascotas.age

            Picasso.get().load(mascotas.imagen).into(view.urlImagen)

        }

    }

}