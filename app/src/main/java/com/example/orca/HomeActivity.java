package com.example.orca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.orca.databinding.ActivityHomeBinding;
import com.example.orca.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<CategoryModel> categories=new ArrayList<>();



        CategoryAdapter adapter =new CategoryAdapter(this,categories);
        binding.categoryList.setLayoutManager(new GridLayoutManager(this,1));
        binding.categoryList.setAdapter(adapter);


    }
}