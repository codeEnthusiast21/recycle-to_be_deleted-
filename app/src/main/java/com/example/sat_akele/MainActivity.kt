package com.example.sat_akele

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var myRecyclerView :RecyclerView
    private lateinit var newsAList: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recylerV)
        val newsIA = arrayOf(
            R.drawable.satp,
            R.drawable.satp1,
            R.drawable.satp2,
            R.drawable.satp3,
            R.drawable.satp4,
            R.drawable.satp6,
            R.drawable.satp,
            R.drawable.satp1,
            R.drawable.satp2,
            R.drawable.satp3,
            R.drawable.satp4,
            R.drawable.satp6,
            R.drawable.satp,
            R.drawable.satp1,
            R.drawable.satp2,
            R.drawable.satp3,
            R.drawable.satp4,
            R.drawable.satp6)
        val newsHA = arrayOf ("able content of a page when looking at its layout. The making it look like readable English. Many desk"
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desk"
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desk","able content of a page when looking at its layout. The making it look like readable English. Many desk"
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desk"
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desk","able content of a page when looking at its layout. The making it look like readable English. Many desk"
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desk"
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', "
            ,"able content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desk")
        myRecyclerView.layoutManager=LinearLayoutManager(this)
        newsAList = arrayListOf()
        for(i in newsIA.indices){
            val news = News(newsHA[i],newsIA[i])
            newsAList.add(news)
        }
        myRecyclerView.adapter =MyAdapter(newsAList, this)
    }
}