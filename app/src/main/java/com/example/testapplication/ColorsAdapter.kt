package com.example.testapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ColorsAdapter(
    private val context: Context,
    private val clickListener: (Int, String) -> Unit
) :
    RecyclerView.Adapter<ColorsAdapter.ViewHolder>() {

    private var items: List<ListItem> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view, clickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun update(items: List<ListItem>) {
        this.items = items
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View, private val clickListener: (Int, String) -> Unit) :
        RecyclerView.ViewHolder(itemView) {

        fun bind(item: ListItem) {
            with(itemView) {
                icon.setBackgroundColor(item.color)
                colorTextView.setTextColor(item.color)
                colorTextView.text = item.text
                setOnClickListener { clickListener(item.color, item.text) }
            }
        }
    }
}