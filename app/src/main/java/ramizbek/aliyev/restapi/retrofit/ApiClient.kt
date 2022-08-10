package ramizbek.aliyev.restapi.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    const val BASE_URL = "https://cbu.uz/oz/arkhiv-kursov-valyut/"

    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun apiService(): MyRetrofitService = getRetrofit().create(MyRetrofitService::class.java)

}