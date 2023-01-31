package com.example.hiltmvphelloworld.data.mappers

import com.example.hiltmvphelloworld.data.models.Response
import com.example.hiltmvphelloworld.domain.models.Info
import javax.inject.Inject

class Mapper @Inject constructor(){
    operator fun invoke(response: Response) = with(response) {
        Info(
            image = image.orEmpty()
        )
    }
}