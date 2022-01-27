import com.clsslabs.hatsuntraining.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getBuildingDetails() = apiHelper.getBuilding()
}