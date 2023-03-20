package com.example.users.data

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object ApiUser {

    //url = https://jsonplaceholder.typicode.com/users
    //baseUrl = https://jsonplaceholder.typicode.com/
    //method = users

    private val builder: Retrofit.Builder = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())


    interface RemoteService{
        @GET("/users")
        fun getUsers(): Call<List<User>>

    }

    fun build(): RemoteService {
        return builder.build().create(RemoteService::class.java)
    }


}