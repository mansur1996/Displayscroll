package com.example.displayscroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dingmouren.layoutmanagergroup.skidright.SkidRightLayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var mRightLayoutManager: SkidRightLayoutManager
    private var pagerList : ArrayList<Pager> = ArrayList()
    private val adapter by lazy { PagerAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI(){
        recyclerView = findViewById(R.id.recycler_view)
        mRightLayoutManager = SkidRightLayoutManager(1.5F,0.85F)
        recyclerView.layoutManager = mRightLayoutManager
        setData()
        adapter.submitList(pagerList)
        recyclerView.adapter = adapter
    }

    private fun setData(){

        pagerList.add(Pager(R.drawable.img_scinary, "Something"))
        pagerList.add(Pager(R.drawable.img_android, "Something"))
        pagerList.add(Pager(R.drawable.img_scinery1, "Something"))
        pagerList.add(Pager(R.drawable.img_asus, "Something"))
        pagerList.add(Pager(R.drawable.img_cplus, "Something"))
        pagerList.add(Pager(R.drawable.img_scinary3, "Something"))
        pagerList.add(Pager(R.drawable.img_csharf, "Something"))
        pagerList.add(Pager(R.drawable.img_html5, "Something"))
        pagerList.add(Pager(R.drawable.img_java, "Something"))
        pagerList.add(Pager(R.drawable.img_kotlin, "Something"))
        pagerList.add(Pager(R.drawable.img_photo, "Something"))
        pagerList.add(Pager(R.drawable.img_scinary, "Something"))
        pagerList.add(Pager(R.drawable.img_scinary3, "Something"))
        pagerList.add(Pager(R.drawable.img_scinery1, "Something"))
        pagerList.add(Pager(R.drawable.img_visualstudio, "Something"))
    }
}