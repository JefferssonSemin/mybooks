package com.example.nybooks.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiService {

    private fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.nytimes.com/svc/books/v3/")
            .addCallAdapterFactory(MoshiConverterFactory::create)
            .build()
    }

    var service = initRetrofit().create(NBServices::class.java)
}