package com.metalcyborg.androidkata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ModulesAdapter(private val modules: Array<Module>, private val clickListener: ClickListener) :
    RecyclerView.Adapter<ModulesAdapter.ModulesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModulesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.modules_item, parent, false)
        return ModulesViewHolder(view, clickListener)
    }

    override fun getItemCount(): Int {
        return modules.size
    }

    override fun onBindViewHolder(holder: ModulesViewHolder, position: Int) {
        val module = modules[position]
        holder.name.text = module.name
    }

    interface ClickListener {

        fun onClick(module: Module)
    }

    inner class ModulesViewHolder(itemView: View, listener: ClickListener) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name)

        init {
            itemView.setOnClickListener {
                listener.onClick(modules[adapterPosition])
            }
        }
    }
}