package com.example.orca;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
  Button signupButton ;
    EditText emailBox;
    EditText passwordBox;
    Button loginBtn;
    FirebaseAuth auth;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
signupButton=findViewById(R.id.buttonsignup);
        dialog=new ProgressDialog(this);
        dialog.setMessage("لطفا صبر کنید ...");
        auth= FirebaseAuth.getInstance();
        emailBox=findViewById(R.id.usernamelogin);
        passwordBox=findViewById(R.id.passwordlogin);
        loginBtn=findViewById(R.id.buttonlogin);

loginBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        dialog.show();
        String email,password;
        email=emailBox.getText().toString();
        password=passwordBox.getText().toString();
        auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    dialog.dismiss();
                    startActivity(new Intent(LoginActivity.this,HomeActivity.class));}
                else {
                    Toast.makeText(LoginActivity.this,task.getException().getLocalizedMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
});





       signupButton .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SigninActivity.class));
            }
        });
    }
}