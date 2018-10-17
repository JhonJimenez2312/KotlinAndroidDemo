package com.example.jhon.myapplication

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_desc.*
import kotlinx.android.synthetic.main.content_desc.view.*
import org.jetbrains.anko.image


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        loadUI()
    }

    fun loadUI() {

        intent?.extras?.let {

            imgHeaderDetail.setImageResource(it.getInt("image"))
            txtDetailTitulo.text = it.getString("title")
            txtDetailDesc.text = it.getString("desc")
            txtDetailPrice.text = "$ ${String.format("%.2f", it.getDouble("price"))}"
            txtDetailLongDesc.text = it.getString("descLong")
        }

    }
}
