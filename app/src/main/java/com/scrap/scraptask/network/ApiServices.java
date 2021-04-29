package com.scrap.scraptask.network;

import com.scrap.scraptask.model.Response;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiServices {
    @Headers({"Accept: application/x-www-form-urlencoded"})
    @FormUrlEncoded
    @POST("msDiscoverPage")
//    Call<Response> getLocation(@Query("searchText") String searchText, @Query("apiKey") String apiKey);
    Call<String> getLocation(@Field("searchText") String searchText, @Field("apiKey") String apiKey);

}
