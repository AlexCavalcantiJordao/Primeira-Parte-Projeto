package com.stackmobile.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TelaPrinicpal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_prinicpal);

        getSupportActionBar().hide();
    }
}