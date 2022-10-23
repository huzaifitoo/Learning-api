package com.example.learningclasses.products.utils;

import com.example.learningclasses.products.models.ProductResponseModelitem;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductsApiInterface {

    @GET("products/{id}")
    Call<ProductResponseModelitem> getProductInfo(
            @Path("id") int id
    );

}
