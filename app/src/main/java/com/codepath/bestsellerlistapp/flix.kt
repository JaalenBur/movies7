package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

class flix {


    @JvmField
    @SerializedName("title")
    var title: String? = null


    @SerializedName("poster_path")
    var movieImageUrl: String? = null


    @SerializedName("overview")
    var description: String? = null

    @SerializedName("backdrop_path")
    var backdrop: String? = null

}