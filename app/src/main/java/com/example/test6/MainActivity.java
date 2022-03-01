package com.example.test6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.test6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initLisners();
    }

    private void initLisners() {
        binding.btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math math = new Math();
                String num1 = binding.etFirst.getText().toString();
                String num2 = binding.etSecond.getText().toString();
                String result = math.add(num1, num2);
                binding.tvResult.setText(result);

            }
        });
    }
}