import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

   /* private const val BASE_URL = "https://portaldev.clsslabs.com/businessportal/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: com.clsslabs.hatsuntraining.api.ApiService = getRetrofit().create(com.clsslabs.hatsuntraining.api.ApiService::class.java)*/


    //response log
    var interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    private val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

    //to set header
    // okhttpBuilder
    val BASE_URL_DEV = "https://portaldev.clsslabs.com/businessportal/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL_DEV)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }
}