package com.dandy.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mCxt:Context, var resources:Int, var mItem:List<Model>):ArrayAdapter<Model>(mCxt,resources,mItem) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater= LayoutInflater.from(mCxt)
        val view:View=layoutInflater.inflate(resources, null)

        val imageView:ImageView= view.findViewById(R.id.coreImage)
        val titleText:TextView=view.findViewById(R.id.mainView)
        val descText:TextView=view.findViewById(R.id.subView)

        var mItem:Model=mItem[position]
        imageView.setImageDrawable(mCxt.resources.getDrawable(mItem.img))
        titleText.text=mItem.title
        descText.text=mItem.description
        
        return view;
    }
}