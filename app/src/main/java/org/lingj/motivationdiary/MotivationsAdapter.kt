package org.lingj.motivationdiary

import android.content.Context
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class MotivationsAdapter(val context: Context,val motiv:List<Motivation>):RecyclerView.Adapter<MotivationsAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
    return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
         return motiv.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val pMotiv = motiv[position]
        holder.setData(pMotiv)
    }

    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun setData(m:Motivation){
            itemView.txv_motiv.text = m.motiv
        }
    }
}