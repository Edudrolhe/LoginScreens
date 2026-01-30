package com.example.loginscreens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.loginscreens.databinding.ActivityLoginHostBinding;

public class LoginHostActivity extends AppCompatActivity {

    private ActivityLoginHostBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginHostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
