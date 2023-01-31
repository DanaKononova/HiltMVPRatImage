package com.example.hiltmvphelloworld.domain

import com.example.hiltmvphelloworld.domain.models.Info

interface Repository {
    fun getData(): Info
}