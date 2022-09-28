package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

class flix {
    @SerializedName("rank")
    var rank = 0

    @JvmField
    @SerializedName("title")
    var title: String? = null


    @SerializedName("poster_path")
    var movieImageUrl: String? = null


    @SerializedName("overview")
    var description: String? = null

}