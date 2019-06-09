package com.example.trabalho05

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_form_data.*

class FormDataActivity : AppCompatActivity() {

    val headlines: ArrayList<Headline> = arrayListOf<Headline>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_data)
        val adapter: HeadlineAdapter = HeadlineAdapter(this, headlines)
        list_headline.adapter = adapter

        btn_add.setOnClickListener {
            val headline = Headline.createHeadline(
                edt_title.text.toString(),
                edt_detail.text.toString()
            )
            edt_title.text.clear()
            edt_detail.text.clear()
            headlines.add(headline)
            adapter.notifyDataSetChanged()
        }

        list_headline.apply {
            setOnItemClickListener { parent, view, position, id ->
                AlertDialog.Builder(this.context)
                    .setTitle("Detalhes do Item")
                    .setMessage((getItemAtPosition(position) as Headline).detail)
                    .create()
                    .show()
            }

            setOnItemLongClickListener { parent, view, position, id ->
                headlines.removeAt(position)
                adapter.notifyDataSetChanged()
                true
            }
        }

    }
}
