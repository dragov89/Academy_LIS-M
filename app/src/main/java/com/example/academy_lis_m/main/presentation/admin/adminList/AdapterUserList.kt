package com.example.academy_lis_m.main.presentation.admin.adminList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.academy_lis_m.R
import com.example.academy_lis_m.main.domain.User
import com.example.adminpanel.presentation.callback.UserItemDiffCallback

class AdapterUserList : ListAdapter<User,
        AdapterUserList.UserViewHolder>(UserItemDiffCallback()) {

    class UserViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvLogin = view.findViewById<TextView>(R.id.tv_login)
    }

    var onUserClickLongListener: ((User) -> Unit)? = null
    var onUserClickListener: ((User) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layout = when (viewType) {
            VIEW_TYPE_ENABLED -> R.layout.item_shop_enabled
            VIEW_TYPE_DISABLED -> R.layout.item_shop_disabled
            else -> throw RuntimeException("View type unknown $viewType AdapterUserList ")
        }
        val view =
            LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val userItem = getItem(position)
        holder.tvName.text = userItem.name
        holder.tvLogin.text = userItem.login
        holder.view.setOnLongClickListener {
            onUserClickLongListener?.invoke(userItem)
            true
        }
        holder.view.setOnClickListener {
            onUserClickListener?.invoke(userItem)
        }
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return if (item.status) {
            VIEW_TYPE_ENABLED
        } else {
            VIEW_TYPE_DISABLED
        }
    }

    companion object {
        const val VIEW_TYPE_ENABLED = 103
        const val VIEW_TYPE_DISABLED = 104
        const val MAX_POL = 10

    }
}