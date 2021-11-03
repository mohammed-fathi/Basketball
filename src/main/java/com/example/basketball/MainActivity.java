package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.basketball.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int teamA=0 ,teamB=0;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setLifecycleOwner(this);
        teamA_1();
        teamA_2();
        teamA_3();
        teamB_1();
        teamB_2();
        teamB_3();
        reset();
    }
    private void teamA_3(){
        binding.teamA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = teamA+3;
                binding.teamATv.setText(""+teamA);
            }
        });
    }
    private void teamA_2(){
        binding.teamA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = teamA+2;
                binding.teamATv.setText(""+teamA);
            }
        });
    }
    private void teamA_1(){
        binding.teamA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA = teamA+1;
                binding.teamATv.setText(""+teamA);
            }
        });
    }
    private void teamB_3(){
        binding.teamB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB = teamB+3;
                binding.teamBTv.setText(""+teamB);
            }
        });
    }
    private void teamB_2(){
        binding.teamB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB = teamB+2;
                binding.teamBTv.setText(""+teamB);
            }
        });
    }
    private void teamB_1(){
        binding.teamB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB = teamB+1;
                binding.teamBTv.setText(""+teamB);
            }
        });
    }
    private void reset(){
        binding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA=0;
                teamB=0;
                binding.teamATv.setText(""+teamA);
                binding.teamBTv.setText(""+teamB);
            }
        });
    }
}