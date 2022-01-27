package com.clsslabs.hatsuntraining.fragment

import com.clsslabs.hatsuntraining.api.ApiService
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.clsslabs.hatsuntraining.R
import com.clsslabs.hatsuntraining.adapter.BuildingAdapter
import com.clsslabs.hatsuntraining.model.Building
import com.clsslabs.hatsuntraining.model.Rows
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BuildingFragment() : Fragment() {
    lateinit var buildingAdapter: BuildingAdapter
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.building_fragment, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        getBuildingMasterData()
        return view
    }

    fun getBuildingMasterData() {
        val request = RetrofitBuilder.buildService(ApiService::class.java)
        val call = request.getBuilding()
        call.enqueue(object : Callback<Building> {
            override fun onResponse(call: Call<Building>, response: Response<Building>) {
                Log.d("Error", "${response.body()}")
                loadBuildingAdapterData(response.body()!!.rows)
            }

            override fun onFailure(call: Call<Building>, t: Throwable) {
                Log.d("Error", "${t.message}")
            }

        })


    }

    fun loadBuildingAdapterData(rows: ArrayList<Rows>) {
        buildingAdapter = BuildingAdapter(rows)
        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = buildingAdapter
    }
}