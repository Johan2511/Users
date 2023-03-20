package com.example.users

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.users.adapter.UserAdapter
import com.example.users.data.ApiUser
import com.example.users.data.User
import com.example.users.data.UserList
import com.example.users.databinding.ActivityMainBinding
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Locale.filter

class MainActivity : AppCompatActivity()  {

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager
    private lateinit var data: List<User>

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        Log.i("MainActivity", "init MI API EJEMPLO")

        val request = ApiUser.build().getUsers()
        request.enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                val user = response.body()

                if (user != null) {
                    Log.i("Manejo de data", Gson().toJson(user))
                    data = user
                    userAdapter = UserAdapter(data)
                    linearLayoutManager = LinearLayoutManager(this@MainActivity)
                    mBinding.rvUser.apply {
                        adapter = userAdapter
                        layoutManager = linearLayoutManager
                    }
                } else {
                    Log.e("MainActivity", "Response body is null")
                }
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.e("MainActivity", "mi failure", t)
            }
        })
    }
}












