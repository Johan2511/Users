package com.example.users

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Log
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.users.adapter.UserAdapter
import com.example.users.data.ApiUser
import com.example.users.data.User
import com.example.users.databinding.ActivityMainBinding
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

        val searchView = mBinding.SvUsers
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                searchView.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                val filteredData = if (newText.isNullOrEmpty()) {
                    data
                } else {
                    data.filter { user ->
                        listOf(user.name, user.username, user.email, user.phone, user.website).any {
                            it.contains(newText, true)
                        }
                    }
                }
                userAdapter.filterList(filteredData)
                return true
            }
        })
    }
}












