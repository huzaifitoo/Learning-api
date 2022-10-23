package com.example.learningclasses;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.learningclasses.databinding.ActivityMainBinding;
import com.example.learningclasses.network.api.RetrofitClient;
import com.example.learningclasses.products.models.ProductResponseModelitem;
import com.example.learningclasses.products.utils.ProductsApiInterface;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private ProductsApiInterface productsApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        int id = intent.getIntExtra("PRODUCT_ID", 0);



        productsApiInterface = RetrofitClient.getInstance().create(ProductsApiInterface.class);

        productsApiInterface.getProductInfo(id).enqueue(new Callback<ProductResponseModelitem>() {
            @Override
            public void onResponse(Call<ProductResponseModelitem> call, Response<ProductResponseModelitem> response) {
                setDataToViews(response.body());
            }

            @Override
            public void onFailure(Call<ProductResponseModelitem> call, Throwable t) {

            }
        });


    }

    private void setDataToViews(ProductResponseModelitem product) {

        Picasso.get().load(product.getImages().get(0)).into(binding.ivProduct);
        binding.tvTitle.setText(product.getTitle());
        binding.tvPrice.setText("$ " + String.valueOf(product.getPrice()));
        binding.tvDescription.setText(product.getDescription());
        binding.tvRating.setText(String.valueOf(product.getRating()));
        binding.tvName.setText(product.getBrand());
        Picasso.get().load(product.getImages().get(2)).into(binding.circleImageView);

    }

}