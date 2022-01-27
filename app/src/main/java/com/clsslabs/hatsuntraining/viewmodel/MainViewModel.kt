import androidx.lifecycle.ViewModel

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

   /* fun getBuildingData() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getBuildingDetails()))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }*/
}