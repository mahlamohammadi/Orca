package com.example.orca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.orca.databinding.ActivityTransactionBinding;

import java.util.ArrayList;

public class TransactionActivity extends AppCompatActivity {
 int index=1;
    ActivityTransactionBinding binding;
    ArrayList<CategoryModel> categories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTransactionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        categories=new ArrayList<>();


        categories.add( new CategoryModel("","j","jh",""));
        categories.add( new CategoryModel("","j","jh",""));
        categories.add( new CategoryModel("","j","jh",""));


    }
}