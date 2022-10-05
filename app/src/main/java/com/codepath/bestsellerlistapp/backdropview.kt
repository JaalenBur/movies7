package com.codepath.articlesearch

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.codepath.bestsellerlistapp.R
import com.codepath.bestsellerlistapp.flix
import com.codepath.bestsellerlistapp.movie2

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var backdropVIEW: ImageView
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actors_list)

        // TODO: Find the views for the screen
        backdropVIEW = findViewById(R.id.actorView)
        titleTextView = findViewById(R.id.actorText)

        val movie2 = intent.getSerializableExtra(ARTICLE_EXTRA) as Article

        // TODO: Set the title, byline, and abstract information from the article
        titleTextView.text = movie2.title


        // TODO: Load the media image
        Glide.with(this)
            .load(movie2.backdrop)
            .into(backdropVIEW)
    }
}