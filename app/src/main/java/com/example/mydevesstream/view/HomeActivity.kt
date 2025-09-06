package com.example.mydevesstream.view

import NewsData
import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mydevesstream.R
import com.example.mydevesstream.adapter.NewsAdapter
import com.example.mydevesstream.utils.CheckInternetConnection
import com.example.mydevesstream.utils.Resource
import com.example.mydevesstream.viewModel.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    private lateinit var newsAdapter : NewsAdapter

    private lateinit var recyclerMovieList: RecyclerView

    private var newsList: ArrayList<NewsData> = ArrayList()

    private lateinit var newsViewModel: NewsViewModel

    private lateinit var  progressDialog: ProgressDialog

    @Inject
    lateinit var checkInternetConnection: CheckInternetConnection

    private lateinit var  titleHome: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        newsViewModel= ViewModelProvider(this)[NewsViewModel::class.java]

        titleHome = findViewById(R.id.titleHome)

        recyclerMovieList = findViewById(R.id.recyclerView_newsList)

        progressDialog = ProgressDialog(this)
        progressDialog.setMessage("please wait...")
        progressDialog.show()


        internetConnection()
    }



    override fun onResume() {
        super.onResume()

        newsAdapter= NewsAdapter(this@HomeActivity,newsList)

        recyclerMovieList.apply {
            setHasFixedSize(true)
            setRecycledViewPool(RecyclerView.RecycledViewPool())
            layoutManager= LinearLayoutManager(this@HomeActivity)
            adapter=newsAdapter
        }


        newsViewModel.news.observe(this@HomeActivity, Observer {

            when(it){
                is Resource.Loading -> {
                    progressDialog.show()
                    //isLoading = false
                }

                is Resource.Error -> {


                    progressDialog.dismiss()
                   // isLoading = false
                    Toast.makeText(this, "${it.message}", Toast.LENGTH_SHORT).show()
                }

                is  Resource.Success -> {

                    it.data?.data?.let { it1 -> newsList.addAll(it1) }


                    newsAdapter.setNewsList(newsList)
                    progressDialog.dismiss()

                   newsAdapter.setOnItemClick(object :NewsAdapter.OnItemClickListener{

                       override fun onClick(position: Int) {

                           startActivity(Intent(this@HomeActivity, NewsDetailsActivity::class.java).apply {
                           putExtra("id", it.data?.data?.get(position)?.id)
                         //  putExtra("Title", it.data?.data?.get(position)?.headline)


                       })

                       }
                   })

                }
            }

        })



    }



    private  fun internetConnection(){

        if (checkInternetConnection.isInternetAvailable(this)) else
            Toast.makeText(this, "No Internet", Toast.LENGTH_SHORT).show()

    }
}