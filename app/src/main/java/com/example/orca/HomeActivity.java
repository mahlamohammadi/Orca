package com.example.orca;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.orca.databinding.ActivityHomeBinding;
import com.example.orca.databinding.ActivityMainBinding;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);

        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content,new homeFragment());
        transaction.commit();

        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

                switch (i)
                {
                    case 0:
                        transaction.replace(R.id.content,new homeFragment());
                        transaction.commit();
                        break;

                    case 1:
                        transaction.replace(R.id.content,new incomeFragment());
                        transaction.commit();
                        break;



                    case  2:
                        transaction.replace(R.id.content,new costFragment());
                        transaction.commit();
                        break;


                }
                return false;
            }
        });

    }
}