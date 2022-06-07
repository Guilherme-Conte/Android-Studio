package com.example.sqlcomroom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sqlcomroom.R
import com.example.sqlcomroom.model.User

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>(){

    var listUser = emptyList<User>()

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textId = view.findViewById<TextView>(R.id.textId)
        val textNome = view.findViewById<TextView>(R.id.textNome)
        val textSobrenome = view.findViewById<TextView>(R.id.textSobrenome)
        val textIdade = view.findViewById<TextView>(R.id.textIdade)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout_user, parent, false)

        return UserViewHolder(layout)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val user = listUser[position]

        holder.textId.text = user.id.toString()
        holder.textNome.text = user.nome
        holder.textSobrenome.text = user.sobrenome
        holder.textIdade.text = user.idade.toString()

    }

    override fun getItemCount(): Int {
        return listUser.size
    }

    fun setList(list: List<User>){
        listUser = list
        notifyDataSetChanged()
    }

}