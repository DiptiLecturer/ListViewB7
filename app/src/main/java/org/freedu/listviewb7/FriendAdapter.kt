package org.freedu.listviewb7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import org.freedu.listviewb7.databinding.ItemListBinding

class FriendAdapter(
    private val context: Context, private val friendList: List<Friend>
) : BaseAdapter() {
    override fun getCount(): Int = friendList.size

    override fun getItem(position: Int): Any? = friendList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(
        position: Int, convertView: View?, parent: ViewGroup?
    ): View? {
        val binding: ItemListBinding
        val view: View

        if (convertView == null) {
            binding = ItemListBinding.inflate(LayoutInflater.from(context), parent, false)
            view = binding.root
            view.tag = binding   // ⭐ VERY IMPORTANT
        } else {
            view = convertView
            binding = view.tag as ItemListBinding
        }

        val friend = friendList[position]
        binding.nameTV.text = friend.name
        binding.descriptionTV.text = friend.description
        binding.profileCIV.setImageResource(friend.imageRes)

        return binding.root
    }

}