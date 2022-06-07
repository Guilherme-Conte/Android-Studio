package com.generation.recycleview

import AdapterTarefas.TarefaAdapter
import Model.Tarefas
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val listTarefas = mutableListOf(
            Tarefas(
                "Estudar",
                "Iniciar na parte da manhã",
                "Jenifer",
                "2022-26-03",
                true,
                "Dia a Dia"
            ),
            Tarefas(
                "Ler o livro",
                "A tarde",
                "Jenifer",
                "2022-26-03",
                false,
                "Dia a Dia"
            ),
            Tarefas(
                "Jogar",
                "Resto da noite",
                "Jenifer",
                "2022-26-03",
                false,
                "Lazer"
            )
        )

        val recyclerView = view.findViewById<RecyclerView>(R.id.RecyclerView)
        val adapterTarefa = TarefaAdapter()

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapterTarefa
        recyclerView.setHasFixedSize(true)
        adapterTarefa.setList(listTarefas)

        return view
    }

}