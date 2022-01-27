package com.clsslabs.hatsuntraining.model

import com.google.gson.annotations.SerializedName

data class Building(
    @SerializedName("rows") var rows: ArrayList<Rows> = arrayListOf(),
    @SerializedName("totalCount") var totalCount: Int
)

data class Rows(
    @SerializedName("idBuildingCode"     ) var idBuildingCode     : Int,
    @SerializedName("idTrCenterCode"     ) var idTrCenterCode     : Int,
    @SerializedName("idFromDate"         ) var idFromDate         : String,
    @SerializedName("buildingName"       ) var buildingName       : String,
    @SerializedName("toDate"             ) var toDate             : String,
    @SerializedName("status"             ) var status             : String,
    @SerializedName("createdBy"          ) var createdBy          : String,
//    @SerializedName("createdOn"          ) var createdOn          : Int?    = null,
    @SerializedName("lastChangedBy"      ) var lastChangedBy      : String,
    @SerializedName("lastChangedOn"      ) var lastChangedOn      : String,
    @SerializedName("trainingCenterName" ) var trainingCenterName : String
)
