package com.example.hiltmvphelloworld.data

import com.example.hiltmvphelloworld.data.models.Response
import javax.inject.Inject

class Server @Inject constructor() {
    fun getData() = Response("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXwRA_eilDnSlPtkzOyV5RfZSHsB9dsXAWWw&usqp=CAU")
}