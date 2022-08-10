package ramizbek.aliyev.restapi.retrofit

import ramizbek.aliyev.restapi.models.MyMoney
import retrofit2.Call
import retrofit2.http.GET

interface MyRetrofitService {
    @GET("json")
    fun getMonies(): Call<List<MyMoney>>

}