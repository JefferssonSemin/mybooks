package com.example.nybooks.data

import com.example.nybooks.data.model.Book
import retrofit2.Call
import retrofit2.http.GET

interface NBServices {
    @GET("lists.json")
    fun listRepos(): Call<List<Book>>
}