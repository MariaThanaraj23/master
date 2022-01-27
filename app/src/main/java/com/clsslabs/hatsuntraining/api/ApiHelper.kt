package com.clsslabs.hatsuntraining.api

class ApiHelper(private val apiService: ApiService) {

     fun getBuilding() = apiService.getBuilding()

}