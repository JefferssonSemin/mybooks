package com.example.nybooks.data

import com.example.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NBServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "xFsDHnqanJFe0f4bJRvAkRv5dVuuGjY2",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}