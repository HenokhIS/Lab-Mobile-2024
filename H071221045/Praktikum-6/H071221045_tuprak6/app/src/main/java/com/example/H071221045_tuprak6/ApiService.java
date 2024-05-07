package com.example.h071221045_tuprak6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/users")
    Call<UserResponse> getUsers(@Query("page") int page, @Query("per_page") int perPage);

    @GET("api/users")
    Call<UserResponse2> getUserById(@Query("id") int userId);


}
