package com.example.autofirebase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class RateAdapter(val mctx: Context, val layoutResid:Int, val Ratelist:List<Rate>):ArrayAdapter<Rate>(mctx,layoutResid,Ratelist) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mctx)
        val view:View=layoutInflater.inflate(layoutResid,null)
        val txt_view=view.findViewById<TextView>(R.id.txt_View)
        val rate=Ratelist[position]
        txt_view.text=rate.name
        return view
    }

}