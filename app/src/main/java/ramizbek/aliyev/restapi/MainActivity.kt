package ramizbek.aliyev.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ramizbek.aliyev.restapi.models.MyMoney
import ramizbek.aliyev.restapi.retrofit.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiClient.apiService().getMonies()
            .enqueue(object :Callback<List<MyMoney>>{
              
                override fun onResponse(
                    call: Call<List<MyMoney>>,
                    response: Response<List<MyMoney>>
                ) {
                    Log.d(TAG, "onResponse response: $response")
                    if (response.isSuccessful){
                        Log.d(TAG, "onResponse: ${response.body()}")
                    }
                }

                override fun onFailure(call: Call<List<MyMoney>>, t: Throwable) {
                    Log.d(TAG, "onFailure: ")
                }
            })

    }
}