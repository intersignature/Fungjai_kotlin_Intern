package intern.kotlin.fungjai.sirichai.fungjaiintern.api

import intern.kotlin.fungjai.sirichai.fungjaiintern.utilities.Constants
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FungjaiInternApiManager {

    private var service: Service? = null

    fun getFungjaiInternApi(): Service? {
        if (service == null) {
            val client: OkHttpClient = OkHttpClient
                    .Builder()
                    .build()

            val retrofit = Retrofit.Builder()
                    .client(client)
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            service = retrofit.create(Service::class.java)
        }
        return service
    }
}