package com.example.ravintolapetosenkulma   // ← make sure this matches your actual package!

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ravintolapetosenkulma.databinding.ItemMenuBinding

class MenuAdapter(private val items: List<MenuItem>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = ItemMenuBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = items[position]

        holder.binding.foodName.text = item.name
        holder.binding.foodPrice.text = item.price
        holder.binding.foodImage.setImageResource(item.image)

        holder.binding.root.setOnClickListener {
            val context = holder.binding.root.context
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("name", item.name)
            intent.putExtra("price", item.price)
            intent.putExtra("desc", item.description)
            intent.putExtra("image", item.image)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = items.size
}
