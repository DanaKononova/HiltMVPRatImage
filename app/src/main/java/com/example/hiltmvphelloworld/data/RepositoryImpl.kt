package com.example.hiltmvphelloworld.data

import com.example.hiltmvphelloworld.data.mappers.Mapper
import com.example.hiltmvphelloworld.domain.Repository
import com.example.hiltmvphelloworld.domain.models.Info
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val mapper: Mapper, private val server: Server) :
    Repository {
    override fun getData(): Info = mapper(server.getData())
}