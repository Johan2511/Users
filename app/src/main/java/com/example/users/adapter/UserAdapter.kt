package com.example.users.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.users.R
import com.example.users.data.User
import com.example.users.databinding.ItemUserBinding


class UserAdapter(private var users: List<User>) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private lateinit var mContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        mContext = parent.context

        val view = LayoutInflater.from(mContext).inflate(R.layout.item_user, parent, false)

        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]

        with(holder) {

            binding.tvId.text = user.id.toString()
            binding.tvName.text = user.name
            binding.tvUsername.text = user.username
            binding.tvEmail.text = user.email
            binding.tvPhone.text = user.phone
            binding.tvWebsite.text = user.website

        }
    }

    override fun getItemCount(): Int = users.size

    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val binding = ItemUserBinding.bind(view)

    }
    fun filterList(list: List<User>){
        this.users = list
        notifyDataSetChanged()
    }

}