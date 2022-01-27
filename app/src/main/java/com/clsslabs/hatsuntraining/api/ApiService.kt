package com.clsslabs.hatsuntraining.api

import com.clsslabs.hatsuntraining.model.Building
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("getTrainingCenters")
    fun getBuilding(): Call<Building>

}