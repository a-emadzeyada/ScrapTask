package com.scrap.scraptask.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.Gson;
import com.scrap.scraptask.model.Response;
import com.scrap.scraptask.network.ApiServices;
import com.scrap.scraptask.network.RetrofitInstance;

import retrofit2.Call;
import retrofit2.Callback;

import static com.scrap.scraptask.model.Constant.API_KEY;
import static com.scrap.scraptask.model.Constant.BASE_URL;

public class LocationViewModel extends ViewModel {
    private MutableLiveData<Response> responseMutableLiveData;

    public LocationViewModel() {
        responseMutableLiveData = new MutableLiveData<>();
    }

    public MutableLiveData<Response> getResponseMutableLiveData() {
        return responseMutableLiveData;
    }

    public void GetLocation(String searchText) {
        ApiServices apiServices = RetrofitInstance.getRetroClient(BASE_URL).create(ApiServices.class);
        Call<String> response = apiServices.getLocation(searchText, API_KEY);
        response.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, retrofit2.Response<String> response) {
                Log.i("Location Response", response.body());
                ConvertToJason(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.i("LocationR Error", t.getMessage());
                responseMutableLiveData.postValue(null);
            }
        });
    }

    private void ConvertToJason(String response) {
        Gson gson = new Gson();
        Response mResponse = gson.fromJson(response, Response.class);
        responseMutableLiveData.postValue(mResponse);
    }
}
