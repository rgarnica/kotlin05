package com.example.trabalho05

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item_headline.view.*

class HeadlineAdapter(val context: Context, val dataSource: ArrayList<Headline>) : BaseAdapter() {

    val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.list_item_headline, parent, false)
        val item = getItem(position) as Headline

        rowView.apply {
            txt_code.text = item.code.toString()
            txt_title.text = item.title
            txt_detail.text = item.detail
        }
        return rowView
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return dataSource.size
    }
}