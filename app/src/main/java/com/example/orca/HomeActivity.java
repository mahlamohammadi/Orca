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
categories.add(new CategoryModel("","بنزین","100000","https://media.istockphoto.com/vectors/car-flat-icon-vector-id1144092062?b=1&k=6&m=1144092062&s=612x612&w=0&h=zMH-_u3shpUjbCFQiewi6AhSItMmtI-MMVsayqeHRpc="));
categories.add(new CategoryModel("","بنزین","100000","https://media.istockphoto.com/vectors/car-flat-icon-vector-id1144092062?b=1&k=6&m=1144092062&s=612x612&w=0&h=zMH-_u3shpUjbCFQiewi6AhSItMmtI-MMVsayqeHRpc="));
categories.add(new CategoryModel("","بنزین","100000","https://media.istockphoto.com/vectors/car-flat-icon-vector-id1144092062?b=1&k=6&m=1144092062&s=612x612&w=0&h=zMH-_u3shpUjbCFQiewi6AhSItMmtI-MMVsayqeHRpc="));
categories.add(new CategoryModel("","بنزین","100000","https://media.istockphoto.com/vectors/car-flat-icon-vector-id1144092062?b=1&k=6&m=1144092062&s=612x612&w=0&h=zMH-_u3shpUjbCFQiewi6AhSItMmtI-MMVsayqeHRpc="));

        CategoryAdapter adapter =new CategoryAdapter(this,categories);
        binding.categoryList.setLayoutManager(new GridLayoutManager(this,1));
        binding.categoryList.setAdapter(adapter);


    }
}