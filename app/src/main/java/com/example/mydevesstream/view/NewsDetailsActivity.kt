package com.example.mydevesstream.view
import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import  androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mydevesstream.R
import com.example.mydevesstream.adapter.NewsAdapter
import com.example.mydevesstream.adapter.StoryAdapter
import com.example.mydevesstream.model.storyResponse.Content
import com.example.mydevesstream.model.storyResponse.Story
import com.example.mydevesstream.utils.Resource
import com.example.mydevesstream.viewModel.NewsViewModel
import com.example.mydevesstream.viewModel.StoryViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsDetailsActivity : AppCompatActivity() {


    private lateinit var toolbar: Toolbar

    private lateinit var storyAdapter : StoryAdapter

    private lateinit var recyclerStoryList: RecyclerView

    private var storyList: ArrayList<Content> = ArrayList()

    private lateinit var storyViewModel: StoryViewModel

    private lateinit var  progressDialog: ProgressDialog

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

          toolbar  = findViewById(R.id.toolbar)
         setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.navigationIcon?.setTint(ContextCompat.getColor(this, R.color.white))
       supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_keyboard_arrow_down_24)

        storyViewModel= ViewModelProvider(this)[StoryViewModel::class.java]

        recyclerStoryList = findViewById(R.id.recyclerViewStoryList)

        progressDialog = ProgressDialog(this)
        progressDialog.setMessage("please wait...")
        progressDialog.show()

    }

    // Handle back button click
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed() // Handle the back navigation
        return true
    }

    override fun onResume() {
        super.onResume()

        val bundle: Bundle? = intent.extras

       ///get id passing
        if (bundle != null) {

        }

        storyAdapter= StoryAdapter(this@NewsDetailsActivity,storyList)

        recyclerStoryList.apply {
            setHasFixedSize(true)
            setRecycledViewPool(RecyclerView.RecycledViewPool())
            layoutManager= LinearLayoutManager(this@NewsDetailsActivity)
            adapter=storyAdapter
        }


        storyViewModel.story.observe(this@NewsDetailsActivity, Observer {

            when(it){
                is Resource.Loading -> {
                    progressDialog.show()
                }

                is Resource.Error -> {


                    progressDialog.dismiss()
                    Toast.makeText(this, "${it.message}", Toast.LENGTH_SHORT).show()
                }

                is  Resource.Success -> {

                    it.data?.let { story ->
                       // storyList.clear()
                        storyList.addAll(story.contents)
                        storyAdapter.setStoryList(storyList,it.data.heroImage.imageUrl,it.data.headline)
                    }

                    progressDialog.dismiss()



                }
            }

        })


    }
}