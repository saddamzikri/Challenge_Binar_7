package com.saddam.challengebinar7.data.remote.retrofit

import com.saddam.challengebinar7.data.remote.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    fun getMovie(
        @Query("api_key") apiKey: String
    ): Call<MovieResponse>
}