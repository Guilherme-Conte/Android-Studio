package AdapterTarefas

import Model.Tarefas
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.generation.recycleview.R

class TarefaAdapter: RecyclerView.Adapter <TarefaAdapter.tarefasviewholder>(){

    private var listadeTarefa = emptyList<Tarefas>()

    class tarefasviewholder (view: View): RecyclerView.ViewHolder(view){

        val textNome = view.findViewById<TextView>(R.id.Nome)
        val textDescricao = view.findViewById<TextView>(R.id.Descrição)
        val textResponsavel = view.findViewById<TextView>(R.id.Responsável)
        val textData = view.findViewById<TextView>(R.id.Data)
        val switchCardAtivo = view.findViewById<Switch>(R.id.switch1)
        val textCategoria = view.findViewById<TextView>(R.id.Categoria)
        val buttonDeletar = view.findViewById<Button>(R.id.Deletar)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tarefasviewholder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_tarefas, parent, false)
        return tarefasviewholder(layout)
    }


    override fun onBindViewHolder(holder: tarefasviewholder, position: Int) {
        var tarefa = listadeTarefa [position]

        holder.textNome.text = tarefa.nome
        holder.textDescricao.text = tarefa.descricao
        holder.textResponsavel.text = tarefa.responsavel
        holder.textData.text = tarefa.data
        holder.switchCardAtivo.isChecked = tarefa.status
        holder.textCategoria.text = tarefa.categoria
    }

    override fun getItemCount(): Int {
       return listadeTarefa.size
    }

fun setList (lista:List<Tarefas>){
    listadeTarefa = lista
    notifyDataSetChanged()

}

    }
